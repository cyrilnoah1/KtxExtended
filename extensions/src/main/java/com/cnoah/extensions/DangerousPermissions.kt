package com.cnoah.extensions

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

// Calendar permission request codes.
private const val CALENDAR_PERMISSIONS_REQUEST_CODE = 10000000
private const val READ_CALENDAR_PERMISSION_REQUEST_CODE = 10000001
private const val WRITE_CALENDAR_PERMISSION_REQUEST_CODE = 10000002

// Call Log permissions request codes.
private const val CALL_LOG_PERMISSIONS_REQUEST_CODE = 20000000
private const val READ_CALL_LOG_PERMISSION_REQUEST_CODE = 20000001
private const val WRITE_CALL_LOG_PERMISSIONS_REQUEST_CODE = 20000002
private const val PROCESS_OUTGOING_CALLS_PERMISSION_REQUEST_CODE = 20000003

// Camera permission request code.
private const val CAMERA_PERMISSION_REQUEST_CODE = 30000000

// Contacts permissions request codes.
private const val CONTACTS_PERMISSIONS_REQUEST_CODE = 40000000
private const val READ_CONTACTS_PERMISSION_REQUEST_CODE = 40000001
private const val WRITE_CONTACTS_PERMISSION_REQUEST_CODE = 40000002
private const val GET_ACCOUNTS_PERMISSION_REQUEST_CODE = 40000003

// Location permissions request codes.
private const val LOCATION_PERMISSIONS_REQUEST_CODE = 50000000
private const val ACCESS_FINE_LOCATION_PERMISSION_REQUEST_CODE = 50000001
private const val ACCESS_COARSE_LOCATION_PERMISSION_REQUEST_CODE = 50000002

// Microphone permissions request codes.
private const val MICROPHONE_PERMISSIONS_REQUEST_CODE = 60000000
private const val RECORD_AUDIO_PERMISSION_REQUEST_CODE = 60000001

// Phone permissions request codes.
private const val PHONE_PERMISSIONS_REQUEST_CODE = 70000000
private const val READ_PHONE_STATE_PERMISSION_REQUEST_CODE = 70000001
private const val READ_PHONE_NUMBERS_PERMISSION_REQUEST_CODE = 70000002
private const val CALL_PHONE_PERMISSION_REQUEST_CODE = 70000003
private const val ANSWER_PHONE_CALLS_PERMISSION_REQUEST_CODE = 70000004
private const val ADD_VOICEMAIL_PERMISSION_REQUEST_CODE = 70000005
private const val USE_SIP_PERMISSION_REQUEST_CODE = 70000006

// Sensors permissions request codes.
private const val SENSORS_PERMISSIONS_REQUEST_CODE = 80000000
private const val BODY_SENSORS_PERMISSION_REQUEST_CODE = 80000001

// SMS permissions request codes.
private const val SMS_PERMISSIONS_REQUEST_CODE = 90000000
private const val SEND_SMS_PERMISSION_REQUEST_CODE = 90000001
private const val RECEIVE_SMS_PERMISSION_REQUEST_CODE = 90000002
private const val READ_SMS_PERMISSION_REQUEST_CODE = 90000003
private const val RECEIVE_WAP_PUSH_PERMISSION_REQUEST_CODE = 90000004
private const val RECEIVE_MMS_PERMISSION_REQUEST_CODE = 90000005

// Storage permissions request codes.
private const val STORAGE_PERMISSIONS_REQUEST_CODE = 100000000
private const val READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 100000001
private const val WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 100000002

/*
CALENDER PERMISSIONS -------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission_group.CALENDAR] permissions are
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permissions being
 * granted respectively.
 */
@RequiresApi(17)
fun Context.checkCalendarPermissions(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission_group.CALENDAR
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission_group.CALENDAR] permissions
 */
@RequiresApi(17)
fun AppCompatActivity.requestCalendarPermissions(
        requestCode: Int = CALENDAR_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkCalendarPermissions()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission_group.CALENDAR),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission_group.CALENDAR] permissions
 */
