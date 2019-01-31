package com.devitis.sqlite_room_androidauth;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create Database obj
        AppDatabase db_create =  Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database").build();
        // get DB
        AppDatabase db = App.getInstance().getDatabase();
        // from Database obj get Dao
        EmployeeDao employeeDao = db.employeeDao();

    }
}
