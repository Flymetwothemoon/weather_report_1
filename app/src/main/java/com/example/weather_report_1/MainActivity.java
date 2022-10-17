package com.example.weather_report_1;
import static button_findcityway.findcityway.OnClick;
import static button_findcityway.seekcityway.seek_OnClick;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.google.gson.Gson;
import com.tbruyelle.rxpermissions2.RxPermissions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import ToMakeRecycle.ToMakeRecycle;
import button_findcityway.findcityway;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import utils.ToastUtils;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView mRecyclerView;
    MyAdapter mMyAdapter;
    RecyclerView mRecyclerView_1;
    MyAdapter_0 mMyAdapter_0;
    public Toolbar toolbar;
    List<weather_list_0>mWeather_list_0s = new ArrayList<>();
    List<hour_list>mHour_lists = new ArrayList<>();
    private SwipeRefreshLayout mSwipeRefreshLayout;
    public LocationClient mLocationClient = null;
    private MyLocationListener myListener = new MyLocationListener();
    public TextView city;
    private Button mButton;
    private RxPermissions rxPermissions;
    private DrawerLayout mDrawerLayout;
    public TextView n_temp ;
    private TextView h_temp;
    private TextView c_temp;
    private EditText mEditText;
    private TextView n_weather;
    private Button seekcity;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LocationClient.setAgreePrivacy(true);
        setContentView(R.layout.activity_main12);
        Intent intent = getIntent();
        String data = intent.getStringExtra("city");
        String data_1 = intent.getStringExtra("data_1");
        String address = intent.getStringExtra("data_2");
        city = findViewById(R.id.city);
        mRecyclerView = findViewById(R.id.recycle_0);
        mRecyclerView_1 = findViewById(R.id.recycle_1);
        mDrawerLayout = findViewById(R.id.drawer);
        mEditText = findViewById(R.id.edit_text);
        n_temp = findViewById(R.id.n_temp);
        c_temp = findViewById(R.id.c_temp);
        h_temp = findViewById(R.id.h_temp);
        mButton = findViewById(R.id.button);
        seekcity = findViewById(R.id.button_seekcity);
        n_weather = findViewById(R.id.now_weather);
        Button mButton_1 = findViewById(R.id.button_findcity);
        mButton.setOnClickListener(this);
        OnClick(mButton_1, MainActivity.this);
        seek_OnClick(seekcity, MainActivity.this);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        rxPermissions = new RxPermissions(this);
        if (data != null) {
            String[] cityCodeArray = getResources().getStringArray(R.array.cityCode);
            String[] cityNameArray = getResources().getStringArray(R.array.cityName);
            List<String> cityNameList = Arrays.asList(cityNameArray);
            int index = cityNameList.indexOf(data);
            Log.d("TAG",""+index);
            sendRequestWithOkHttp_hour(cityCodeArray[index],3);
            sendRequestWithOkHttp_hour(cityCodeArray[index],1);
            sendRequestWithOkHttp_hour(cityCodeArray[index],2);
            city.setText(data);
        }
                else {
            if (data_1 != null) {
                Log.d("hi2", "nihao");
                sendRequestWithOkHttp_hour(address, 3);
                sendRequestWithOkHttp_hour(address, 2);
                sendRequestWithOkHttp_hour(address, 1);
                city.setText(data_1);
            } else {
                Log.d("1234", "hi");
                String address_0 = null;
                sendRequestWithOkHttp_hour(address_0, 3);
                sendRequestWithOkHttp_hour(address_0, 2);
                sendRequestWithOkHttp_hour(address_0, 1);
            }
        }
        if (city.getText() == null) {
            permissionVersion();
        }
        mMyAdapter = new MyAdapter(mWeather_list_0s);
        mMyAdapter_0 = new MyAdapter_0(mHour_lists);
        ToMakeRecycle.tomakerecycle_0(this, mRecyclerView_1, mMyAdapter_0);
        ToMakeRecycle.tomakerecycle(this, mRecyclerView, mMyAdapter);
    }

    public void sendRequestWithOkHttp_hour(String address_0,int i) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(i==1){
                try {
                    Log.d("hi1","nihao");
                    Request request = null;
                        OkHttpClient client = new OkHttpClient();
                        if(address_0==null) {
                             request = new Request.Builder().url("https://devapi.qweather.com/v7/weather/24h?key=7c15496615a848939e5baa77418254e0&location=101110101").build();
                        }
                        else{
                            request = new Request.Builder().url("https://devapi.qweather.com/v7/weather/24h?key=7c15496615a848939e5baa77418254e0&location="+address_0).build();
                        }
                        Response response = client.newCall(request).execute();
                        String jsonData = response.body().string();
                        parseJSONWITHGSON_hour(jsonData,1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(i==2){
                try {
                    Request request=null;
                    OkHttpClient client = new OkHttpClient();
                    if(address_0==null) {
                        request = new Request.Builder().url("https://devapi.qweather.com/v7/weather/now?key=7c15496615a848939e5baa77418254e0&location=101110101").build();
                    }
                    else{
                        request = new Request.Builder().url("https://devapi.qweather.com/v7/weather/now?key=7c15496615a848939e5baa77418254e0&location="+address_0).build();
                    }
                    Response response = client.newCall(request).execute();
                    String jsonData = response.body().string();
                    parseJSONWITHGSON_hour(jsonData,2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(i==3){
                try {
                    OkHttpClient client = new OkHttpClient();
                    Request request = null;
                    if(address_0==null) {
                        request = new Request.Builder().url("https://devapi.qweather.com/v7/weather/7d?key=7c15496615a848939e5baa77418254e0&location=101110101").build();
                    }
                    else{
                        request = new Request.Builder().url("https://devapi.qweather.com/v7/weather/7d?key=7c15496615a848939e5baa77418254e0&location="+address_0).build();
                    }
                    Response response = client.newCall(request).execute();
                    String jsonData = response.body().string();
                    parseJSONWITHGSON_hour(jsonData,4);
                    parseJSONWITHGSON_hour(jsonData,3);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }}).start();
    }
    private void parseJSONWITHGSON_hour(String jsonData,int i) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                if(i==1){
                    Gson gson = new Gson();
                    hourtime hourtime_1 = gson.fromJson(jsonData,hourtime.class);
                    for(int i1=0;i1<24;i1++){
                        HourlyDTO hourlyDTO = hourtime_1.getHourly().get(i1);
                        String time = hourlyDTO.getFxTime();
                        String weather = hourlyDTO.getText();
                        String temp = hourlyDTO.getTemp();
                        String time_1 = time.substring(11,16);
                        hour_list mhour = new hour_list();
                        mhour.temp = temp;
                        mhour.time = time_1;
                        mhour.weather = weather;
                        mHour_lists.add(mhour);

                    }
                }
                if(i==2){
                    Gson gson = new Gson();
                    NowWeater now_weather = gson.fromJson(jsonData,NowWeater.class);
                    NowDTO nowDTO = now_weather.getNow();
                    String now = nowDTO.getTemp();
                    n_temp.setText(now+"℃");
                    String now_weather_1 = nowDTO.getText();
                    n_weather.setText(now_weather_1);
                }
                if(i==3){
                    Gson gson = new Gson();
                    Weather weather = gson.fromJson(jsonData,Weather.class);
                    List<DailyDTO> temp = weather.getDaily();
                    for (int i1=0;i1<7;i1++) {
                        String time = temp.get(i1).getFxDate();
                        String h_temp = temp.get(i1).getTempMax();
                        String c_temp = temp.get(i1).getTempMin();
                        String weather_0 = temp.get(i1).getTextDay();
                        weather_list_0 weather_list_0s = new weather_list_0();
                        weather_list_0s.picture = time;
                        weather_list_0s.h_temp_0 = h_temp;
                        weather_list_0s.c_temp_0 = c_temp;
                        weather_list_0s.weather_0 = weather_0;
                        mWeather_list_0s.add(weather_list_0s);
                    }
                }
                if(i==4){
                    Gson gson = new Gson();
                    Log.d("hi1","xiangwan");
                    Weather weather =gson.fromJson(jsonData,Weather.class);
                    List<DailyDTO> temp = weather.getDaily();
                    String max  = temp.get(0).getTempMax();
                    String min = temp.get(0).getTempMin();
                    h_temp.setText(max+"℃");
                    c_temp.setText(min+"℃");
                    Log.d("TGA",""+weather);
                }
            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void permissionVersion(){
        if(Build.VERSION.SDK_INT >= 23){//6.0或6.0以上
            //动态权限申请
         permissionsRequest();

        }else {//6.0以下
            //发现只要权限在AndroidManifest.xml中注册过，均会认为该权限granted  提示一下即可
            ToastUtils.showShortToast(this,"你的版本在Android6.0以下，不需要动态申请权限。");
        }
    }
    //动态权限申请
    private void permissionsRequest() {
        rxPermissions.request(Manifest.permission.ACCESS_FINE_LOCATION).subscribe(granted -> {
                    if (granted) {//申请成功
                        //得到权限之后开始定位
                     startLocation();
                    } else {//申请失败
                        ToastUtils.showShortToast(this, "权限未开启");
                    }
                });
    }
    private void startLocation() throws Exception {
        mLocationClient = new LocationClient(MainActivity.this);
        //注册监听函数
        LocationClientOption option = new LocationClientOption();
        //如果开发者需要获得当前点的地址信息，此处必须为true
        option.setIsNeedAddress(true);
        //可选，设置是否需要最新版本的地址信息。默认不需要，即参数为false
        option.setNeedNewVersionRgc(true);
        //mLocationClient为第二步初始化过的LocationClient对象
        //需将配置好的LocationClientOption对象，通过setLocOption方法传递给LocationClient对象使用
        mLocationClient.registerLocationListener(myListener);
        mLocationClient.setLocOption(option);
        //启动定位
        mLocationClient.start();
        //注册监听函数
    }
    @Override
    public void onClick(View view) {
        String address = mEditText.getText().toString();
        address = address.replace("\n","");
        address = address.replace(" ","");
        String[] cityCodeArray = getResources().getStringArray(R.array.cityCode);
        String[] cityNameArray = getResources().getStringArray(R.array.cityName);
        List<String> cityNameList = Arrays.asList(cityNameArray);
        int index = cityNameList.indexOf(address);
        if(index==-1){
            ToastUtils.showShortToast(this,"不存在"+address+"城市");
        }
        else {
            sendRequestWithOkHttp_hour(cityCodeArray[index],1);
            sendRequestWithOkHttp_hour(cityCodeArray[index],2);
            sendRequestWithOkHttp_hour(cityCodeArray[index],3);
            city.setText(address);
            mEditText.setText("");
            mDrawerLayout.closeDrawers();
        }
    }
    private class MyLocationListener extends BDAbstractLocationListener {
            @Override
            public void onReceiveLocation(BDLocation location) {
                      runOnUiThread(new Runnable() {
                          @Override
                          public void run() {
                              StringBuilder stringBuilder =new StringBuilder();
                              stringBuilder.append(location.getCity()).append(location.getDistrict()).append("\n");
                              city.setText(stringBuilder.toString());
                          }
                      });
        }
    }
}
