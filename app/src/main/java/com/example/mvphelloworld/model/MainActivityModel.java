package com.example.mvphelloworld.model;

import com.example.mvphelloworld.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {
    @Override
    public String getData() {
        return "Hello World! Program using MVP";
    }
}
