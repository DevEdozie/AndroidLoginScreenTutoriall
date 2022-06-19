package com.creeds_code.androidloginscreentutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.creeds_code.androidloginscreentutorial.databinding.ActivityLoginBinding;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //set tablayout
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Login"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Signup"));
        //set gravity
         binding.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
         //adapter
        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(),this,binding.tabLayout.getTabCount());
        binding.viewPager.setAdapter(adapter);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));



    }
}