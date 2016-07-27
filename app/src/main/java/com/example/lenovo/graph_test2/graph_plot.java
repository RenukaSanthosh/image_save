package com.example.lenovo.graph_test2;


import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.Viewport;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Scanner;

public class   graph_plot {



    public void Graph(GraphView graph){

        graph.setTitle("ECG SIGNALS");
        graph.setTitleTextSize(50);
        graph.getGridLabelRenderer().setTextSize(0.0001f);
        graph.getGridLabelRenderer().setHorizontalAxisTitle("TIME");
        graph.getGridLabelRenderer().setVerticalAxisTitle("VOLTAGE");
        graph.getGridLabelRenderer().setNumHorizontalLabels(90);
        graph.getGridLabelRenderer().setNumVerticalLabels(25);
        graph.getGridLabelRenderer().setHorizontalAxisTitleTextSize(25);
        graph.getGridLabelRenderer().setVerticalAxisTitleTextSize(25);
        graph.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graph.getGridLabelRenderer().setHorizontalLabelsVisible(false);


        Viewport viewport = graph.getViewport();
        viewport.setYAxisBoundsManual(true);
        viewport.setMinY(0.00);
        viewport.setMaxY(30.00);
        viewport.setScrollable(true);
        viewport.setScalable(true);
    }
}
