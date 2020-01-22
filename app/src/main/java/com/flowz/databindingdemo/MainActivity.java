package com.flowz.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.flowz.databindingdemo.databinding.ActivityMainBinding;
import com.flowz.databindingdemo.entity.Contact;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private ClickHandler handler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contact contact = new Contact("John", "johnsnow@yahoo.com");

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setContact(contact);

        handler = new ClickHandler(this);
        activityMainBinding.setClickHandler(handler);
    }


    public class ClickHandler {
        private Context context;

        public ClickHandler(Context context){
            this.context = context;
        }

        public void simpleButtonClick (View view){
            Toast.makeText(context, "This ia a simple onClick with DataBinding", Toast.LENGTH_SHORT).show();
        }

        public boolean simpleButtonLongClick (View view){
            Toast.makeText(context, "This ia a simple onLongClick with DataBinding", Toast.LENGTH_SHORT).show();
            return false;

        }

        public boolean simpleButtonClickwithParameters (View view, Contact contact){
            Toast.makeText(context, "This ia a simple Button Click method with parameters using DataBinding \n"+
                    "Name: " +contact.name +" \n" +
                    "email : " +contact.email,  Toast.LENGTH_SHORT).show();
            return false;

        }


    }
}


