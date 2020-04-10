package com.example.myviewmodelexample;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int count = 0 ;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
