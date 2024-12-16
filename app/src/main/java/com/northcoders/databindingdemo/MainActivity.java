package com.northcoders.databindingdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.northcoders.databindingdemo.databinding.ActivityMainBinding;
import com.northcoders.databindingdemo.model.Person;

public class MainActivity extends AppCompatActivity {

    // Instantiate data binding class
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Instantiate Person class
        Person person = new Person("Emmanuel", "30", "asiegbuemmanuelekee@gmail.com");

        // Bind activity by setting activity binding class to data binding util class
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Set data object to activity main
        activityMainBinding.setPerson(person);
    }
}