@RequiresApi(17)
fun Fragment.requestCalendarPermissions(
        requestCode: Int = CALENDAR_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {
        if (!it.checkCalendarPermissions()) {
            requestPermissions(
                    arrayOf(Manifest.permission_group.CALENDAR),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.READ_CALENDAR] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkReadCalendarPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_CALENDAR
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.READ_CALENDAR] permission.
 */
fun AppCompatActivity.requestReadCalendarPermission(
        requestCode: Int = READ_CALENDAR_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReadCalendarPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_CALENDAR),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.READ_CALENDAR] permission.
 */
fun Fragment.requestReadCalendarPermission(
        requestCode: Int = READ_CALENDAR_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReadCalendarPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.READ_CALENDAR),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.WRITE_CALENDAR] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkWriteCalendarPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.WRITE_CALENDAR
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.WRITE_CALENDAR] permission.
 */
fun AppCompatActivity.requestWriteCalendarPermission(
        requestCode: Int = WRITE_CALENDAR_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkWriteCalendarPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_CALENDAR),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.WRITE_CALENDAR] permission.
 */
fun Fragment.requestWriteCalendarPermission(
        requestCode: Int = WRITE_CALENDAR_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkWriteCalendarPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.WRITE_CALENDAR),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
CALL LOG PERMISSIONS -------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission_group.CALL_LOG] permissions are
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permissions being
 * granted respectively.
 */
@RequiresApi(28)
fun Context.checkCallLogPermissions(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission_group.CALL_LOG
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission_group.CALL_LOG] permissions.
 */
@RequiresApi(28)
fun AppCompatActivity.requestCallLogPermissions(
        requestCode: Int = CALL_LOG_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkCallLogPermissions()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission_group.CALL_LOG),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission_group.CALL_LOG] permissions.
 */
@RequiresApi(28)
fun Fragment.requestCallLogPermissions(
        requestCode: Int = CALL_LOG_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkCallLogPermissions()) {
            requestPermissions(
                    arrayOf(Manifest.permission_group.CALL_LOG),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.READ_CALL_LOG] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(16)
fun Context.checkReadCallLogPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_CALL_LOG
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.READ_CALL_LOG] permission.
 */
@RequiresApi(16)
fun AppCompatActivity.requestReadCallLogPermission(
        requestCode: Int = READ_CALL_LOG_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReadCallLogPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_CALL_LOG),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.READ_CALL_LOG] permission.
 */
@RequiresApi(16)
fun Fragment.requestReadCallLogPermission(
        requestCode: Int = READ_CALL_LOG_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReadCallLogPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.READ_CALL_LOG),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.WRITE_CALL_LOG] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(16)
fun Context.checkWriteCallLogPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.CAMERA
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.WRITE_CALL_LOG] permission.
 */
@RequiresApi(16)
fun AppCompatActivity.requestWriteCallLogPermission(
        requestCode: Int = WRITE_CALL_LOG_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkWriteCallLogPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_CALL_LOG),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.WRITE_CALL_LOG] permission.
 */
@RequiresApi(16)
fun Fragment.requestWriteCallLogPermission(
        requestCode: Int = WRITE_CALL_LOG_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkWriteCallLogPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.WRITE_CALL_LOG),
                    requestCode
            )
        }
    }
}


/**
 * Extension function to check whether the [Manifest.permission.PROCESS_OUTGOING_CALLS] permission
 * is granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkProcessOutgoingCallsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.CAMERA
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.CAMERA] permission.
 */
fun AppCompatActivity.requestProcessOutgoingCallsPermission(
        requestCode: Int = PROCESS_OUTGOING_CALLS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkProcessOutgoingCallsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.PROCESS_OUTGOING_CALLS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.CAMERA] permission.
 */
fun Fragment.requestProcessOutgoingCallsPermission(
        requestCode: Int = PROCESS_OUTGOING_CALLS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkProcessOutgoingCallsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.PROCESS_OUTGOING_CALLS),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
CAMERA PERMISSIONS ---------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission.CAMERA] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkCameraPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.CAMERA
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.CAMERA] permission.
 */
fun AppCompatActivity.requestCameraPermission(
        requestCode: Int = CAMERA_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkCameraPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                requestCode
        )
    }
}


/**
 * Extension function to request for [Manifest.permission.CAMERA] permission.
 */
fun Fragment.requestCameraPermission(
        requestCode: Int = CAMERA_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkCameraPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.CAMERA),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */


/*
CONTACTS PERMISSIONS -------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission_group.CONTACTS] permissions are
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permissions being
 * granted respectively.
 */
