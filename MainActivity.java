package com.greaves.david.materical_cardview_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private EmployeeAdapter mEmployeeAdapter;
    private ArrayList<Employee> mEmployeeArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmployeeArrayList = new ArrayList<>();
        mEmployeeArrayList.add(new Employee("Employee1", "emp1@employee.com", "123456789"));
        mEmployeeArrayList.add(new Employee("Employee2", "emp2@employee.com", "234567890"));
        mEmployeeArrayList.add(new Employee("Employee3", "emp3@employee.com", "345678901"));
        mEmployeeArrayList.add(new Employee("Employee4", "emp4@employee.com", "456789012"));

        mRecyclerView = findViewById(R.id.recycler_view);
        mEmployeeAdapter = new EmployeeAdapter(mEmployeeArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mEmployeeAdapter);
    }
}
