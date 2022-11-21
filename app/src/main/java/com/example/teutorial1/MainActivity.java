package com.example.teutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.teutorial1.Data.Message;

public class MainActivity extends AppCompatActivity {
    EditText edtMessage;
    Button btnSend;
    Message message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMessage = findViewById(R.id.edtMessage);
        btnSend = findViewById(R.id.btsSend);
        message = new Message();

    }

    public void displayMessage(View view){
          message.setMessage(edtMessage.getText().toString());
          Toast.makeText(this,message.getMessage(),Toast.LENGTH_SHORT).show();
    }
}