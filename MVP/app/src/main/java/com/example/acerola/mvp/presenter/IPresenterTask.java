package com.example.acerola.mvp.presenter;

import com.example.acerola.mvp.model.Task;

import java.util.List;

/**
 * Created by Szym on 15.10.2017.
 */

public interface IPresenterTask {

    void addNewTask(String name, String descOfTask);

    List<Task> getAllTasks();

    void deleteTask(Object name);

    void refresh();
}