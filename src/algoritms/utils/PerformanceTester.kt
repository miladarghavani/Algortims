class PerformanceTester {

    data class PerformanceReport(
        val totalTimeMs: Double,
        val averageTimePerExecutionMs: Double,
        val memoryUsedKB: Long,
        val averageMemoryPerExecutionKB: Long,
        val peakMemoryKB: Long
    )

    companion object {
        fun measureExecution(times: Int, function: () -> Unit) {
            val runtime = Runtime.getRuntime()

            runtime.gc() // Force GC before measuring

            val memoryBefore = runtime.totalMemory() - runtime.freeMemory()
            var peakMemoryUsage = memoryBefore

            val totalTime = kotlin.system.measureNanoTime {
                repeat(times) {
                    function()
                    val currentMemory = runtime.totalMemory() - runtime.freeMemory()
                    peakMemoryUsage = maxOf(peakMemoryUsage, currentMemory)
                }
            }

            runtime.gc() // Clean up unused memory
            val memoryAfter = runtime.totalMemory() - runtime.freeMemory()

            val rawMemoryUsed = memoryAfter - memoryBefore
            val memoryUsedKB = maxOf(0, rawMemoryUsed / 1024) // prevent negative
            val peakMemoryKB = maxOf(0, (peakMemoryUsage - memoryBefore) / 1024)
            val timeInMillis = totalTime / 1_000_000.0
            val averageTime = timeInMillis / times
            val averageMemoryPerExecution = memoryUsedKB / times

            val report = PerformanceReport(
                totalTimeMs = timeInMillis,
                averageTimePerExecutionMs = averageTime,
                memoryUsedKB = memoryUsedKB,
                averageMemoryPerExecutionKB = averageMemoryPerExecution,
                peakMemoryKB = peakMemoryKB
            )

            printReport(report)
        }

        private fun printReport(report: PerformanceReport) {
            println("-------------------------------------------------------------------------")
            println("Performance Report:")
            println("Total Time: ${report.totalTimeMs} ms")
            println("Average Time per Execution: ${report.averageTimePerExecutionMs} ms")
            println("Memory Used: ${report.memoryUsedKB} KB")
            println("Average Memory per Execution: ${report.averageMemoryPerExecutionKB} KB")
            println("Peak Memory Usage: ${report.peakMemoryKB} KB")
            println("-------------------------------------------------------------------------")
        }
    }
}