@RequiresApi(23)
fun Context.checkContactsPermissions(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission_group.CONTACTS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission_group.CONTACTS] permissions.
 */
@RequiresApi(23)
fun AppCompatActivity.requestContactsPermissions(
        requestCode: Int = CONTACTS_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkContactsPermissions()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission_group.CONTACTS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission_group.CONTACTS] permissions.
 */
@RequiresApi(23)
fun Fragment.requestContactsPermissions(
        requestCode: Int = CONTACTS_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkContactsPermissions()) {
            requestPermissions(
                    arrayOf(Manifest.permission_group.CONTACTS),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.READ_CONTACTS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkReadContactsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.CAMERA
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.READ_CONTACTS] permission.
 */
fun AppCompatActivity.requestReadContactsPermission(
        requestCode: Int = READ_CONTACTS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReadContactsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_CONTACTS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.READ_CONTACTS] permission.
 */
fun Fragment.requestReadContactsPermission(
        requestCode: Int = READ_CONTACTS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReadContactsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.READ_CONTACTS),
                    requestCode
            )
        }
    }
}


/**
 * Extension function to check whether the [Manifest.permission.WRITE_CONTACTS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkWriteContactsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.WRITE_CONTACTS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.WRITE_CONTACTS] permission.
 */
fun AppCompatActivity.requestWriteContactsPermission(
        requestCode: Int = WRITE_CONTACTS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkWriteContactsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_CONTACTS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.WRITE_CONTACTS] permission.
 */
fun Fragment.requestWriteContactsPermission(
        requestCode: Int = WRITE_CONTACTS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkWriteContactsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.WRITE_CONTACTS),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.GET_ACCOUNTS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkGetAccountsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.GET_ACCOUNTS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.GET_ACCOUNTS] permission.
 */
fun AppCompatActivity.requestGetAccountsPermission(
        requestCode: Int = GET_ACCOUNTS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkGetAccountsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.GET_ACCOUNTS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.GET_ACCOUNTS] permission.
 */
fun Fragment.requestGetAccountsPermission(
        requestCode: Int = GET_ACCOUNTS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkGetAccountsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.GET_ACCOUNTS),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
LOCATION PERMISSIONS -------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission.ACCESS_FINE_LOCATION] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkAccessFineLocationPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.ACCESS_FINE_LOCATION] permission.
 */
fun AppCompatActivity.requestAccessFineLocationPermission(
        requestCode: Int = ACCESS_FINE_LOCATION_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkAccessFineLocationPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.ACCESS_FINE_LOCATION] permission.
 */
fun Fragment.requestAccessFineLocationPermission(
        requestCode: Int = ACCESS_FINE_LOCATION_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkAccessFineLocationPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.ACCESS_COARSE_LOCATION] permission
 * is granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkAccessCoarseLocationPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.ACCESS_COARSE_LOCATION] permission.
 */
fun AppCompatActivity.requestAccessCoarseLocationPermission(
        requestCode: Int = ACCESS_COARSE_LOCATION_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkAccessCoarseLocationPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.ACCESS_COARSE_LOCATION] permission.
 */
fun Fragment.requestAccessCoarseLocationPermission(
        requestCode: Int = ACCESS_COARSE_LOCATION_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkAccessCoarseLocationPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
MICROPHONE PERMISSIONS -----------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission.RECORD_AUDIO] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkRecordAudioPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.CAMERA
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.RECORD_AUDIO] permission.
 */
fun AppCompatActivity.requestRecordAudioPermission(
        requestCode: Int = RECORD_AUDIO_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkRecordAudioPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.RECORD_AUDIO),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.RECORD_AUDIO] permission.
 */
fun Fragment.requestRecordAudioPermission(
        requestCode: Int = RECORD_AUDIO_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkRecordAudioPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.RECORD_AUDIO),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
PHONE PERMISSIONS ----------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission_group.PHONE] permissions are
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(23)
fun Context.checkPhonePermissions(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission_group.PHONE
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission_group.PHONE] permissions.
 */
@RequiresApi(23)
fun AppCompatActivity.requestPhonePermissions(
        requestCode: Int = PHONE_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkPhonePermissions()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission_group.PHONE),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission_group.PHONE] permissions.
 */
