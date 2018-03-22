package com.designmodel.main;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FingerPrintUtil.OnCallBackListener {

    private static final String TAG = "MainActivity";

    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_FingerPrint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: ");
                FingerPrintUtil.callFingerPrint(MainActivity.this);
            }
        });
    }

    @Override
    public void AuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult result) {
        Toast.makeText(this, "解锁成功" + result, Toast.LENGTH_SHORT).show();
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    @Override
    public void AuthenticationFailed() {
        Toast.makeText(this, "解锁失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSupportFailed() {
        Toast.makeText(this, "当前设备不支持指纹", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onInsecurity() {
        Toast.makeText(this, "当前设备未处于安全保护中", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onEnrollFailed() {
        Toast.makeText(this, "请到设置中设置指纹", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void AuthenticationStart() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                FingerPrintUtil.cancel();
            }
        });
        dialog = builder.create();
        dialog.show();
    }

    @Override
    public void AuthenticationError(int errorId, CharSequence errorString) {
        Toast.makeText(this, "AuthenticationError：" + errorId + "\t" + errorString, Toast.LENGTH_SHORT).show();
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    @Override
    public void AuthenticationHelp(int helpMsg, CharSequence helpString) {
        Toast.makeText(this, helpMsg + "\n" + helpString, Toast.LENGTH_SHORT).show();
    }


}
