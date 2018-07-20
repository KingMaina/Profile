package com.example.user.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        j=(CircleImageView)findViewById(R.id.image);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j.setImageResource(R.drawable.cube);
            }
        });
    }
}
