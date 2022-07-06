package com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.DatabaseHelper;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report.PracticeReport;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.List;

public class RepoPracticeReport {
    Dao<PracticeReport, Integer> practiceReportDao;

    public RepoPracticeReport(DatabaseHelper db) {
        try {
            practiceReportDao = db.getPracticeReportDao();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
    }

    public int create(PracticeReport practiceReport) {
        try {
            return practiceReportDao.create(practiceReport);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public int update(PracticeReport practiceReport) {
        try {
            return practiceReportDao.update(practiceReport);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(PracticeReport practiceReport) {
        try {
            return practiceReportDao.delete(practiceReport);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public PracticeReport getByID(int id) {
        try {
            QueryBuilder<PracticeReport, Integer> qb = practiceReportDao.queryBuilder();
            qb.where().eq("id", id);
            PreparedQuery<PracticeReport> pq = qb.prepare();
            return practiceReportDao.queryForFirst(pq);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }

    public List<PracticeReport> getAll() {
        try {
            return practiceReportDao.queryForAll();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }
}
