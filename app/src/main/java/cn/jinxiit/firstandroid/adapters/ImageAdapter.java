package cn.jinxiit.firstandroid.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jinxiit.firstandroid.R;
import cn.jinxiit.firstandroid.interfaces.RecyclerViewListener;
import cn.jinxiit.firstandroid.utils.MyGlideUtils;
import cn.jinxiit.firstandroid.utils.MyPicassoUtils;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> implements View.OnClickListener
{
    private Context mContext;
    private List<String> mDataList;
    private RecyclerViewListener mRecyclerViewListener;
    private List<ImageView> mImageViewList;

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
        }

        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_img, parent, false);
        ViewHolder holder = new ViewHolder(view);
        holder.ivImg.setOnClickListener(this);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
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
        MyPicassoUtils.downImageByUrl(mContext, mDataList.get(position), holder.ivImg);
    }

    @Override
    public int getItemCount()
    {
        return mDataList.size();
    }

    @Override
    public void onClick(View view)
    {
        if (mRecyclerViewListener != null)
        {
            mRecyclerViewListener.onItemClick(view, (Integer) view.getTag());
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
