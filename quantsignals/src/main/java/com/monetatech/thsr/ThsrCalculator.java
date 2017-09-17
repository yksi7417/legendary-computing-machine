package com.monetatech.thsr;

import com.monetatech.calculator.ICalculator;
import com.monetatech.common.ITradeEventHandler;

/**
 * Created by asimoneta on 9/17/2017.
 */
public class ThsrCalculator implements IThsrCalculator {

    @Override
    public void tradeUpdate(long timestampMs, long tradeWen, long tradeSize) {

    }

    @Override
    public ThsrSignal calculate() {
        return null;
    }
}
