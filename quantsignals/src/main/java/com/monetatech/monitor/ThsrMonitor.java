package com.monetatech.monitor;

import com.monetatech.signals.ThsrSignal;

import java.util.function.Consumer;

/**
 * Created by asimoneta on 9/16/2017.
 */

public class ThsrMonitor implements ITradeEventHandler, IMarketMonitor<ThsrSignal> {

    @Override
    public void tradeUpdate(long timestampMs, long tradeWen, long tradeSize) {

    }

    @Override
    public void subscribeToSignal(Consumer<ThsrSignal> consumerOfSignal) {

    }
}