@RequiresApi(23)
fun Fragment.requestPhonePermissions(
        requestCode: Int = PHONE_PERMISSIONS_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkPhonePermissions()) {
            requestPermissions(
                    arrayOf(Manifest.permission_group.PHONE),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.READ_PHONE_STATE] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkReadPhoneStatePermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_PHONE_STATE
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.READ_PHONE_STATE] permission.
 */
fun AppCompatActivity.requestReadPhoneStatePermission(
        requestCode: Int = READ_PHONE_STATE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReadPhoneStatePermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_PHONE_STATE),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.READ_PHONE_STATE] permission.
 */
fun Fragment.requestReadPhoneStatePermission(
        requestCode: Int = READ_PHONE_STATE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReadPhoneStatePermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.READ_PHONE_STATE),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.READ_PHONE_NUMBERS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(26)
fun Context.checkReadPhoneNumbersPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_PHONE_NUMBERS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.READ_PHONE_NUMBERS] permission.
 */
@RequiresApi(26)
fun AppCompatActivity.requestReadPhoneNumbersPermission(
        requestCode: Int = READ_PHONE_NUMBERS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReadPhoneNumbersPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_PHONE_NUMBERS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.READ_PHONE_NUMBERS] permission.
 */
@RequiresApi(26)
fun Fragment.requestReadPhoneNumbersPermission(
        requestCode: Int = READ_PHONE_NUMBERS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReadPhoneNumbersPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.READ_PHONE_NUMBERS),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.CALL_PHONE] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkCallPhonePermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.CALL_PHONE
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.CALL_PHONE] permission.
 */
fun AppCompatActivity.requestCallPhonePermission(
        requestCode: Int = CALL_PHONE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkCallPhonePermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CALL_PHONE),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.CALL_PHONE] permission.
 */
fun Fragment.requestCallPhonePermission(
        requestCode: Int = CALL_PHONE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkCallPhonePermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.CALL_PHONE),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.ANSWER_PHONE_CALLS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(26)
fun Context.checkAnswerPhoneCallsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.ANSWER_PHONE_CALLS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.ANSWER_PHONE_CALLS] permission.
 */
@RequiresApi(26)
fun AppCompatActivity.requestAnswerPhoneCallsPermission(
        requestCode: Int = ANSWER_PHONE_CALLS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkAnswerPhoneCallsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ANSWER_PHONE_CALLS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.ANSWER_PHONE_CALLS] permission.
 */
@RequiresApi(26)
fun Fragment.requestAnswerPhoneCallsPermission(
        requestCode: Int = ANSWER_PHONE_CALLS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkAnswerPhoneCallsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.ANSWER_PHONE_CALLS),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.ADD_VOICEMAIL] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkAddVoiceMailPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.ADD_VOICEMAIL
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.ADD_VOICEMAIL] permission.
 */
fun AppCompatActivity.requestAddVoicemailPermission(
        requestCode: Int = ADD_VOICEMAIL_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkAddVoiceMailPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ADD_VOICEMAIL),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.ADD_VOICEMAIL] permission.
 */
fun Fragment.requestAddVoicemailPermission(
        requestCode: Int = ADD_VOICEMAIL_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkAddVoiceMailPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.ADD_VOICEMAIL),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.USE_SIP] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkUseSipPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_PHONE_STATE
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.USE_SIP] permission.
 */
fun AppCompatActivity.requestUseSipPermission(
        requestCode: Int = USE_SIP_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkUseSipPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.USE_SIP),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.USE_SIP] permission.
 */
fun Fragment.requestUseSipPermission(
        requestCode: Int = USE_SIP_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkUseSipPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.USE_SIP),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
SENSORS PERMISSIONS --------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission.BODY_SENSORS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(20)
fun Context.checkBodySensorsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.BODY_SENSORS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.BODY_SENSORS] permission.
 */
@RequiresApi(20)
fun AppCompatActivity.requestBodySensorsPermission(
        requestCode: Int = BODY_SENSORS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkBodySensorsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.BODY_SENSORS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.BODY_SENSORS] permission.
 */
@RequiresApi(20)
fun Fragment.requestBodySensorsPermission(
        requestCode: Int = BODY_SENSORS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkBodySensorsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.BODY_SENSORS),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
SMS PERMISSIONS ------------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission.SEND_SMS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkSendSmsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.SEND_SMS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.SEND_SMS] permission.
 */
fun AppCompatActivity.requestSendSmsPermission(
        requestCode: Int = SEND_SMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkSendSmsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.SEND_SMS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.SEND_SMS] permission.
 */
