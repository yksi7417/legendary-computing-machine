package com.monetatech.monitor;

/**
 * Created by asimoneta on 9/16/2017.
 */
public interface IQuoteEventListener {
    void quoteUpdate(long timestampMs, long bidWen, long bidSize, long askWen, long askSize);
}
