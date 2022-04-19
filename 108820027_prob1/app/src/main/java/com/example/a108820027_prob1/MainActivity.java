package com.example.a108820027_prob1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private EditText name;
    private String gender;
    private String hobby;
    private String department;
    private String text_name;

    public static final String EXTRA_NAME = "com.example.a108820027_prob1.extra.NAME";
    public static final String EXTRA_GENDER = "com.example.a108820027_prob1.extra.GENDER";
    public static final String EXTRA_DEPARTMENT = "com.example.a108820027_prob1.extra.DEPARTMENT";
    public static final String EXTRA_HOBBY = "com.example.a108820027_prob1.extra.HOBBY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox3 = findViewById(R.id.checkBox3);
        checkbox2 = findViewById(R.id.checkBox2);
        checkbox1 = findViewById(R.id.checkBox1);
        name = findViewById(R.id.name_text);

        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.male:
                if (checked)
                    gender = "Male";
                    displayToast(getString(R.string.male_toast));
                break;
            case R.id.female:
                if (checked)
                    gender = "Female";
                    displayToast(getString(R.string.female_toast));
                break;
            default:
                break;
        }
    }


    public void onCheckBoxChecked(View view) {
        if(checkbox1.isChecked())
            displayToast("Sport");
        if(checkbox2.isChecked())
            displayToast("Movie");
        if(checkbox3.isChecked())
            displayToast("Reading");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
        department = spinnerLabel;
        displayToast(spinnerLabel);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void onSubmitClicked(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        text_name = name.getText().toString();

        hobby = "";
        if(checkbox1.isChecked())
            hobby += "Sport ";
        if(checkbox2.isChecked())
            hobby += "Movie ";
        if(checkbox3.isChecked())
            hobby += "Reading ";

        intent.putExtra(EXTRA_NAME, text_name);
        intent.putExtra(EXTRA_HOBBY, hobby);
        intent.putExtra(EXTRA_GENDER, gender);
        intent.putExtra(EXTRA_DEPARTMENT, department);

        startActivity(intent);

    }
}