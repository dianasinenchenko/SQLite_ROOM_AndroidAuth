package com.devitis.sqlite_room_androidauth;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;


import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button all_employee_button;
    EditText employee_editText;
    MultiAutoCompleteTextView all_employee_multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        all_employee_button = (Button) findViewById(R.id.all_employee_button);
        employee_editText = (EditText) findViewById(R.id.employee_editText);
        all_employee_multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.all_employee_multiAutoCompleteTextView);

        all_employee_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get DB
                AppDatabase db = App.getInstance().getDatabase();
                // from Database obj get Dao
                EmployeeDao employeeDao = db.employeeDao();

                List<Employee> employees = employeeDao.getAll();
                employee_editText.setText(employees.toString());
            }
        });





    }
}
