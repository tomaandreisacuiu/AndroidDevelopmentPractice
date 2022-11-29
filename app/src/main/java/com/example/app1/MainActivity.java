package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    public void onBtnClick(View view) {
        EditText edtTextName = findViewById(R.id.editTextTextPersonName);
        TextView txtHello = findViewById(R.id.txtMessage);
        txtHello.setText("Hello, " + edtTextName.getText().toString());
    }
     */

    public void onRegisterBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastname);
        TextView txtEmail = findViewById(R.id.Email);

        EditText edtTxtFirstName = findViewById(R.id.edtFirstName);
        EditText edtTxtLastName = findViewById(R.id.edtLastName);
        EditText edtTxtEmail = findViewById(R.id.edtEmail);

        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());

    }
}