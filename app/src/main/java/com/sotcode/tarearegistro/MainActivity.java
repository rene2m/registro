package com.sotcode.tarearegistro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    private TextInputEditText enter_name;
    private TextInputEditText enter_date;
    private TextInputEditText enter_phone;
    private TextInputEditText enter_email;
    private TextInputEditText enter_description;
    private String name;
    private String date;
    private String phone;
    private String email;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter_name          =(TextInputEditText) findViewById(R.id.enter_name);
        enter_date          =(TextInputEditText) findViewById(R.id.enter_date);
        enter_phone         =(TextInputEditText) findViewById(R.id.enter_phone);
        enter_email         =(TextInputEditText) findViewById(R.id.enter_email);
        enter_description   =(TextInputEditText) findViewById(R.id.enter_description);
         }
    public void siguienteActividad(View v){
        contactos=new ArrayList<Contacto>();

        contactos.add(new Contacto(enter_name.getText().toString(),enter_date.getText().toString(),enter_phone.getText().toString(),enter_email.getText().toString(),enter_description.getText().toString()));

        Intent intent = new Intent(MainActivity.this,ConfirmContact.class);
        intent.putExtra(getResources().getString(R.string.p_name),enter_name.getText().toString());
        intent.putExtra(getResources().getString(R.string.p_date),enter_date.getText().toString());
        intent.putExtra(getResources().getString(R.string.p_phone),enter_phone.getText().toString());
        intent.putExtra(getResources().getString(R.string.p_email),enter_email.getText().toString());
        intent.putExtra(getResources().getString(R.string.p_description),enter_description.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle parameter =getIntent().getExtras();
        name = parameter.getString(getResources().getString(R.string.p_name));
        date = parameter.getString(getResources().getString(R.string.p_date));
        phone = parameter.getString(getResources().getString(R.string.p_phone));
        email = parameter.getString(getResources().getString(R.string.p_email));
        description = parameter.getString(getResources().getString(R.string.p_description));

    }
}

