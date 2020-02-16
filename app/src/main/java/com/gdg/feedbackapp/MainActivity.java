package com.gdg.feedbackapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button submitBtn;
    EditText nameEdt;
    RatingBar rb;
    Spinner qualificationSpn;
    RadioButton studentRB,profRB;
    EditText suggestionET;
    SeekBar ageSB;
    CheckBox agreeCB;
ArrayList<GDGFeedback> gList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        nameEdt = (EditText)findViewById(R.id.nameEdt);
        setSupportActionBar(toolbar);

        submitBtn = (Button)findViewById(R.id.submitBtn);

        rb = (RatingBar)findViewById(R.id.feedbackRB);
        qualificationSpn = (Spinner)findViewById(R.id.qualificationSpn);
        studentRB =(RadioButton)findViewById(R.id.studentRB);
        profRB=(RadioButton)findViewById(R.id.profRB);
        suggestionET=(EditText) findViewById(R.id.suggestionET);
        ageSB=(SeekBar)findViewById(R.id.ageSB);
        agreeCB=(CheckBox)findViewById(R.id.consentCB);



    submitBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            String name = nameEdt.getText().toString();
            String suggestion = suggestionET.getText().toString();
            String qualification =qualificationSpn.getSelectedItem().toString();
            String occupation=null;
            if(studentRB.isChecked()){

                occupation="Student";

            }

            if(profRB.isChecked()){
                occupation="Professional";
            }
            int age = ageSB.getProgress();
            boolean isAgree = agreeCB.isChecked();
            int rating = rb.getProgress();

          GDGFeedback gf = new GDGFeedback(name,occupation,rating,qualification,suggestion,age,isAgree);

            Intent i = new Intent(MainActivity.this,ThankYouActivity.class);
            i.putExtra("name",nameEdt.getText().toString());
            i.putExtra("feedback",gf);
            startActivity(i);

        }
    });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
