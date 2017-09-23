package com.monetatech.utils;

/**
 * Created by asimoneta on 9/16/2017.
 *
 * double's rounding error causes many problems in representing price.
 * To maintain performance and accurately represent price, this system is representing currency in Wen instead of dollars.
 * Wen, is defined as 1/1000 of a dollar, as currency unit in our system.
 * Wen is traditionally smallest unit of currency in China.
 * This is also smallest spread in HKEx
 *
 * https://zh.wikipedia.org/wiki/%E6%96%87_(%E8%B2%A8%E5%B9%A3)
 * https://en.wikipedia.org/wiki/Chinese_cash_(currency_unit)
 */
public class PriceUtils {

    public static final int WENS_PER_DOLLAR = 1000;

    /***
     * epsilon is 1/10000 of a dollar
     */
    public static final double epsilon = 0.0001;

    /***
     * convert wen into dollar
     * @param wen
     * @return dollars
     */

    public static double wenToDollar(long wen) {
        return ((double) wen) / WENS_PER_DOLLAR;
    }

    /***
     * convert dollar into wen
     * @param dollar
     * @return wens
     */
    public static long dollarToWen(double dollar){
        return (long) dollar * WENS_PER_DOLLAR;
    }
}

