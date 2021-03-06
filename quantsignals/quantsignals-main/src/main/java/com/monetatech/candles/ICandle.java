package com.monetatech.candles;

/**
 * Created by asimoneta on 9/17/2017.
 */

public interface ICandle {
    long getEpoch();
    int getYYYYMMDD();
    int getHHMMSS();

    int getDurationInSeconds();

    long getOpen();
    long getHigh();
    long getLow();
    long getClose();
    long getVolume();
    long getTradeCount();
}
