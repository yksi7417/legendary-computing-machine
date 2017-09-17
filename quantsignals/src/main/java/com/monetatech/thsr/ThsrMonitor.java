package com.monetatech.thsr;

/**
 * Created by asimoneta on 9/17/2017.
 */

import com.monetatech.common.ISubscriptionManager;
import com.monetatech.common.ITradeEventHandler;
import com.monetatech.monitor.IMarketMonitor;

import java.util.function.Consumer;

public class ThsrMonitor implements ITradeEventHandler, IMarketMonitor<ThsrSignal> {

    private final String symbol;
    private final ISubscriptionManager<String, ThsrSignal> subscriptionManager;
    private final IThsrCalculator calculator;

    public ThsrMonitor(String symbol,
                       ISubscriptionManager<String, ThsrSignal> subscriptionManager,
                       IThsrCalculator calculator) {
        this.symbol = symbol;
        this.subscriptionManager = subscriptionManager;
        this.calculator = calculator;
    }

    @Override
    public void tradeUpdate(long timestampMs, long tradeWen, long tradeSize) {
        calculator.tradeUpdate(timestampMs, tradeWen, tradeSize);
        ThsrSignal signal = calculator.calculate();
        subscriptionManager.fireEvent(symbol, signal);
    }

    @Override
    public void subscribeToSignal(Consumer<ThsrSignal> consumerOfSignal) {
        subscriptionManager.subscribeAndFireSnapshotEvent(symbol, consumerOfSignal);
    }
}
