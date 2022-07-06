package com.is1431_prm392_group_project.is1431_prm392_group_project.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.Exercise;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report.PersonalReport;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report.PracticeReport;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.user.User;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;
import java.sql.SQLException;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "db.sqlite";
    private static final int DATABASE_VERSION = 1;
    private Dao<User, String> userDao = null;
    private Dao<PracticeReport, Integer> practiceReportDao = null;
    private Dao<PersonalReport, Integer> personalReportDeo =null;
    private Dao<Exercise, Integer> exerciseDao = null;
   private Dao<ExerciseList, Integer> exerciseListDao =null;
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        DatabaseInitializer initializer = new DatabaseInitializer(context);
        try {
            initializer.createDatabase();
            initializer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, User.class);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't create database", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onUpgrade");
            TableUtils.dropTable(connectionSource, User.class, true);
            onCreate(db);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
            throw new RuntimeException(e);
        }
    }

    public Dao<User, String> getUserDao() throws SQLException {
        if (userDao == null) {
            userDao = DaoManager.createDao(getConnectionSource(), User.class);
        }
        return userDao;
    }

    @Override
    public void close() {
        super.close();
        userDao = null;
        practiceReportDao = null;
        personalReportDeo= null;
        exerciseListDao = null;
    }

    public Dao<PracticeReport, Integer> getPracticeReportDao() throws SQLException {
        if (practiceReportDao == null) {
            practiceReportDao = DaoManager.createDao(getConnectionSource(), PracticeReport.class);
        }
        return practiceReportDao;
    }

    public Dao<PersonalReport, Integer> getPersonalReportDao() throws SQLException  {
        if (personalReportDeo == null) {
            personalReportDeo = DaoManager.createDao(getConnectionSource(), PersonalReport.class);
        }
        return personalReportDeo;
    }

    public Dao<ExerciseList, Integer> getExerciseListDao()throws SQLException  {
        if (exerciseListDao == null) {
            exerciseListDao = DaoManager.createDao(getConnectionSource(), ExerciseList.class);
        }
        return exerciseListDao;
    }

    public Dao<Exercise, Integer> getExerciseDao() throws SQLException  {
        if (exerciseDao == null) {
            exerciseDao = DaoManager.createDao(getConnectionSource(), Exercise.class);
        }
        return exerciseDao;
    }
}
