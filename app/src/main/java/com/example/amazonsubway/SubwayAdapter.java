package com.example.amazonsubway;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.amazonsubway.R;

import java.util.ArrayList;

public class SubwayAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<SubwayItem> data;
    private int layout;

    public SubwayAdapter(Context context, int layout, ArrayList<SubwayItem> data) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(layout, parent, false);
        }
        SubwayItem subwayItem = data.get(position);

        TextView stationName = (TextView) convertView.findViewById(R.id.station);
        stationName.setText(subwayItem.getStation());

        return convertView;
    }
}
