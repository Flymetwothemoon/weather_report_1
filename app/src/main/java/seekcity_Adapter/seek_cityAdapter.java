package seekcity_Adapter;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_report_1.MainActivity;
import com.example.weather_report_1.MainActivity3;
import com.example.weather_report_1.R;

import java.util.ArrayList;
import java.util.List;

import in_city.import_city;


public class seek_cityAdapter extends RecyclerView.Adapter<MyViewHolder_1> {

    public seek_cityAdapter(List<seek_city> seek_cities) {
        mSeek_cities = seek_cities;
    }

    private List<seek_city>mSeek_cities;
    @NonNull
    @Override
    public MyViewHolder_1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seek_city,parent,false);
        MyViewHolder_1 viewHolder_1 = new MyViewHolder_1(view);
        return viewHolder_1;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder_1 holder, int position) {
    seek_city seek_city = mSeek_cities.get(position);
    holder.mTextView.setText(seek_city.getName());
    holder.mTextView_1.setText(seek_city.getName_1());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

                    String index_1 = seek_city.getName() ;
                    String index_2 = seek_city.getName_1();
                    String index_3 = seek_city.getName_2();
                    Intent intent = new Intent(view.getContext(),MainActivity.class);
                    intent.putExtra("data_1",index_1);

                    intent.putExtra("data_2",index_3);
                    view.getContext().startActivity(intent);






        }
    });
    }

    @Override
    public int getItemCount() {
        return mSeek_cities.size();
    }
}
class MyViewHolder_1 extends RecyclerView.ViewHolder{
    TextView mTextView ;
    TextView mTextView_1;
    public MyViewHolder_1(@NonNull View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.seekcity_textview);
        mTextView_1 = itemView.findViewById(R.id.seekcity_textview_1);
    }
}
