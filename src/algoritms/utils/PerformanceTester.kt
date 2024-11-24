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

            runtime.gc() // Force garbage collection before measurement

            val memoryBefore = runtime.totalMemory() - runtime.freeMemory()
            var peakMemoryUsage = memoryBefore

            val totalTime = kotlin.system.measureNanoTime {
                repeat(times) {
                    val currentMemory = runtime.totalMemory() - runtime.freeMemory()
                    if (currentMemory > peakMemoryUsage) {
                        peakMemoryUsage = currentMemory
                    }
                    function()
                }
            }

            runtime.gc() // Force GC again after execution to clear out unused memory
            val memoryAfter = runtime.totalMemory() - runtime.freeMemory()

            val memoryUsed = (memoryAfter - memoryBefore) / 1024 // KB
            val timeInMillis = totalTime / 1_000_000.0 // Convert nanoseconds to milliseconds
            val averageTimePerExecution = timeInMillis / times
            val averageMemoryPerExecution = memoryUsed / times
            val peakMemoryKB = (peakMemoryUsage - memoryBefore) / 1024

            val report = PerformanceReport(
                totalTimeMs = timeInMillis,
                averageTimePerExecutionMs = averageTimePerExecution,
                memoryUsedKB = memoryUsed,
                averageMemoryPerExecutionKB = averageMemoryPerExecution,
                peakMemoryKB = peakMemoryKB
            )

            // Call printReport directly at the end
            printReport(report)
        }

        // Method to print the report
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