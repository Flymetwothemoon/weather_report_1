package com.example.weather_report_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in_city.import_city;
import in_city.import_cityAdapter;

public class MainActivity2 extends AppCompatActivity {
private DrawerLayout mDrawerLayout;
TextView mTextView;
private List<import_city>mImport_cityList = new ArrayList<>();
private import_city[]mCities = {new import_city("北京"),new import_city("上海"),new import_city("广州"),
new import_city("深圳"),new import_city("天津"),new import_city("武汉"),new import_city("沈阳"),new import_city("重庆")
,new import_city("杭州"),new import_city("南京"),new import_city("哈尔滨"),new import_city("长春")
,new import_city("呼和浩特"),new import_city("石家庄"),new import_city("银川"),new import_city("乌鲁木齐"),new import_city("拉萨"),new import_city("西宁"),new import_city("西安"),new import_city("兰州"),new import_city("太原")
,new import_city("昆明"),new import_city("南宁"),new import_city("成都"),new import_city("长沙"),new import_city("济南"),new import_city("南昌"),new import_city("合肥"),new import_city("郑州"),new import_city("福州")
,new import_city("贵阳"),new import_city("海口"),new import_city("秦皇岛"),new import_city("桂林"),new import_city("三亚"),new import_city("香港"),new import_city("澳门"),new import_city("厦门"),new import_city("徐州")
,new import_city("汉中"),new import_city("深圳"),new import_city("温州"),new import_city("湖州"),new import_city("宁波"),new import_city("义乌"),new import_city("南通"),new import_city("扬州"),new import_city("咸阳"),new import_city("渭南")};
private import_cityAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initcities();
        RecyclerView recyclerView = findViewById(R.id.import_recycle);
        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new import_cityAdapter(mImport_cityList);
        recyclerView.setAdapter(adapter);
    }
    private void initcities() {
        mImport_cityList.clear();
            for(int j = 0;j<mCities.length;j++){
                mImport_cityList.add(mCities[j]);
            }
        }

}