package com.example.acerola.mvp.view;

/**
 * Created by Szym on 15.10.2017.
 */

public interface ITaskView {

    void loadData();

    void addTask();

    boolean onItemLongClick(int position);

    void clearData();
}