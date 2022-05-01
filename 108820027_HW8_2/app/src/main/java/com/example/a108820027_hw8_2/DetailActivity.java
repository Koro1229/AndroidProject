package com.example.a108820027_hw8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activaty);

        TextView sportsTitle = findViewById(R.id.detailTitle);
        ImageView sportsImage = findViewById(R.id.detailImage);
        sportsTitle.setText(getIntent().getStringExtra("title"));

        getWindow().setSharedElementEnterTransition(TransitionInflater.from(this).inflateTransition(R.transition.transitions));
        sportsImage.setTransitionName("trans");

        Glide.with(this).load(getIntent().getIntExtra("image_resource",0)).into(sportsImage);
    }
}