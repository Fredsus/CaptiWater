package com.example.alfredsusanto.captiwater;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReportFragment extends Fragment {
    View vReport;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        vReport = inflater.inflate(R.layout.fragment_report, container, false);
        return vReport;
    }
}
