package com.dev.ehnyn.rubikmath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class RubikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubik);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tvTotal = (TextView) findViewById(R.id.tvTotal);
        TextView tvHidden = (TextView) findViewById(R.id.tvHidden);
        TextView tvFace = (TextView) findViewById(R.id.tvFace);
        TextView tvNext = (TextView) findViewById(R.id.tvNext);

        Intent intent = getIntent();
        int value = intent.getIntExtra("n", 0);

        RubikCalculation rubikCalculation = new RubikCalculation();

        double total = rubikCalculation.getTotalCubes(value);
        String resultTotal = Double.toString(total);
        tvTotal.setText(resultTotal);

        double hidden = rubikCalculation.calcHiddenCubes(value);
        String resultHidden = Double.toString(hidden);
        tvHidden.setText(resultHidden);

        double faces = rubikCalculation.calcFaceCubes(value);
        String resultFaces = Double.toString(faces);
        tvFace.setText(resultFaces);

        int nextRubik = rubikCalculation.calcNextRubik(value);
        String next = nextRubik + "X" + nextRubik + "X" + nextRubik;
        tvNext.setText(next);
    }
}
