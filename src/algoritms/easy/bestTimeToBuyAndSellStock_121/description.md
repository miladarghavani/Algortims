package com.example.algoritms.easy.longestCommonPrefix

35-Best Time to Buy and Sell Stock

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

``` leetCode
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4


 ```

 ```guid
    To maximize your profit, you need to find the best day to buy and the best day to sell the stock.
    
    Here are a few steps to guide your thinking:
    Track the Minimum Price: As you go through each day's price, keep track of the lowest price you've seen so far.
    This would be the best day to buy the stock up to that point.
    
    Calculate Potential Profit: For each day's price,
    calculate the potential profit if you were to sell the stock on that day, given the lowest price you've seen so far.
    
    Update Maximum Profit: Keep track of the maximum profit you've calculated during this process.
    Remember, you need to buy the stock before you sell it, so ensure your buy day is before your sell day.
 ```