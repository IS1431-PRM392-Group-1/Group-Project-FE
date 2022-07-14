package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.report.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report.PracticeReport;
import com.jjoe64.graphview.series.DataPoint;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ReportService extends IReportService {
    public ReportService(Context context) {
        super(context);
    }

    public DataPoint[] getReportGraphData() {
        List<PracticeReport> reports = repo.getPracticeReport().getAll();
        Collections.sort(reports, new StringAsDateComparator());
        DataPoint[] reportPoints = new DataPoint[reports.size()];
        int i = 0;
        Random random = new Random();
        if (reports.size() < 5) {
            reportPoints = new DataPoint[15 + reports.size()];
            for (i = 0; i < 15; i++) {
                reportPoints[i] = new DataPoint(i, random.nextInt(200));
            }
            for (; i < reports.size() + 15; i++) {
                reportPoints[i] = new DataPoint(i, reports.get(i - 15).getCalo());
            }
        } else {
            for (; i < reports.size(); i++) {
                reportPoints[i] = new DataPoint(i, reports.get(i).getCalo());
            }
        }
        return reportPoints;
    }

    class StringAsDateComparator implements Comparator<PracticeReport> {
        public int compare(PracticeReport lhs, PracticeReport rhs) {
            return lhs.getDate().compareTo(rhs.getDate());
        }
    }
}
