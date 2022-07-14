package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.providers;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseAmount;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report.PracticeReport;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ExerciseService extends IExerciseService {
    public ExerciseService(Context context) {
        super(context);
    }

    public List<ExerciseAmount> getExerciseAmount(String list_id) {
        ExerciseList list = repo.getExerciseList().getByID(Integer.parseInt(list_id));
        return repo.getExerciseAmount().getAllByList(list);
    }

    public ArrayList<ExerciseList> getExerciseLists() {
        return (ArrayList<ExerciseList>) repo.getExerciseList().getAll();
    }

    public boolean saveCaloReport(ExerciseAmount exerciseAmounts) {
        int calo = exerciseAmounts.getExercise().getCalo() * exerciseAmounts.getAmount();

        Date date = new Date(Calendar.getInstance().getTimeInMillis());
        PracticeReport practiceReport = new PracticeReport(calo, date);
        try {
            practiceReport.update(repo);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
