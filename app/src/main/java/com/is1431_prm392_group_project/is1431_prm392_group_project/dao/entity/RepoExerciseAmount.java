package com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.DatabaseHelper;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseAmount;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.List;

public class RepoExerciseAmount {
    Dao<ExerciseAmount, Integer> exerciseAmountDao;

    public RepoExerciseAmount(DatabaseHelper db) {
        try {
            exerciseAmountDao = db.getExerciseAmountDao();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
    }

    public int create(ExerciseAmount exercise) {
        try {
            return exerciseAmountDao.create(exercise);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public int update(ExerciseAmount exercise) {
        try {
            return exerciseAmountDao.update(exercise);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(ExerciseAmount exercise) {
        try {
            return exerciseAmountDao.delete(exercise);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return 0;
    }

    public ExerciseAmount getByID(int id) {
        try {
            QueryBuilder<ExerciseAmount, Integer> qb = exerciseAmountDao.queryBuilder();
            qb.where().eq("id", id);
            PreparedQuery<ExerciseAmount> pq = qb.prepare();
            return exerciseAmountDao.queryForFirst(pq);
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }

    public List<ExerciseAmount> getAll() {
        try {
            return exerciseAmountDao.queryForAll();
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }

    public List<ExerciseAmount> getAllByList(ExerciseList list) {
        try {
            QueryBuilder<ExerciseAmount, Integer> qb = exerciseAmountDao.queryBuilder();
            return exerciseAmountDao.queryForEq("list", list.getId());
        } catch (SQLException e) {
            // TODO: Exception Handling
            e.printStackTrace();
        }
        return null;
    }
}
