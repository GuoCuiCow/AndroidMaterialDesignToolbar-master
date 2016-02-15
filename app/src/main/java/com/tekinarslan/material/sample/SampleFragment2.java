package com.tekinarslan.material.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleFragment2 extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static SampleFragment2 newInstance(int position) {
        SampleFragment2 f = new SampleFragment2();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);
        View rootView = inflater.inflate(R.layout.layout1, container, false);
        ProgressBarCircular progressBarCircular = (ProgressBarCircular) rootView.findViewById(R.id.progress);
        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fabButton);
        fab.setDrawableIcon(getResources().getDrawable(R.drawable.plus));
        fab.setBackgroundColor(getResources().getColor(R.color.light));
        progressBarCircular.setBackgroundColor(getResources().getColor(R.color.light));
//        switch (position) {
//            case 0:
//                fab.setBackgroundColor(getResources().getColor(R.color.material_deep_teal_500));
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.material_deep_teal_500));
//                break;
//            case 1:
//                fab.setBackgroundColor(getResources().getColor(R.color.red));
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.red));
//
//                break;
//            case 2:
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.blue));
//                fab.setBackgroundColor(getResources().getColor(R.color.blue));
//
//                break;
//            case 3:
//                fab.setBackgroundColor(getResources().getColor(R.color.accent));
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.accent));
//
//                break;
//        }

        return rootView;
    }
}