package ru.spbstu.college.laba11;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class myAdapter extends BaseAdapter {

    private String[] names;
    public  myAdapter(String[] names){
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.line, viewGroup, false);
        }
        TextView textView = (TextView) view; //преобразуем класс объекта – элемента разметки к TextView
        textView.setText(names[i]);
        //if (i % 2 == 0){
            //view.getWindow().getDecorView().setBackgroundColor(…);
           // view.setBackgroundColor(ContextCompat.getColor(context, R.color.red));
       // }
        //else {
            //view.setBackgroundColor(ContextCompat.getColor(context, R.color.red));
        //}
        return view;
    }
}

