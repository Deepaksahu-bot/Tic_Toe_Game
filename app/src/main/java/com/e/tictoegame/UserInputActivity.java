package com.e.tictoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInputActivity extends AppCompatActivity {
    EditText player1;
    EditText player2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        player1 = findViewById(R.id.editText);
        player2 = findViewById(R.id.editText2);
        button = findViewById(R.id.play);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = player1.getText().toString();
                String two = player2.getText().toString();
                Intent intent = new Intent(UserInputActivity.this,MainActivity.class);
                intent.putExtra("one",one);
                intent.putExtra("two",two);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}
