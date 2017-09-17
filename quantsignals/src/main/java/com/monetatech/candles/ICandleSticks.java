package com.monetatech.candles;

/**
 * Created by asimoneta on 9/17/2017.
 * Candle stick never appears alone - it's only meaningful to appear as continuous time series
 */

public interface ICandleSticks {
    ICandle getCandleFromEpoch(long timestamp);
    ICandle getCandleFromTime(int hhmmss);
    ICandle getCandleFromLongDateTime(long yyyymmddhhmmss);
    ICandle getCandleFromIndex(int index);
    int count();
}
