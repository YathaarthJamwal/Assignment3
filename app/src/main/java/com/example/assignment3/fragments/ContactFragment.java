package com.example.assignment3.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.assignment3.R;
import com.example.assignment3.adapters.ItemAdapter;
import com.example.assignment3.models.Item;

import java.util.ArrayList;

public class ContactFragment extends Fragment {
    ArrayList<Item> items;

    public ContactFragment() {

    }
    public static ContactFragment newInstance() {
        ContactFragment fragment = new ContactFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact, container, false);
        items = new ArrayList<>();
        Item c1= new Item("Yathaarth","9999999999",R.drawable.facebook);
        Item c2 = new Item("Yathu","8888888888",R.drawable.facebook);
        Item c3 = new Item("DaBoss","7777777777",R.drawable.facebook);
        ListView listView=(ListView)v.findViewById(R.id.list_view);
        items.add(c1);
        items.add(c2);
        items.add(c3);
        ItemAdapter adapter =  new ItemAdapter(getActivity(),items);
        listView.setAdapter(adapter);
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
