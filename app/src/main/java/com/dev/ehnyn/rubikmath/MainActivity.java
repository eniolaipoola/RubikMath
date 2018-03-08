package com.dev.ehnyn.rubikmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = (Button) findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.etTotal);
                int n = Integer.parseInt(editText.getText().toString());
                if( n <= 1){
                    editText.setError("Value of n must be greater than 1");
                    return;
                }
                Intent resultIntent = new Intent(MainActivity.this, RubikActivity.class);
                resultIntent.putExtra("n", n);
                startActivity(resultIntent);
            }
        });
    }
}
