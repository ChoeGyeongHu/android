package com.example.a08_customlistview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/*
* 사용자정의 ArrayAdapter => ArrayAdapter<MyData> 상속받음
* */

public class MyAdapter extends ArrayAdapter<MyData> {

     private Context mContext;
     private int mResource;

    /*
     * MyData의 기본 생성자
     * @param context
     * @param resource
     * @param objects
     * */

    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MyData> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    /*
     *  Alt + Insert => Override Methods => getView
     * */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // MyData 정보 가져오기
        String title = getItem(position).getTitle();
        String description = getItem(position).getDescription();
        int img = getItem(position).getImg();

        //  MyData  생성
         MyData mydata = new MyData(title, description, img);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView textView1 = (TextView)convertView.findViewById(R.id.textView1);
        TextView textView2 = (TextView)convertView.findViewById(R.id.textView2);
        ImageView image = (ImageView)convertView.findViewById(R.id.image);

        // 해당
        textView1.setText(title);
        textView2.setText(description);
        image.setImageResource(img);

        return convertView;
    }
}
