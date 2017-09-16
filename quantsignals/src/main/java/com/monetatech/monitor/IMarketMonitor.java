package com.monetatech.monitor;

import java.util.function.Consumer;

/**
 * Created by asimoneta on 9/16/2017.
 */
public interface IMarketMonitor<T> {
    void quoteUpdate(long timestampMs, long bidWen, long bidSize, long askWen, long askSize);
    void tradeUpdate(long timestampMs, long tradeWen, long tradeSize);
    void subscribeToSignal(Consumer<T> consumerOfSignal);
}

