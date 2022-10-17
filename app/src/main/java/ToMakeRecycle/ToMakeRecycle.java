package ToMakeRecycle;

import android.content.Context;
import android.widget.GridLayout;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_report_1.MainActivity;
import com.example.weather_report_1.MyAdapter;
import com.example.weather_report_1.MyAdapter_0;


public class ToMakeRecycle {
    public static void tomakerecycle(Context context, RecyclerView recyclerView, MyAdapter myAdapter){
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
    recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.setAdapter(myAdapter);
    }
    public static void tomakerecycle_0(Context context, RecyclerView recyclerView, MyAdapter_0 myAdapter_0){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter_0);
    }

}
