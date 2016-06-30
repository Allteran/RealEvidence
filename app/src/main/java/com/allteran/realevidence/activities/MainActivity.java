package com.allteran.realevidence.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.allteran.realevidence.R;
import com.allteran.realevidence.fragments.MainFragment;

/**
 * Created by Allteran on 30.06.2016.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_main,new MainFragment())
                .commit();
    }
}
