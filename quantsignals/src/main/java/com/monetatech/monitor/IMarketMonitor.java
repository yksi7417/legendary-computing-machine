package com.monetatech.monitor;

/**
 * Created by asimoneta on 9/16/2017.
 */
public interface IMarketMonitor {
    void quoteUpdate(String symbol, long bidWen, long bidSize, long askWen, long askSize);
    void tradeUpdate(String symbol, long tradeWen, long tradeSize);
    void subscribeToSignal(Runnable callable);
}

