package com.example.amirkalif;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicianAdapter extends BaseAdapter {
    private final List<Musician> data;
    private final LayoutInflater inflater;

    public MusicianAdapter(Context context, List<Musician> data) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Musician getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.imgIcon = convertView.findViewById(R.id.imgIcon);
            holder.tvName = convertView.findViewById(R.id.tvName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Musician musician = getItem(position);
        holder.tvName.setText(musician.getName());
        holder.imgIcon.setImageResource(musician.getImageResId());

        return convertView;
    }

    private static class ViewHolder {
        ImageView imgIcon;
        TextView tvName;
    }
}
