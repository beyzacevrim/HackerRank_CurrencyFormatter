# Hackerrank_CurrencyFormatter

Given a double-precision number,Payment , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert Payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where formattedPayment is Payment formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).


Sample Input
12324.134

Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €


Explanation
Each line contains the value of Payment formatted according to the four countries' respective currencies.
