package com.example.android.me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView introduction = (TextView) findViewById(R.id.introduction);

        // Set a click listener on that View
        introduction.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, IntroductionActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });


        TextView skill_set = (TextView) findViewById(R.id.skill_set);

        // Set a click listener on that View
        skill_set.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, SkillSetActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView achievements = (TextView) findViewById(R.id.achievements);
        // Set a click listener on that View
        achievements.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, AchievementsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        TextView why_android = (TextView) findViewById(R.id.why_android);

        // Set a click listener on that View
        why_android.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, WhyAndroidActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView experience = (TextView) findViewById(R.id.experience);
        // Set a click listener on that View
        experience.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ExperienceActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        TextView dream_project = (TextView) findViewById(R.id.dream_project);

        // Set a click listener on that View
        dream_project.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, DreamProjectActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }
}