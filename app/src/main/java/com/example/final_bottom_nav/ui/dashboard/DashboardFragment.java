package com.example.final_bottom_nav.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.final_bottom_nav.Fifthtest;
import com.example.final_bottom_nav.FirstItem;
import com.example.final_bottom_nav.Firsttest;
import com.example.final_bottom_nav.Fourthtest;
import com.example.final_bottom_nav.MainActivity;
import com.example.final_bottom_nav.R;
import com.example.final_bottom_nav.Secondtest;
import com.example.final_bottom_nav.Seventhtest;
import com.example.final_bottom_nav.Sixthtest;
import com.example.final_bottom_nav.Thirdtest;
import com.example.final_bottom_nav.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


       //final TextView textView = binding.textDashboard;
       //dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        Button firstbuttontest = binding.firstitemtest;
        firstbuttontest.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
               Intent intent = new Intent(requireActivity(), Firsttest.class);
               startActivity(intent);
           }
      });
        Button secondbuttontest = binding.seconditemtest;
        secondbuttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), Secondtest.class);
                startActivity(intent);
            }
        });
        Button thirdbuttontest = binding.thirditemtest;
        thirdbuttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), Thirdtest.class);
                startActivity(intent);
            }
        });
        Button forthbuttontest = binding.forthitemtest;
        forthbuttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), Fourthtest.class);
                startActivity(intent);
            }
        });
        Button fifthbuttontest = binding.fifthitemtest;
        fifthbuttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), Fifthtest.class);
                startActivity(intent);
            }
        });
        Button sixthbuttontest = binding.sixthitemtest;
        sixthbuttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), Sixthtest.class);
                startActivity(intent);
            }
        });
        Button seventhbuttontest = binding.seventhitemtest;
        seventhbuttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), Seventhtest.class);
                startActivity(intent);
            }
        });

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}