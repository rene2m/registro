package com.sotcode.tarearegistro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ConfirmContact extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    String name;
    String date;
    String phone;
    String email;
    String description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_contact);
        Bundle parameter =getIntent().getExtras();
         name = parameter.getString(getResources().getString(R.string.p_name));
         date = parameter.getString(getResources().getString(R.string.p_date));
         phone = parameter.getString(getResources().getString(R.string.p_phone));
         email = parameter.getString(getResources().getString(R.string.p_email));
         description = parameter.getString(getResources().getString(R.string.p_description));

        TextView tv_name = (TextView) findViewById(R.id.text_view_name_2);
        TextView tv_date = (TextView) findViewById(R.id.text_view_date_2);
        TextView tv_phone = (TextView) findViewById(R.id.text_view_phone_2);
        TextView tv_email = (TextView) findViewById(R.id.text_view_email_2);
        TextView tv_description = (TextView) findViewById(R.id.text_view_description_contact_2);

        tv_name.setText(name);
        tv_date.setText(date);
        tv_phone.setText(phone);
        tv_email.setText(email);
        tv_description.setText(description);
    }
        public void onClick(View v) {
            onBackPressed();
            //Añade más funcionalidades
        }
    }



