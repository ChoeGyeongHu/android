package com.example.a08_customlistview2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 준비
        MyData facebook = new MyData("Facebook", "Facebook Description", R.drawable.facebook);
        MyData whatsapp = new MyData("Whatsapp", "Whatsapp Description", R.drawable.whatsapp);
        MyData twitter = new MyData("Twitter", "Twitter Description", R.drawable.twitter);
        MyData instagram = new MyData("Instagram", "Instagram Description", R.drawable.instagram);
        MyData youtube = new MyData("YouTube", "YouTube Description", R.drawable.youtube);

        // 데이터를 ArrayList에 저장
        ArrayList<MyData> list = new ArrayList<MyData>();
        list.add(facebook);
        list.add(whatsapp);
        list.add(twitter);
        list.add(instagram);
        list.add(youtube);

        // ListView 정의
        ListView mlistView = (ListView)findViewById(R.id.listView);

        // Adapter선언 및 정의
        MyAdapter adapter = new MyAdapter(this, R.layout.row, list);
        mlistView.setAdapter(adapter);
    }
}
