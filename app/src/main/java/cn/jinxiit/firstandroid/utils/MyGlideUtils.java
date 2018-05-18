package cn.jinxiit.firstandroid.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MyGlideUtils
{
    public static void downLoadImageByUrl(Context context, String url, ImageView imageView)
    {
        Glide.with(context)
                .load(url)
                .into(imageView);
    }
}
