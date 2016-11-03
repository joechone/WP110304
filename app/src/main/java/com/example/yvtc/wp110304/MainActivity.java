package com.example.yvtc.wp110304;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String cities[] = {"台北", "台中", "台南", "高雄"};
    String codes[] = {"02", "04", "06", "07"};
int[] imgs ={R.drawable.taipei,R.drawable.taichung,R.drawable.tainan,R.drawable.ks};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.listview);
        ArrayList<Map<String,Object>> mylist3 = new ArrayList<Map<String,Object>>();
        for(int i=0;i <cities.length;i++) {
            HashMap<String,Object> m1 =new HashMap<>();
            m1.put("city",cities[i]);
            m1.put("code",codes[i]);
            m1.put("img",imgs[i]);
            mylist3.add(m1);

        }
        SimpleAdapter  adapter3 = new SimpleAdapter(MainActivity.this,
                mylist3,
                R.layout.myitem,
                new String[]{"city", "code","img"},
                new int[] {R.id.textView4, R.id.textView5,R.id.imageView});

        lv.setAdapter(adapter3);
    }
}
