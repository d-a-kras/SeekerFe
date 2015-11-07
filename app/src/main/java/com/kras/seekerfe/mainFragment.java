package com.kras.seekerfe;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class mainFragment extends Fragment {

    final String LOG_TAG = "myLogs";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(LOG_TAG, "Fragment2 onCreate");
       return inflater.inflate(R.layout.layout_fragment, null);
    }
}