package com.example.reelvideoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.reelvideoapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    ActivityMainBinding binding ;
    ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMainBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        this.getTheme().applyStyle(R.style.FullScreen , false);
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.ankur ,R.drawable.ankur , "Ankur Warikoo" ));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.football ,R.drawable.football , "Cristaino" ));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.nasdaily ,R.drawable.nasdaily , "NasDaily"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.rajshamani ,R.drawable.rajshamani , "Raj Shamani" ));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.unfinance ,R.drawable.unfinance , "Unfinance" ));

        adapter = new Adapter(MainActivity.this , arrayList) ;
        binding.viewPager.setAdapter(adapter);

    }
}