package cn.jinxiit.firstandroid.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jinxiit.firstandroid.R;
import cn.jinxiit.firstandroid.interfaces.RecyclerViewListener;
import cn.jinxiit.firstandroid.utils.MyGlideUtils;
import cn.jinxiit.firstandroid.utils.MyPicassoUtils;
import cn.jinxiit.firstandroid.utils.MyUtils;
import cn.jinxiit.firstandroid.utils.WindowUtils;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> implements View.OnClickListener
{
    private Context mContext;
    private List<String> mDataList;
    private RecyclerViewListener mRecyclerViewListener;
    private List<ImageView> mImageViewList;
    private int mWith;

    public ImageAdapter(List<String> mDataList)
    {
        this.mDataList = mDataList;
        mImageViewList = new ArrayList<>();
    }

    public void setmRecyclerViewListener(RecyclerViewListener mRecyclerViewListener)
    {
        this.mRecyclerViewListener = mRecyclerViewListener;
    }

    public List<String> getmDataList()
    {
        return mDataList;
    }

    public List<ImageView> getmImageViewList()
    {
        return mImageViewList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        if (mContext == null)
        {
            mContext = parent.getContext();
            mWith = (WindowUtils.getWidth(mContext) - WindowUtils.dip2px(mContext, 10)) / 2 - WindowUtils.dip2px(mContext, 10);
        }

        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_img, parent, false);
        ViewHolder holder = new ViewHolder(view);
        holder.ivImg.setOnClickListener(this);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position)
    {
        if (position >= mImageViewList.size())
        {
            mImageViewList.add(holder.ivImg);
        }
        else
        {
            mImageViewList.set(position, holder.ivImg);
        }

        holder.ivImg.setTag(position);
//        MyGlideUtils.downLoadImageByUrl(mContext, mDataList.get(position), holder.ivImg);
//        MyPicassoUtils.downImageByUrl(mContext, mDataList.get(position), holder.ivImg);

        Picasso.with(mContext)
                .load(mDataList.get(position))
                .into(holder.ivImg, new Callback()
                {
                    @Override
                    public void onSuccess()
                    {
//                        BitmapDrawable drawable = (BitmapDrawable) holder.ivImg.getDrawable();
//                        Bitmap bitmap = drawable.getBitmap();
//                        int width = bitmap.getWidth();
//                        int height = bitmap.getHeight();
//                        ViewGroup.LayoutParams lp = holder.ivImg.getLayoutParams();
//                        lp.width = mWith;
//                        lp.height = mWith * height / width - WindowUtils.dip2px(mContext, 10);
//                        Log.e("withAndHeight", mWith + "----" + lp.height);
//                        holder.ivImg.setLayoutParams(lp);
                    }

                    @Override
                    public void onError()
                    {

                    }
                });
    }

    @Override
    public int getItemCount()
    {
        return mDataList.size();
    }

    @Override
    public void onClick(View view)
    {
        synchronized (mRecyclerViewListener)
        {
            if (mRecyclerViewListener != null)
            {
                mRecyclerViewListener.onItemClick(view, (Integer) view.getTag());
            }
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.iv_img)
        ImageView ivImg;

        ViewHolder(View view)
        {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
