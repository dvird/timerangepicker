package com.timesliderrangepicker.library;

import java.util.Calendar;

/**
 * Listener interface used to detect when slider moves around.
 */
public interface OnSliderRangeMovedListener {
    void onChange(Calendar start, Calendar end);
}
