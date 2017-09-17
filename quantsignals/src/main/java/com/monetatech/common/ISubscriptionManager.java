package com.monetatech.common;
import java.util.function.Consumer;

/**
 * Created by asimoneta on 9/17/2017.
 */
public interface ISubscriptionManager<KEY, SIGNAL> {
    public void fireEvent(KEY key, SIGNAL signal);
    public void subscribeAndFireSnapshotEvent(KEY key, Consumer<SIGNAL> consumerOfSignal);
}
