package com.example.assignment3.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.assignment3.R;
import com.example.assignment3.fragments.ContactFragment;
import com.example.assignment3.models.Item;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {
    List<Item> items;
    Activity context;

    public ItemAdapter(Activity context, List objects) {
        super(context, R.layout.list_item, objects);
        this.context = context ;
        items = objects;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater() ;
        View row = inflater.inflate(R.layout.list_item, null, false);
        TextView name = row.findViewById(R.id.name);
        ImageView image = row.findViewById(R.id.image);
        TextView number = row.findViewById(R.id.number);
        name.setText(items.get(position).getName());
        image.setImageResource(items.get(position).getImage_id());
        number.setText(items.get(position).getNumber());
        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Contact for Support", Toast.LENGTH_SHORT).show();;
            }
        });
        return row;
    }
}

