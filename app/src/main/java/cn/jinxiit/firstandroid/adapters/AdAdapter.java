package cn.jinxiit.firstandroid.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jinxiit.firstandroid.R;
import cn.jinxiit.firstandroid.utils.MyPicassoUtils;
import cn.jinxiit.firstandroid.views.AdImageView;

public class AdAdapter extends RecyclerView.Adapter<AdAdapter.ViewHolder>
{
    private List<String> mDataList;
    private Context mContext;

    public AdAdapter(List<String> list)
    {
        mDataList = list;
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
                .inflate(R.layout.item_adimg, parent, false);
        ViewHolder holder = new ViewHolder(view);

//        int position = holder.getAdapterPosition();
//        String data = mDataList.get(position);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        String url = mDataList.get(position);
        MyPicassoUtils.downImageByUrl(mContext, url, holder.adiv);
    }

    @Override
    public int getItemCount()
    {
        return mDataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.adiv)
        AdImageView adiv;
        @BindView(R.id.tv_summary)
        TextView tvSummary;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);}
    }
}
