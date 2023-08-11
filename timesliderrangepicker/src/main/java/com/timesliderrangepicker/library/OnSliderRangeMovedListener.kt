package com.timesliderrangepicker.library

import java.util.Calendar

/**
 * Listener interface used to detect when slider moves around.
 */
interface OnSliderRangeMovedListener {
    fun onChange(start: Calendar?, end: Calendar?)
}