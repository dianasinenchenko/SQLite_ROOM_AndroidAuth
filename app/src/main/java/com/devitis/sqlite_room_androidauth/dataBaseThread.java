package com.devitis.sqlite_room_androidauth;

import java.util.List;

/**
 * Created by Diana on 31.01.2019.
 */

public class dataBaseThread extends Thread {
    private String employee;


    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }


    public void run() {
        // get DB
        AppDatabase db = App.getInstance().getDatabase();
        // from Database obj get Dao
        EmployeeDao employeeDao = db.employeeDao();

        List<Employee> employees = employeeDao.getAll();
        // employee_editText.setText(employees.toString());


    }
}
