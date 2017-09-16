package com.monetatech.monitor;

import java.util.function.Consumer;

/**
 * Created by asimoneta on 9/16/2017.
 */
public class MarketMonitor implements IMarketMonitor {

    @Override
    public void quoteUpdate(long timestampMs, long bidWen, long bidSize, long askWen, long askSize) {
        
    }

    @Override
    public void tradeUpdate(long timestampMs, long tradeWen, long tradeSize) {

    }

    @Override
    public void subscribeToSignal(Consumer consumerOfSignal) {

    }
}
