package cn.jinxiit.firstandroid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jinxiit.firstandroid.R;
import cn.jinxiit.firstandroid.activities.items.AdImageActivity;
import cn.jinxiit.firstandroid.activities.items.ImageWatcherActivity;
import cn.jinxiit.firstandroid.adapters.DirectoryAdapter;
import cn.jinxiit.firstandroid.beans.ItemBean;
import cn.jinxiit.firstandroid.interfaces.RecyclerViewListener;
import cn.jinxiit.firstandroid.utils.MyUtils;

public class MainActivity extends BaseActivity
{

    @BindView(R.id.recycler)
    RecyclerView mRecyclerView;

    private DirectoryAdapter mDirectoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        startSelfActivity(this, KotlinActivity.class);
        initView();
    }

    private void initView()
    {
        initData();
        initRecyclerView();
        initListener();

        adapterAddData();
    }

    private void adapterAddData()
    {
        List<ItemBean> itemBeanList = new ArrayList<>();
        itemBeanList.add(new ItemBean("图片大图预览", ImageWatcherActivity.class));
        itemBeanList.add(new ItemBean("上下滑动展示完整图片、ConstraintLayout的粗略使用", AdImageActivity.class));

        mDirectoryAdapter.addDataList(itemBeanList);
    }

    private void initListener()
    {
        mDirectoryAdapter.setmRecyclerViewListener(new RecyclerViewListener()
        {
            @Override
            public void onItemClick(View view, int position)
            {
                ItemBean itemBean = mDirectoryAdapter.getItemBean(position);
                startActivity(new Intent(mContext, itemBean.getaClass()));
            }
        });
    }

    private void initRecyclerView()
    {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mDirectoryAdapter = new DirectoryAdapter();
        mRecyclerView.setAdapter(mDirectoryAdapter);
    }

    private void initData()
    {



        TextView tvSummary = findViewById(R.id.tv_summary);
        tvSummary.setText(MyUtils.getIPAddress(this));

        OkGo.<String>get("https://app.aoonc.com/api/version/android").tag(this)
                .cacheTime(5000)
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Response<String> response)
                    {

                        Log.e("response", response.body()
                                .toString());
                        super.onError(response);
                    }

                    @Override
                    public void onSuccess(Response<String> response)
                    {
                        Log.e("onSuccess", response.body()
                                .toString());
                    }
                });
    }
}