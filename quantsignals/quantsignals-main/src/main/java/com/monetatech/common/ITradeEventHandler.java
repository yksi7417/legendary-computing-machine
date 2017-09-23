package com.monetatech.common;

/**
 * Created by asimoneta on 9/16/2017.
 */
public interface ITradeEventHandler {
    void tradeUpdate(long timestampMs, long tradeWen, long tradeSize);
}
