package com.devitis.sqlite_room_androidauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get DB
        AppDatabase db = App.getInstance().getDatabase();
        // from Database obj get Dao
        EmployeeDao employeeDao = db.employeeDao();

    }
}
