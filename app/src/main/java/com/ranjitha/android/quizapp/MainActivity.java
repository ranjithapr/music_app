/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ranjitha.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * This method is called when the order button is clicked.
     */
    public void submit(View view) {

        int total_score = 0;
        // Get user's name
        RadioGroup question1_selection = (RadioGroup) findViewById(R.id.question1_group);
        int question1_answer = question1_selection.getCheckedRadioButtonId();

        if(question1_answer == R.id.question1_option1)
            total_score++;

        RadioGroup question2_selection = (RadioGroup) findViewById(R.id.question2_group);
        int question2_answer = question2_selection.getCheckedRadioButtonId();

        if(question2_answer == R.id.question2_option2)
            total_score++;

        RadioGroup question3_selection = (RadioGroup) findViewById(R.id.question3_group);
        int question3_answer = question3_selection.getCheckedRadioButtonId();

        if(question3_answer == R.id.question3_option3)
            total_score++;

        RadioGroup question4_selection = (RadioGroup) findViewById(R.id.question4_group);
        int question4_answer = question4_selection.getCheckedRadioButtonId();

        if(question4_answer == R.id.question4_option4)
            total_score++;

        RadioGroup question5_selection = (RadioGroup) findViewById(R.id.question5_group);
        int question5_answer = question5_selection.getCheckedRadioButtonId();

        if(question5_answer == R.id.question5_option1)
            total_score++;

        Toast.makeText(this,"You have scored "+total_score+"/5",Toast.LENGTH_LONG).show();

    }


}
