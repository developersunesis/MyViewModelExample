package com.example.myviewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.myviewmodelexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    MainActivityViewModel provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());

        provider = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        activityMainBinding.increaseCount.setOnClickListener((v) -> {
            provider.setCount(provider.getCount() + 1);

            activityMainBinding.counter.setText(String.valueOf(provider.getCount()));
        });

        activityMainBinding.counter.setText(String.valueOf(provider.getCount()));
    }
}
