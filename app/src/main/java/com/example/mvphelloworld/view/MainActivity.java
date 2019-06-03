package com.example.mvphelloworld.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvphelloworld.R;
import com.example.mvphelloworld.contract.MainActivityContract;
import com.example.mvphelloworld.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    private MainActivityContract.Presenter presenter;
    private TextView tvSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this);
    }

    @Override
    public void initViews() {
        tvSample = findViewById(R.id.tvSample);
        Button btnLoadData = findViewById(R.id.btnLoadData);
        btnLoadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onClick();
            }
        });
    }

    @Override
    public void setViewData(String data) {
        tvSample.setText(data);
    }
}
