package cn.jinxiit.firstandroid.activities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ch.ielse.view.imagewatcher.ImageWatcher;
import cn.jinxiit.firstandroid.R;
import cn.jinxiit.firstandroid.adapters.ImageAdapter;
import cn.jinxiit.firstandroid.beans.Data;
import cn.jinxiit.firstandroid.interfaces.RecyclerViewListener;

public class ImageWatcherActivity extends BaseActivity
{
    @BindView(R.id.recycler)
    RecyclerView mRecycler;
    @BindView(R.id.v_image_watcher)
    ImageWatcher mImageWatcher;

    private ImageAdapter mImageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_watcher);
        ButterKnife.bind(this);

        initView();
    }

    @Override
    public void onBackPressed()
    {
        if (!mImageWatcher.handleBackPressed())
        {
            super.onBackPressed();
        }

    }

    private void initView()
    {
        initRecyclerView();
        initImageWatcher();

        initListener();
    }

    private void initListener()
    {
        mImageAdapter.setmRecyclerViewListener(new RecyclerViewListener()
        {
            @Override
            public void onItemClick(View view, int position)
            {
                List<String> urlList = mImageAdapter.getmDataList();
                List<ImageView> imageViews = mImageAdapter.getmImageViewList();
                mImageWatcher.show((ImageView) view, imageViews, urlList);
            }
        });
    }

    private void initImageWatcher()
    {
        // 如果是透明状态栏，你需要给ImageWatcher标记 一个偏移值，以修正点击ImageView查看的启动动画的Y轴起点的不正确
        //        mImageWatcher.setTranslucentStatus(!isTranslucentStatus ? Utils.calcStatusBarHeight(this) : 0);

        // 配置error图标 如果不介意使用lib自带的图标，并不一定要调用这个API
        mImageWatcher.setErrorImageRes(R.mipmap.error_picture);

        mImageWatcher.setLoader(new ImageWatcher.Loader()
        {
            @Override
            public void load(Context context, String url, final ImageWatcher.LoadCallback lc)
            {
                Picasso.with(context)
                        .load(url)
                        .into(new Target()
                        {
                            @Override
                            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from)
                            {
                                lc.onResourceReady(bitmap);
                            }

                            @Override
                            public void onBitmapFailed(Drawable errorDrawable)
                            {
                                lc.onLoadFailed(errorDrawable);
                            }

                            @Override
                            public void onPrepareLoad(Drawable placeHolderDrawable)
                            {
                                lc.onLoadStarted(placeHolderDrawable);
                            }
                        });
            }
        });
    }

    private void initRecyclerView()
    {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //        staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        mRecycler.setLayoutManager(staggeredGridLayoutManager);
        List<Data> data = Data.get();
        List<String> pictureList = data.get(0)
                .getPictureList();
        mImageAdapter = new ImageAdapter(pictureList);
        mRecycler.setAdapter(mImageAdapter);
    }

    public static class SpacesItemDecoration extends RecyclerView.ItemDecoration
    {
        private int space;

        public SpacesItemDecoration(int space)
        {
            this.space = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state)
        {
            outRect.left = space;
            outRect.right = space;
            outRect.bottom = space;

            // Add top margin only for the first item to avoid double space between items
            if (parent.getChildPosition(view) == 0)
            {
                outRect.top = space;
            }
        }
    }
}