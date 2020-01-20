package com.flowz.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.flowz.databindingdemo.databinding.ActivityMainBinding;
import com.flowz.databindingdemo.entity.Contact;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contact contact = new Contact("John", "johnsnow@yahoo.com");

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setContact(contact);



    }
}
