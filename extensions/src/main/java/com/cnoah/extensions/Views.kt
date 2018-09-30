package com.cnoah.extensions

import android.view.View

/**
 * Function to set the visibility of the [View] to [View.VISIBLE].
 * </br>
 * This function first checks the current visibility of the [View], and then
 * it performs the action.
 */
fun View.show() {
    if (visibility != View.VISIBLE) visibility = View.VISIBLE
}

/**
 * Function to set the visibility of the [View] to [View.INVISIBLE].
 * </br>
 * This function first checks the current visibility of the [View], and then
 * it performs the action.
 */
fun View.hide() {
    if (visibility != View.INVISIBLE) visibility = View.INVISIBLE
}

/**
 * Function to set the visibility of the [View] to [View.GONE].
 * </br>
 * This function first checks the current visibility of the [View], and then
 * it performs the action.
 */
fun View.gone() {
    if (visibility != View.GONE) visibility = View.GONE
}

/**
 * Function to check if a [View] is [View.VISIBLE].
 */
fun View.isVisible() = (visibility == View.VISIBLE)

/**
 * Function to check if a [View] is [View.GONE].
 */
fun View.isGone() = (visibility == View.GONE)

/**
 * Function to check if a [View] is [View.INVISIBLE].
 */
fun View.isInvisible() = (visibility == View.INVISIBLE)