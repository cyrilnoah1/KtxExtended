package com.cnoah.extensions

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


/**
 * Function to replace the [Fragment] in a desired container in an [AppCompatActivity].
 * </br>
 * This function accepts an optional property named [shouldAddToBackStack], which if true,
 * adds the current [fragment] to the back stack before committing the transaction.
 */
fun AppCompatActivity.replaceFragment(
        @IdRes containerId: Int,
        fragment: Fragment,
        shouldAddToBackStack: Boolean = false,
        allowStateLoss: Boolean = false
) {

    val transaction = supportFragmentManager?.beginTransaction()?.replace(
            containerId,
            fragment,
            fragment::class.java.simpleName
    )
    if (shouldAddToBackStack) transaction?.addToBackStack(null)
    if (allowStateLoss) transaction?.commitAllowingStateLoss() else transaction?.commit()
}


/**
 * Function to replace the [Fragment] in a desired container in a [Fragment].
 * </br>
 * This function accepts an optional property named [shouldAddToBackStack], which if true,
 * adds the current [fragment] to the back stack before committing the transaction.
 */
fun Fragment.replaceFragment(
        @IdRes containerId: Int,
        fragment: Fragment,
        shouldAddToBackStack: Boolean = false,
        allowStateLoss: Boolean = false
) {

    val transaction = fragmentManager?.beginTransaction()?.replace(
            containerId,
            fragment,
            fragment::class.java.simpleName
    )
    if (shouldAddToBackStack) transaction?.addToBackStack(null)
    if (allowStateLoss) transaction?.commitAllowingStateLoss() else transaction?.commit()
}


/**
 * Function to add the [Fragment] in a desired container in an [AppCompatActivity].
 * </br>
 * This function accepts an optional property named [shouldAddToBackStack], which if true,
 * adds the current [fragment] to the back stack before committing the transaction.
 */
fun AppCompatActivity.addFragment(
        @IdRes containerId: Int,
        fragment: Fragment,
        shouldAddToBackStack: Boolean = false,
        allowStateLoss: Boolean = false
) {

    val transaction = supportFragmentManager?.beginTransaction()?.replace(
            containerId,
            fragment,
            fragment::class.java.simpleName
    )
    if (shouldAddToBackStack) transaction?.addToBackStack(null)
    if (allowStateLoss) transaction?.commitAllowingStateLoss() else transaction?.commit()
}


/**
 * Function to add the [Fragment] in a desired container in a [Fragment].
 * </br>
 * This function accepts an optional property named [shouldAddToBackStack], which if true,
 * adds the current [fragment] to the back stack before committing the transaction.
 */
fun Fragment.addFragment(
        @IdRes containerId: Int,
        fragment: Fragment,
        shouldAddToBackStack: Boolean = false,
        allowStateLoss: Boolean = false
) {

    val transaction = fragmentManager?.beginTransaction()?.replace(
            containerId,
            fragment,
            fragment::class.java.simpleName
    )
    if (shouldAddToBackStack) transaction?.addToBackStack(null)
    if (allowStateLoss) transaction?.commitAllowingStateLoss() else transaction?.commit()
}
