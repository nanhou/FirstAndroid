package cn.jinxiit.firstandroid.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity
{
    protected Activity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        mContext = this;
        super.onCreate(savedInstanceState);

    }

    public void startSelfActivity(Context context, Class contextClass)
    {
        context.startActivity(new Intent(context, contextClass));
    }
}
