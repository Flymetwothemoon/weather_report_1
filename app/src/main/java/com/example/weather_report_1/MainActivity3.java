package com.example.weather_report_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import OkHttp.City;
import OkHttp.LocationDTO;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import seekcity_Adapter.seek_city;
import seekcity_Adapter.seek_cityAdapter;
import utils.ToastUtils;

public class MainActivity3 extends AppCompatActivity {
    private  EditText mEditText;
    List<seek_city>mSeek_cities = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mEditText = (EditText) findViewById(R.id.seekcity_edit);

        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String url = editable.toString();
                Log.d("1234",""+url);
                if(url.matches("[\u4e00-\u9fa5]")||(url.length()>1)) {
                    sendokhttp("https://geoapi.qweather.com/v2/city/lookup?location=" + url + "&key=7c15496615a848939e5baa77418254e0");
                }
                else{
                    ToastUtils.showShortToast(MainActivity3.this,"请继续输");
                }
                }
        });

        RecyclerView recyclerView = findViewById(R.id.seekcity_recycleview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        seek_cityAdapter seek_cityAdapter = new seek_cityAdapter(mSeek_cities);
        recyclerView.setAdapter(seek_cityAdapter);

    }

        public  void sendokhttp(String url){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Response response;
                    Request request=null;
                    String responseData = null;
                    try {
                        OkHttpClient okHttpClient = new OkHttpClient();

                            request = new Request.Builder().url(url).build();


                        response = okHttpClient.newCall(request).execute();
                        responseData = response.body().string();
                        Log.d("1234","else"+" "+responseData);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    showResponse(responseData);
                }
            }).start();
        }

        private void showResponse(String responseData) {
            MainActivity3.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Gson gson = new Gson();
                    City city = gson.fromJson(responseData,City.class);
                    List<LocationDTO> locationDTOS = city.getLocation();
                    for (LocationDTO locationDTO : locationDTOS) {
                        String country = locationDTO.getCountry();
                        String province = locationDTO.getAdm1();
                        String region = locationDTO.getAdm2();
                        String name = locationDTO.getName();
                        String id = locationDTO.getId();
                        String message =  country+province+region+name;
                        String message_1 = id;
                        seek_city seekCity = new seek_city();
                        seekCity.name = name;
                        seekCity.name_1 = message;
                        seekCity.name_2 = message_1;
                        mSeek_cities.add(seekCity);

                    }

                }
            });

        }
    }

