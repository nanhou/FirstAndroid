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
import cn.jinxiit.firstandroid.beans.ItemBean;
import cn.jinxiit.firstandroid.interfaces.RecyclerViewListener;

public class DirectoryAdapter extends RecyclerView.Adapter<DirectoryAdapter.ViewHolder> implements View.OnClickListener
{
    private Context mContext;
    private List<ItemBean> mDataList;
    private RecyclerViewListener mRecyclerViewListener;

    public DirectoryAdapter()
    {
        mDataList = new ArrayList<>();
    }

    public void setmRecyclerViewListener(RecyclerViewListener mRecyclerViewListener)
    {
        this.mRecyclerViewListener = mRecyclerViewListener;
    }

    public ItemBean getItemBean(int position)
    {
        return mDataList.get(position % mDataList.size());
    }

    public void addDataList(List<ItemBean> list)
    {
        mDataList.addAll(list);
        this.notifyDataSetChanged();
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
                .inflate(R.layout.item_directory, parent, false);
        ViewHolder holder = new ViewHolder(view);
        holder.itemView.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.itemView.setTag(position);
        ItemBean itemBean = mDataList.get(position);
        holder.tvTitle.setText(itemBean.getName());
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
        @BindView(R.id.tv_title)
        TextView tvTitle;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);}
    }
}