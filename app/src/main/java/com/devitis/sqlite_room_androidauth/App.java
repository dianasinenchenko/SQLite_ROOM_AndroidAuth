package com.devitis.sqlite_room_androidauth;

import android.app.Application;
import android.arch.persistence.room.Room;

import java.util.List;

/**
 * Created by Diana on 31.01.2019.
 */

public class App extends Application {
    public static App instance;

    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, AppDatabase.class, "database")
                .build();

        // get DB
        AppDatabase db = App.getInstance().getDatabase();
        // from Database obj get Dao
        EmployeeDao employeeDao = db.employeeDao();

        List<Employee> employees = employeeDao.getAll();


        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "John Smith";
        employee.salary = 10000;

        employeeDao.insert(employee);


    }

    public static App getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
