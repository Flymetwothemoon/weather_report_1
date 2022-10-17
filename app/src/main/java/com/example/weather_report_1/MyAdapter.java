package com.example.weather_report_1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<weather_list_0>mWeather_list_0s;
    public MyAdapter(List<weather_list_0> Weather_list_0s) {
        mWeather_list_0s = Weather_list_0s;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(),R.layout.item,null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       weather_list_0 weather_list_01 = mWeather_list_0s.get(position);
       holder.weather_list_text.setText(weather_list_01.getPicture());
       holder.weather_list_text_1.setText(weather_list_01.getH_temp_0());
        holder.weather_list_text_2.setText(weather_list_01.getC_temp_0());
        holder.weather_list_text_3.setText(weather_list_01.getWeather_0());}

    @Override
    public int getItemCount() {
        return mWeather_list_0s.size() ;
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{

    TextView weather_list_text;
    TextView weather_list_text_1;
    TextView weather_list_text_2;
    TextView weather_list_text_3;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        weather_list_text = itemView.findViewById(R.id.item_textview_0);
        weather_list_text_1 = itemView.findViewById(R.id.item_textview_1);
        weather_list_text_2 = itemView.findViewById(R.id.item_textview_2);
        weather_list_text_3 = itemView.findViewById(R.id.item_textview_3);
    }
}
