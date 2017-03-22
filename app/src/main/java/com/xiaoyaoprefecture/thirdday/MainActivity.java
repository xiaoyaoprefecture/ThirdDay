package com.xiaoyaoprefecture.thirdday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.MyFruitAdapter;
import bean.FruitBean;

/**
 * 今天玩一玩listview的基本使用
 */
public class MainActivity extends AppCompatActivity {
    ListView mListview;
    List<FruitBean>list=new ArrayList<>();//装数据的集合
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * 初始化数据
     */
    private void init() {
        findView();
        initData();
        setAdapter();
    }

    /**
     * 初始化集合的数据源
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
     * 给listview设置适配器
     */
    private void setAdapter() {
        mListview.setAdapter(new MyFruitAdapter(MainActivity.this,list));
    }

    /**
     * 找控件
     */
    private void findView() {
        mListview= (ListView) findViewById(R.id.mListview);
    }
}
