package com.creeds_code.androidloginscreentutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.creeds_code.androidloginscreentutorial.databinding.LoginTabFragmentBinding;

public class LoginTabFragment extends Fragment {

    LoginTabFragmentBinding binding;
    float v = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = LoginTabFragmentBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        return binding.getRoot();

    }
}