fun Fragment.requestSendSmsPermission(
        requestCode: Int = SEND_SMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkSendSmsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.SEND_SMS),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.RECEIVE_SMS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkReceiveSmsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.RECEIVE_SMS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.RECEIVE_SMS] permission.
 */
fun AppCompatActivity.requestReceiveSmsPermission(
        requestCode: Int = RECEIVE_SMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReceiveSmsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.RECEIVE_SMS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.RECEIVE_SMS] permission.
 */
fun Fragment.requestReceiveSmsPermission(
        requestCode: Int = RECEIVE_SMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReceiveSmsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.RECEIVE_SMS),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.READ_SMS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkReadSmsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_SMS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.READ_SMS] permission.
 */
fun AppCompatActivity.requestReadSmsPermission(
        requestCode: Int = READ_SMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReadSmsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_SMS),
                requestCode
        )
    }
}


/**
 * Extension function to request for [Manifest.permission.READ_SMS] permission.
 */
fun Fragment.requestReadSmsPermission(
        requestCode: Int = READ_SMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReadSmsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.READ_SMS),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.RECEIVE_WAP_PUSH] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkReceiveWapPushPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.RECEIVE_WAP_PUSH
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.RECEIVE_WAP_PUSH] permission.
 */
fun AppCompatActivity.requestReceiveWapPushPermission(
        requestCode: Int = RECEIVE_WAP_PUSH_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReceiveWapPushPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.RECEIVE_WAP_PUSH),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.RECEIVE_WAP_PUSH] permission.
 */
fun Fragment.requestReceiveWapPushPermission(
        requestCode: Int = RECEIVE_WAP_PUSH_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReceiveWapPushPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.RECEIVE_WAP_PUSH),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.RECEIVE_MMS] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
fun Context.checkReceiveMmsPermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.RECEIVE_MMS
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.RECEIVE_MMS] permission.
 */
fun AppCompatActivity.requestReceiveMmsPermission(
        requestCode: Int = RECEIVE_MMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReceiveMmsPermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.RECEIVE_MMS),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.RECEIVE_MMS] permission.
 */
fun Fragment.requestReceiveMmsPermission(
        requestCode: Int = RECEIVE_MMS_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReceiveMmsPermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.RECEIVE_MMS),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */

/*
STORAGE PERMISSIONS --------------------------------------------------------------------------------
 */

/**
 * Extension function to check whether the [Manifest.permission.READ_EXTERNAL_STORAGE] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(16)
fun Context.checkReadExternalStoragePermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_EXTERNAL_STORAGE
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.READ_EXTERNAL_STORAGE] permission.
 */
@RequiresApi(16)
fun AppCompatActivity.requestReadExternalStoragePermission(
        requestCode: Int = READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkReadExternalStoragePermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.READ_EXTERNAL_STORAGE] permission.
 */
@RequiresApi(16)
fun Fragment.requestReadExternalStoragePermission(
        requestCode: Int = READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkReadExternalStoragePermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                    requestCode
            )
        }
    }
}

/**
 * Extension function to check whether the [Manifest.permission.WRITE_EXTERNAL_STORAGE] permission is
 * granted to the application.
 * </br>
 * This function returns a [Boolean] based on the success or failure of the permission being
 * granted respectively.
 */
@RequiresApi(16)
fun Context.checkWriteExternalStoragePermission(): Boolean {

    return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.READ_EXTERNAL_STORAGE
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Extension function to request for [Manifest.permission.WRITE_EXTERNAL_STORAGE] permission.
 */
@RequiresApi(16)
fun AppCompatActivity.requestWriteExternalStoragePermission(
        requestCode: Int = WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    if (!checkWriteExternalStoragePermission()) {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                requestCode
        )
    }
}

/**
 * Extension function to request for [Manifest.permission.WRITE_EXTERNAL_STORAGE] permission.
 */
@RequiresApi(16)
fun Fragment.requestWriteExternalStoragePermission(
        requestCode: Int = WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE
) {

    // Initially checking if the permission has been already granted before requesting
    // for it.
    context?.let {

        if (!it.checkWriteExternalStoragePermission()) {
            requestPermissions(
                    arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                    requestCode
            )
        }
    }
}
/*
----------------------------------------------------------------------------------------------------
 */
