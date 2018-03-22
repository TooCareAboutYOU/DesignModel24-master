package com.designmodel.main;

import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat;
import android.support.v4.os.CancellationSignal;

/**
 * 指纹
 */

public class FingerPrintUtil {


    private static final String TAG = "FingerPrintUtil";


    public static CancellationSignal cancellationSignal;

    interface OnCallBackListener{
        void AuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult result);
        void AuthenticationFailed();
        void onSupportFailed();
        void onInsecurity();
        void onEnrollFailed();
        void AuthenticationStart();
        void AuthenticationError(int errorId,CharSequence errorString);
        void AuthenticationHelp(int helpMsg,CharSequence helpString);
    }


    public static void callFingerPrint(final OnCallBackListener callBackListener){
        FingerprintManagerCompat managerCompat=FingerprintManagerCompat.from(MyApplication.getInstance().getApplicationContext());
        if (!managerCompat.isHardwareDetected()) {  //  判断设备是否支持
            if (callBackListener != null) {
                callBackListener.onSupportFailed();
                return;
            }
        }
        KeyguardManager keyguardManager= (KeyguardManager) MyApplication.getInstance().getSystemService(Context.KEYGUARD_SERVICE);
        if (!keyguardManager.isKeyguardSecure()) { // 判断设备是否处于安全保护中
            if (callBackListener != null) {
                callBackListener.onInsecurity();
                return;
            }
        }

        if (!managerCompat.hasEnrolledFingerprints()) {// 判断设备是否已经注册过指纹
            if (callBackListener != null) {
                callBackListener.onEnrollFailed(); // 未注册
                return;
            }
        }
        if (callBackListener != null) {
            callBackListener.AuthenticationStart();  //开始指纹识别
            cancellationSignal=new CancellationSignal(); // 必须重新实例化，否则cancel过一次就不能再使用了
            managerCompat.authenticate(null, 0, cancellationSignal, new FingerprintManagerCompat.AuthenticationCallback() {
                // 当出现错误的时候回调此函数，比如多次尝试都失败了的时候，errString是错误信息，
                // 比如华为的提示就是：尝试次数过多，请稍后再试
                @Override
                public void onAuthenticationError(int errMsgId, CharSequence errString) {
                    if (callBackListener != null) {
                        callBackListener.AuthenticationError(errMsgId, errString);
                    }
                }

                // 当指纹验证失败的时候会回调此函数，失败之后允许多次尝试，
                // 失败次数过多会停止响应一段时间然后再停止sensor的工作
                @Override
                public void onAuthenticationHelp(int helpMsgId, CharSequence helpString) {
                    if (callBackListener != null) {
                        callBackListener.AuthenticationHelp(helpMsgId, helpString);
                    }
                }

                @Override
                public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult result) {
                    if (callBackListener != null) {
                        callBackListener.AuthenticationSucceeded(result);
                    }
                }

                // 当验证的指纹成功时会回调此函数，然后不再监听指纹sensor
                @Override
                public void onAuthenticationFailed() {
                    if (callBackListener != null) {
                        callBackListener.AuthenticationFailed();
                    }
                }
            },null);
        }
    }

    public static void cancel(){
        if (cancellationSignal != null) {
           cancellationSignal.cancel();
        }
    }


}
