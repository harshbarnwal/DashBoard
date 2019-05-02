package com.tech4use.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DashBoard2 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ModelItems> itemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_board2);

        //initiating the items lists
        itemsList = new ArrayList<>();
        //adding items to the list
        itemsList.add(new ModelItems(R.drawable.attendance_colored, "Attendance",
                "125"));
        itemsList.add(new ModelItems(R.drawable.staff_colored, "Staff",
                "125"));
        itemsList.add(new ModelItems(R.drawable.students_colored, "Students",
                "125"));
        itemsList.add(new ModelItems(R.drawable.events_colored, "Events",
                "125"));
        itemsList.add(new ModelItems(R.drawable.gallery_colored, "Gallery",
                "125"));
        itemsList.add(new ModelItems(R.drawable.holidays_colored, "Holidays",
                "125"));

        //getting the recyclerview
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        //making sure that the size of the view doesn't change
        //creating and setting the layoutmanager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.Adapter customAdapter = new RecyclerviewAdapter(itemsList, this);
        //setting the adapter
        recyclerView.setAdapter(customAdapter);

    }
}
