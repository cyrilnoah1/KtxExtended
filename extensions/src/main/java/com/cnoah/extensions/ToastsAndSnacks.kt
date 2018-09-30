package com.cnoah.extensions


import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

/**
 * Function to display a [Toast] on the screen for a [Toast.LENGTH_LONG] period of time.
 * </br>
 * The user can provide [gravity] to position the [Toast] at a desired place on the screen,
 * and here, the user does not have to provide [xOffset] and [yOffSet] if there to be set to zero.
 */
fun AppCompatActivity.showLongToast(
        message: String,
        gravity: Int? = null,
        xOffset: Int? = null,
        yOffSet: Int? = null
) {
    val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
    gravity?.let { toast?.setGravity(it, xOffset ?: 0, yOffSet ?: 0) }
    toast.show()
}

/**
 * Function to display a [Toast] on the screen for a [Toast.LENGTH_LONG] period of time.
 * </br>
 * The user can provide [gravity] to position the [Toast] at a desired place on the screen,
 * and here, the user does not have to provide [xOffset] and [yOffSet] if there to be set to zero.
 */
fun Fragment.showLongToast(
        message: String,
        gravity: Int? = null,
        xOffset: Int? = null,
        yOffSet: Int? = null
) {
    val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
    gravity?.let { toast?.setGravity(it, xOffset ?: 0, yOffSet ?: 0) }
    toast.show()
}

/**
 * Function to display a [Toast] on the screen for a [Toast.LENGTH_SHORT] period of time.
 * </br>
 * The user can provide [gravity] to position the [Toast] at a desired place on the screen,
 * and here, the user does not have to provide [xOffset] and [yOffSet] if there to be set to zero.
 */
fun AppCompatActivity.showShortToast(
        message: String,
        gravity: Int? = null,
        xOffset: Int? = null,
        yOffSet: Int? = null
) {
    val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
    gravity?.let { toast?.setGravity(it, xOffset ?: 0, yOffSet ?: 0) }
    toast.show()
}

/**
 * Function to display a [Toast] on the screen for a [Toast.LENGTH_SHORT] period of time.
 * </br>
 * The user can provide [gravity] to position the [Toast] at a desired place on the screen,
 * and here, the user does not have to provide [xOffset] and [yOffSet] if there to be set to zero.
 */
fun Fragment.showShortToast(
        message: String,
        gravity: Int? = null,
        xOffset: Int? = null,
        yOffSet: Int? = null
) {
    val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
    gravity?.let { toast?.setGravity(it, xOffset ?: 0, yOffSet ?: 0) }
    toast.show()
}

/**
 * Function to display a [Snackbar] on the screen.
 */
fun showSnackBar(
        parent: View,
        message: String,
        duration: Int = Snackbar.LENGTH_SHORT,
        actionText: String? = null,
        action: View.OnClickListener? = null
): Snackbar {

    val snack = Snackbar.make(parent, message, duration)
    // Action that needs to be performed when the
    action?.let { snack.setAction(actionText ?: "Action", it) }
    snack.show()

    return snack
}
