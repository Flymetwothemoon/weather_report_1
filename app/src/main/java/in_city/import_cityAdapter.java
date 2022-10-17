package in_city;

import static com.example.weather_report_1.MainActivity.*;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.example.weather_report_1.*;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_report_1.R;

import java.net.URI;

import java.util.Arrays;
import java.util.List;

public class import_cityAdapter extends RecyclerView.Adapter<import_cityAdapter.ViewHolder> {
    private Context mContext;
    public import_cityAdapter(List<import_city> import_cityList) {
        mImport_cityList = import_cityList;
    }

    private List<import_city>mImport_cityList;
    @NonNull
    @Override
    public import_cityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(mContext==null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.import_city,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull import_cityAdapter.ViewHolder holder, int position) {
        import_city import_city = mImport_cityList.get(position);
        holder.import_cityname.setText(import_city.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address = import_city.getName();
                Intent intent  = new Intent(view.getContext(),MainActivity.class);
                intent.putExtra("city",address);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImport_cityList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView mCardView;
        TextView import_cityname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mCardView = (CardView) itemView;
            import_cityname  = (TextView) itemView.findViewById(R.id.import_cityname);
        }
    }
}
