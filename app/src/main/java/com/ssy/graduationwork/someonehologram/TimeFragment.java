package com.ssy.graduationwork.someonehologram;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;


public class TimeFragment extends Fragment {

    private TextView dateDisplay;


    public TimeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_time, null);

        dateDisplay = rootView.findViewById(R.id.date);
        dateDisplay.setText(this.getDate());



        return rootView;
    }

    private String getDate() {
        String currentDateTimeString = DateFormat.getDateInstance().format(new Date());

        return currentDateTimeString;
    }


}
