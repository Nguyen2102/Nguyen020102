package com.example.mvcandroidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail, edtPassword;
    private TextView tvMessage;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        tvMessage = findViewById(R.id.tv_message);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLogin();
            }
        });
    }

    private void clickLogin() {
        String strEmail = edtEmail.getText().toString().trim();
        String strPassword = edtPassword.getText().toString().trim();

        User user = new User(strEmail, strPassword);

        tvMessage.setVisibility(View.VISIBLE);
        if (user.isValidEmail() && user.isValidPassword()) {
            tvMessage.setText("Login success");
            tvMessage.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else {
            tvMessage.setText("Email or Password invalid");
            tvMessage.setTextColor(getResources().getColor(R.color.colorAccent));
        }
    }
}