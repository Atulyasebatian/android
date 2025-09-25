package com.example.pr7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pr7.R;

public class MainActivity extends AppCompatActivity {

    private ImageView image1, image2;
    private boolean showFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        Button toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showFirst) {
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.VISIBLE);
                } else {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.GONE);
                }
                showFirst = !showFirst;
            }
        });
    }
}
