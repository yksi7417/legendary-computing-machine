package com.monetatech.common;

import org.joda.time.DateTime;

/**
 * Created by asimoneta on 9/16/2017.
 */

public interface IClock {
    enum Mode { AUTO, MANUAL, OFFSET }
    long getEpochTime();
    DateTime getDateTime();
    long getHHMMSS();
    long getYYYYMMDD();
}
