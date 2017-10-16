package com.example.acerola.mvp.presenter;

import com.example.acerola.mvp.model.Task;
import com.example.acerola.mvp.view.ITaskView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Szym on 15.10.2017.
 */

public class PresenterTask implements IPresenterTask {

    private ITaskView view;
    private List<Task> listOfTasks;

    public PresenterTask(ITaskView view) {

        this.view = view;
        listOfTasks = new ArrayList<>();
    }

    @Override
    public void addNewTask(String name, String descOfTask) {

        listOfTasks.add(new Task(name, descOfTask));
        view.clearData();
    }

    @Override
    public List<Task> getAllTasks() {

        return listOfTasks;
    }

    @Override
    public void deleteTask(Object t) {

        Task task = (t instanceof Task) ? (Task) t : null;

        if (task != null)
            listOfTasks.remove(task);
    }

    @Override
    public void refresh() {

        if (view != null)
            view.loadData();
    }
}