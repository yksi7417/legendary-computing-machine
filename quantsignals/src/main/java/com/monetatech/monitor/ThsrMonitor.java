package com.monetatech.monitor;

import com.monetatech.common.ISubscriptionManager;
import com.monetatech.signals.ThsrSignal;

import java.util.function.Consumer;

/**
 * Created by asimoneta on 9/16/2017.
 */

public class ThsrMonitor implements ITradeEventHandler, IMarketMonitor<ThsrSignal> {

    private final ISubscriptionManager<String, ThsrSignal> subscriptionManager;
    private final String symbol;

    public ThsrMonitor(String symbol, ISubscriptionManager<String, ThsrSignal> subscriptionManager) {
        this.symbol = symbol;
        this.subscriptionManager = subscriptionManager;
    }

    @Override
    public void tradeUpdate(long timestampMs, long tradeWen, long tradeSize) {
        updateTrade(timestampMs, tradeWen, tradeSize);
        ThsrSignal signal = generateSignal();
        subscriptionManager.fireEvent(symbol, signal);
    }

    private void updateTrade(long timestampMs, long tradeWen, long tradeSize){

    }

    private ThsrSignal generateSignal(){
        return null;
    }

    @Override
    public void subscribeToSignal(Consumer<ThsrSignal> consumerOfSignal) {
        subscriptionManager.subscribeAndFireSnapshotEvent(symbol, consumerOfSignal);
    }
}
