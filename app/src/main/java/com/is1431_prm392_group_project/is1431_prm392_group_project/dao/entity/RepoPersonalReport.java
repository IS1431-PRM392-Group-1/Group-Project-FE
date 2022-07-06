package com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.DatabaseHelper;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report.PersonalReport;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.List;

public class RepoPersonalReport {
    Dao<PersonalReport, Integer> personalReportDeo;

    public RepoPersonalReport(DatabaseHelper db) {
        try {
            personalReportDeo = db.getPersonalReportDao();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
    }

    public int create(PersonalReport practiceReport) {
        try {
            return personalReportDeo.create(practiceReport);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public int update(PersonalReport practiceReport) {
        try {
            return personalReportDeo.update(practiceReport);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(PersonalReport practiceReport) {
        try {
            return personalReportDeo.delete(practiceReport);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public PersonalReport getByID(int id) {
        try {
            QueryBuilder<PersonalReport, Integer> qb = personalReportDeo.queryBuilder();
            qb.where().eq("id", id);
            PreparedQuery<PersonalReport> pq = qb.prepare();
            return personalReportDeo.queryForFirst(pq);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }

    public List<PersonalReport> getAll() {
        try {
            return personalReportDeo.queryForAll();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }
}
