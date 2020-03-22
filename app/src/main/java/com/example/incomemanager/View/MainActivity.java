package com.example.incomemanager.View;

import android.os.Bundle;

import com.example.incomemanager.R;
import com.example.incomemanager.view_model.UserViewModel;
import com.example.incomemanager.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserViewModel userViewModel=new UserViewModel(this);
        activityMainBinding.setUser(userViewModel);


    }
}
