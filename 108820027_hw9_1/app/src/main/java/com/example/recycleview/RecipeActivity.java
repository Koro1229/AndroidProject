package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecipeActivity extends AppCompatActivity {

    private TextView title;
    private TextView recipe;
    private String mTitle;
    private String mRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Intent intent = getIntent();

        title = findViewById(R.id.text_title);
        recipe = findViewById(R.id.text_content);
        mTitle = "Food Title " + intent.getStringExtra(MainActivity.EXTRA_TITLE);
        title.setText(mTitle);
        mRecipe = "Recipe Content: " + intent.getStringExtra(MainActivity.EXTRA_TITLE);
        recipe.setText(mRecipe);

    }
}