package com.creeds_code.androidloginscreentutorial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.creeds_code.androidloginscreentutorial.databinding.SignupTabFragmentBinding;

public class SignupTabFragment extends Fragment {

    SignupTabFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = SignupTabFragmentBinding.inflate(inflater,container,false);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}