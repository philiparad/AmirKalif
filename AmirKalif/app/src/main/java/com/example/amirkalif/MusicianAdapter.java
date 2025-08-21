package com.example.amirkalif;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicianAdapter extends ArrayAdapter<Musician> {

    public MusicianAdapter(Context context, List<Musician> data) {
        super(context, 0, data);
    }

    static class ViewHolder {
        ImageView imgIcon;
        TextView tvName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.imgIcon = convertView.findViewById(R.id.imgIcon);
            holder.tvName = convertView.findViewById(R.id.tvName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Musician current = getItem(position);
        if (current != null) {
            holder.tvName.setText(current.toString());
            int imgId = getContext().getResources().getIdentifier(
                    current.getImageFile(), "drawable", getContext().getPackageName());
            if (imgId != 0) {
                holder.imgIcon.setImageResource(imgId);
            } else {
                holder.imgIcon.setImageResource(R.drawable.placeholder);
            }
        }
        return convertView;
    }
}
