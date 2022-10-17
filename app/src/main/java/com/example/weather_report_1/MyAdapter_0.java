package com.example.weather_report_1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter_0 extends RecyclerView.Adapter<MyViewHolder_0>{
    private List<hour_list>mHour_lists;
    public MyAdapter_0(List<hour_list> Hour_lists) {
       mHour_lists = Hour_lists;
    }
    @NonNull
    @Override
    public MyViewHolder_0 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(),R.layout.item_1,null);
        MyViewHolder_0 myViewHolder = new MyViewHolder_0(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder_0 holder, int position) {
        hour_list hour_list = mHour_lists.get(position);
        holder.item_textview_0.setText("  "+hour_list.getTime()+"    ");
        holder.item_textview_1.setText("   "+hour_list.getWeather());
        holder.item_textview_2.setText("   "+hour_list.getTemp()+"℃"+"   ");
    }

    @Override
    public int getItemCount() {
        return mHour_lists.size();
    }
}

class MyViewHolder_0 extends RecyclerView.ViewHolder{
    TextView item_textview_0;
    TextView item_textview_1;
    TextView item_textview_2;
    public MyViewHolder_0(@NonNull View itemView) {
        super(itemView);
        item_textview_0 = itemView.findViewById(R.id.item1_textview_0);
        item_textview_1 = itemView.findViewById(R.id.item1_textview_1);
        item_textview_2 = itemView.findViewById(R.id.item1_textview_2);
    }
}