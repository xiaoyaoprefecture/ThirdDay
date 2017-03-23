package com.xiaoyaoprefecture.thirdday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.MyRecyclerViewAdapter;
import bean.FruitBean;

/**
 * 玩一玩RecyclerView
 */
public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    List<FruitBean>list=new ArrayList<>();
    RecyclerView.LayoutManager mLayoutManager;
    MyRecyclerViewAdapter mMyRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        init();
        mRecyclerview.setLayoutManager(mLayoutManager);
        mMyRecyclerViewAdapter=new MyRecyclerViewAdapter(list);
        mRecyclerview.setAdapter(mMyRecyclerViewAdapter);
        mMyRecyclerViewAdapter.setOnItemClickListener(new MyRecyclerViewAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, List<FruitBean> list) {
                Toast.makeText(RecyclerViewActivity.this,""+view.getId(),Toast.LENGTH_SHORT).show();
                
            }
        });
    }

    /**
     * 初始化数据
     */
    private void init() {
        findView();
        initLayoutManager();
        initData();
    }

    /**
     * 初始化数据源
     */
    private void initData() {
        FruitBean apple=new FruitBean("apple",R.drawable.apple);
        list.add(apple);
        FruitBean banana=new FruitBean("banana",R.drawable.banana);
        list.add(banana);
        FruitBean cherry=new FruitBean("cherry",R.drawable.cherry);
        list.add(cherry);
        FruitBean durian=new FruitBean("durian",R.drawable.durian);
        list.add(durian);
        FruitBean grape=new FruitBean("grape",R.drawable.grape);
        list.add(grape);
        FruitBean kiwi=new FruitBean("kiwi",R.drawable.kiwi);
        list.add(kiwi);
        FruitBean lemon=new FruitBean("lemon",R.drawable.lemon);
        list.add(lemon);
        FruitBean orange=new FruitBean("orange",R.drawable.orange);
        list.add(orange);
        FruitBean peach=new FruitBean("peach",R.drawable.peach);
        list.add(peach);
        FruitBean pineapple=new FruitBean("pineapple",R.drawable.pineapple);
        list.add(pineapple);
        FruitBean strawberry=new FruitBean("strawberry",R.drawable.strawberry);
        list.add(strawberry);
        FruitBean tomato=new FruitBean("tomato",R.drawable.tomato);
        list.add(tomato);
        FruitBean watermelon=new FruitBean("watermelon",R.drawable.watermelon);
        list.add(watermelon);
    }

    /**
     * 创建默认的LayoutManager
     */
    private void initLayoutManager() {
        /*//listview布局
        mLayoutManager=new  LinearLayoutManager(this);*/
        /*//Grid布局
        mLayoutManager=new GridLayoutManager(this,2);*/
        //瀑布流布局
        mLayoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        //mRecyclerview.setHasFixedSize(true);

    }

    /**
     * 找控件
     */
    private void findView() {
        mRecyclerview= (RecyclerView) findViewById(R.id.mRecyclerView);

    }
}
