package com.example.mvphelloworld.contract;

public interface MainActivityContract {
    interface View {
        /*Define Rules to perform in your view class*/
        void initViews();

        void setViewData(String data);
    }

    interface Presenter {
        /*Define rules to perform in your presenter class*/
        void onClick();
    }

    interface Model {
        /*Define rules to perform in your model class*/
        String getData();
    }


}
