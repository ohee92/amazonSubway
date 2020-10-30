package com.example.amazonsubway;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SubwayClicked extends Activity {
    private String station;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemclicked);

        Intent intent = getIntent();
        TextView stationName = (TextView) findViewById(R.id.clickedStation);
        station = intent.getStringExtra("stationName");
        stationName.setText(station);
        Toast.makeText(this, "커밋을 확인하자", Toast.LENGTH_SHORT).show();
    }
}
