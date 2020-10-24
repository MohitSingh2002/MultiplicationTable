package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.multiplicationtable.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTable(Integer.parseInt(binding.etNumber.getText().toString().trim()));
            }
        });

    }

    private void showTable(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1;i<=10;i++) {
            stringBuilder.append(number)
                    .append(" x ")
                    .append(i)
                    .append(" = ")
                    .append(number*i)
                    .append("\n");
        }

        showOnTextView(stringBuilder.toString());

    }

    private void showOnTextView(String str) {
        binding.tvTable.setText(""+str);
    }

}
