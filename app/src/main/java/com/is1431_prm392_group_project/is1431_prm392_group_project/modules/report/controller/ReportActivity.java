package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.report.controller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.report.provider.ReportService;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class ReportActivity extends AppCompatActivity {
    GraphView graphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // on below line we are initializing our graph view.
        graphView = findViewById(R.id.idGraphView);
        ReportService service = new ReportService(this);
        // on below line we are adding data to our graph view.
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(service.getReportGraphData());
        // after adding data to our line graph series.
        // on below line we are setting
        // title for our graph view.
        graphView.setTitle("Your training graph view");
        // on below line we are setting
        // text color to our graph view.
        graphView.setTitleColor(R.color.purple_200);
        // on below line we are setting
        // our title text size.
        graphView.setTitleTextSize(18);
        // on below line we are adding
        // data series to our graph view.
        graphView.addSeries(series);
    }
}
