package com.example.birthdaywishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.createBirthdayCard);

    }

    public void CreateBirthdayCard(View view) {
        EditText nameEditText = findViewById(R.id.InputName);
        String name = nameEditText.getText().toString();

        Intent intent = new Intent(this, WishingBirthdayActivity.class);
        intent.putExtra(WishingBirthdayActivity.USER_NAME,name);
        startActivity(intent);



        /*
        Toast.makeText(this, "Name is "+name,Toast.LENGTH_LONG).show();
         */
    }
}