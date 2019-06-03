package com.example.mvphelloworld.presenter;

import com.example.mvphelloworld.contract.MainActivityContract;
import com.example.mvphelloworld.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View view;
    private MainActivityContract.Model model;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
        initPresenter();
    }

    private void initPresenter() {
        model = new MainActivityModel();
        view.initViews();
    }

    @Override
    public void onClick() {
        String data = model.getData();
        this.view.setViewData(data);
    }
}
