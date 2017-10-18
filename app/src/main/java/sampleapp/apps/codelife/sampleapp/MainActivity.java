package sampleapp.apps.codelife.sampleapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText _mpassword;
    private EditText _memailAddress;
    private ProgressBar _progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupWidgets();
    }

    private void setupWidgets() {
        Button sign_in = (Button) findViewById(R.id.signInButton);
        sign_in.setOnClickListener(this);

        _mpassword = (EditText)findViewById(R.id.PasswordEditText);
        _memailAddress = (EditText)findViewById(R.id.PasswordEditText);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.signInButton){
            //valid Email and Password
            Boolean isValid = ValidateAndAuthenticateUser(_memailAddress,_mpassword);
            if(isValid){
                try {
                    finish();
                    startActivity(new Intent(this, HomePageTabbedActivity.class));
                }
                catch (Exception exc){
                    System.err.print(exc);
                }

            }
            else
                Toast.makeText(this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();

        }
    }

    private Boolean ValidateAndAuthenticateUser(EditText memailAddress, EditText mpassword) {
        //Toast.makeText(this,"Logging In", Toast.LENGTH_SHORT).show();
        String email = memailAddress.getText().toString().trim();
        String pass = mpassword.getText().toString().trim();

        //for now everyone is authenticated
        Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show();


        return true;
    }
}
