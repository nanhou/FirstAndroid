package cn.jinxiit.firstandroid.utils;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MyPicassoUtils
{
    public static void downImageByUrl(Context context, String url, ImageView imageView)
    {
        Picasso.with(context)
                .load(url)
                .into(imageView);
    }
}
