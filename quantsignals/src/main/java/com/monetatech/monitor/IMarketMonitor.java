package com.monetatech.monitor;

import java.util.function.Consumer;

/**
 * Created by asimoneta on 9/16/2017.
 */
public interface IMarketMonitor<T> {
    void subscribeToSignal(Consumer<T> consumerOfSignal);
}

