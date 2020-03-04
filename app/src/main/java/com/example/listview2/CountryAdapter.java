package com.example.listview2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class CountryAdapter extends BaseAdapter {
    Context context;
    List<String> country;

    public CountryAdapter(Context context, List<String> country) {
        this.context = context;
        this.country = country;
    }

    @Override
    public int getCount() {
        return country.size();
    }

    @Override
    public Object getItem(int position) {
        return country.get(position).toUpperCase();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view= LayoutInflater.from(context).inflate(R.layout.country_name,parent,false);
        TextView Country=view.findViewById(R.id.txt_tvDisplay);

        String countryName= (String) getItem(position);

        Country.setText(countryName);
        Log.w("List","getView called"+(position+1));

        return view;
    }
}
