package com.example.android.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.UnicodeSetIterator;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name, birthdate, country;
        name = findViewById(R.id.name);
        birthdate = findViewById(R.id.birthday);
        country = findViewById(R.id.country);

        name.setText(getResources().getString(R.string.name));
        birthdate.setText(getResources().getString(R.string.birth_date));
        country.setText(getResources().getString(R.string.country));
        name.setTextSize(32);
        birthdate.setTextSize(20);
        country.setTextSize(20);

        ImageView profilePicture = findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.babies_cover);
    }
}
