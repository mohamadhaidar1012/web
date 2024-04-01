package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button displayButton;
    EditText nameEditText;
    TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayoutComponents();
        initDisplayButton();
    }

    private void initLayoutComponents(){
        displayButton = findViewById(R.id.buttonDisplay);
        nameEditText = findViewById(R.id.editTextName);
        displayTextView = findViewById(R.id.textViewDisplay);
    }

    private void initDisplayButton(){
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameToDisplay = nameEditText.getText().toString();
                displayTextView.setText(getResources().getString(R.string.welcome_message,nameToDisplay));
                nameEditText.setText("");
                Log.d("MainActivity", "This is a log message");
            }
        });
    }

}

