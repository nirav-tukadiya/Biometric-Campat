package com.niravtukadiya.compat.biometric

/**
 * Created by Nirav Tukadiya on 22/07/18 8:58 PM.
 * nirav.tukadiya@gmail.com
 */

interface BiometricCallback {

    //sdk not supported, biometric auth not supported, biometric auth not available, biometric auth permission not granted
    fun onPreConditionsFailed(error: BiometricError)

    fun onBiometricAuthenticationInternalError(error: String?)

    fun onAuthenticationFailed()

    fun onAuthenticationCancelled()

    fun onAuthenticationSuccessful()

    fun onAuthenticationHelp(helpCode: Int, helpString: CharSequence?)

    fun onAuthenticationError(errorCode: Int, errString: CharSequence?)
}
