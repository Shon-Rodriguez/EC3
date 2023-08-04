package com.shon.ec3.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.shon.ec3.R;
import com.shon.ec3.databinding.FragmentHomeBinding;
import com.shon.ec3.model.Foods;
import com.shon.ec3.model.Menus;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter = new RVResumeAdapter(getData());
        binding.rvFoodsResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.rvFoodsResume.setLayoutManager(layoutManager);
    }

    private List<Menus> getData() {
        List<Menus> menus = new ArrayList<>();
        menus.add(new Foods("https://buenazo.cronosmedia.glr.pe/original/2021/06/27/606b558c255c081036000e14.jpg", "Ceviche","Platillo preparado con pescado crudo marinado en jugo de limón y condimentado con otros ingredientes que varían según la región"));

        return menus;
    }

}