package com.model_factory.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IOHandler ioHandlerFile=IOFactory.getIOHandler(FileIOHandler.class);

        IOHandler ioHandlerXML=IOFactory.getIOHandler(XMLOHandler.class);

        IOHandler ioHandlerDB=IOFactory.getIOHandler(DBOHandler.class);

        Log.i(TAG, "工厂模式: \n"+ioHandlerFile.query("111")+"\n"+
                ioHandlerXML.query("222")+"\n"+
                ioHandlerDB.query("333"));
    }
}
