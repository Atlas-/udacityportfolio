package com.chrispound.udacity.udacityportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toast mToast;
    private Button mSpotify;
    private Button mScores;
    private Button mLibrary;
    private Button mBuild;
    private Button mXYZ;
    private Button mCapstone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSpotify = (Button) findViewById(R.id.spotify);
        mScores = (Button) findViewById(R.id.scores);
        mLibrary = (Button) findViewById(R.id.library);
        mBuild = (Button) findViewById(R.id.build_bigger);
        mXYZ = (Button) findViewById(R.id.xyz);
        mCapstone = (Button) findViewById(R.id.myApp);
        mSpotify.setOnClickListener(this);
        mScores.setOnClickListener(this);
        mLibrary.setOnClickListener(this);
        mBuild.setOnClickListener(this);
        mXYZ.setOnClickListener(this);
        mCapstone.setOnClickListener(this);
    }

    public void handleButtonClick(String clicked) {
        if (mToast != null) {
            mToast.cancel();
        }
        String toastString = getString(R.string.will_launch, clicked);
        mToast = Toast.makeText(this,toastString, Toast.LENGTH_SHORT);
        mToast.show();
    }

    @Override
    public void onClick(View v) {
        String buttonText = ((Button) v).getText().toString();
        handleButtonClick(buttonText);
    }
}
