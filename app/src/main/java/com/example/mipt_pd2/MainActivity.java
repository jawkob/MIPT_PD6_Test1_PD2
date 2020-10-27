package com.example.mipt_pd2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import static com.example.mipt_pd2.StringProcessing.charCounter;
import static com.example.mipt_pd2.StringProcessing.wordCounter;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner setup
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.chars_words_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void btnCalculate(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String spinnerSelection = spinner.getSelectedItem().toString();
        int id = (int) spinner.getSelectedItemId();
        TextInputEditText inputTextBlock = findViewById(R.id.textBar);
        String input = inputTextBlock.getText().toString();


        if (charCounter(input) > 0) {
            if (id == 0) {
                String answer = "Number of characters entered: ";
                answer += charCounter(input);
                TextView counterResult = (TextView) findViewById(R.id.textView2);
                counterResult.setText(answer);
            }

            if (id == 1) {
                String answer = "Number of words entered: ";
                answer += wordCounter(input);
                TextView counterResult = (TextView) findViewById(R.id.textView2);
                counterResult.setText(answer);
            }
        }
        else
            Toast.makeText(getApplicationContext(),"Will you be so kind to enter something before pressing the button? Thanks.", Toast.LENGTH_SHORT).show();
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
    }

    public void onNothingSelected(AdapterView<?> parent) {
    }

}