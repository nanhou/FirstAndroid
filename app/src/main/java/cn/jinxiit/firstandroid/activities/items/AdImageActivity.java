package cn.jinxiit.firstandroid.activities.items;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jinxiit.firstandroid.R;
import cn.jinxiit.firstandroid.activities.BaseActivity;
import cn.jinxiit.firstandroid.adapters.AdAdapter;
import cn.jinxiit.firstandroid.beans.Data;
import cn.jinxiit.firstandroid.views.AdImageView;

public class AdImageActivity extends BaseActivity
{
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_image);
        ButterKnife.bind(this);

        initView();
    }

    private void initView()
    {
        initRecyclerView();
    }

    private void initRecyclerView()
    {
        mRecyclerview.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerview.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
        List<String> pictureList = Data.get()
                .get(0)
                .getPictureList();
        AdAdapter adAdapter = new AdAdapter(pictureList);
        mRecyclerview.setAdapter(adAdapter);

        mRecyclerview.addOnScrollListener(new RecyclerView.OnScrollListener()
        {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy)
            {
                super.onScrolled(recyclerView, dx, dy);

                LinearLayoutManager mLinearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int fPos = mLinearLayoutManager.findFirstVisibleItemPosition();
                int lPos = mLinearLayoutManager.findLastCompletelyVisibleItemPosition();
                for (int i = fPos; i <= lPos; i++)
                {
                    View view = mLinearLayoutManager.findViewByPosition(i);
                    AdImageView adImageView = view.findViewById(R.id.adiv);
                    if (adImageView.getVisibility() == View.VISIBLE)
                    {
                        adImageView.setDx(mLinearLayoutManager.getHeight() - view.getTop());
                    }
                }
            }
        });
    }
}