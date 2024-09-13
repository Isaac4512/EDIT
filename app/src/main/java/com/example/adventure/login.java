package com.example.adventure;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {


    private EditText user, pass;
    private EditText but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login2);

            //Llamo a los elemtentos
            user= findViewById(R.id.user);
            pass= findViewById(R.id.clave);
            but= findViewById(R.id.btn);

            String usu = user.getText().toString();
            String pas = pass.getText().toString();

            but.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                if(TextUtils.isEmpty(usu) || TextUtils.isEmpty(pas))
                {
                    Toast.makeText(getBaseContext(),"Campos Vacios", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (usu.equals("Patricio") && pass.equals("1234")) {
                        Toast.makeText(login.this, "has entrado!", Toast.LENGTH_SHORT).show();

                }else
                    {
                        Toast.makeText(login.this, "campos Incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }

            });
    }
}