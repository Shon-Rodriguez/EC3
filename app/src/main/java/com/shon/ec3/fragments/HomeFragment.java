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
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        binding.rvFoodsResume.setLayoutManager(layoutManager);
    }

    private List<Menus> getData() {
        List<Menus> menus = new ArrayList<>();
        menus.add(new Foods("https://buenazo.cronosmedia.glr.pe/original/2021/06/27/606b558c255c081036000e14.jpg", "Ceviche","Platillo preparado con pescado crudo marinado en jugo de limón y condimentado con otros ingredientes que varían según la región"));
        menus.add(new Foods("https://cdn0.recetasgratis.net/es/posts/8/6/2/causa_limena_31268_orig.jpg", "Causa","Este plato está elaborado a base de papa amarilla peruana."));
        menus.add(new Foods("https://www.peru.travel/Contenido/General/Imagen/es/543/1.1/arroz-chaufa.jpg", "Chaufa","Mezcla de arroz frito acompañada de verduras, tortilla de huevo y carnes al gusto."));
        menus.add(new Foods("https://static.wixstatic.com/media/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg/v1/fill/w_640,h_616,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/8fb78d_c77b22a3f89744a4bb1329a8d5c4e2a5~mv2.jpg", "Lomo Saltado","Este plato típico consiste en saltear el lomo de res en una sartén con aceite vegetal."));
        menus.add(new Foods("https://www.comidastipicasperuanas.com/wp-content/uploads/2023/04/Receta-de-sopa-seca-chinchana-Comidas-Peruanas.jpg", "Sopa Seca","Plato típico de la costa peruana, también conocida como Manchapecho"));
        menus.add(new Foods("https://i.ytimg.com/vi/F1eKSg5aBtw/maxresdefault.jpg", "Tallarines Rojos","Los tallarines rojos, se acompañan de tomate y carne de pollo."));
        menus.add(new Foods("https://recetinas.com/wp-content/uploads/2020/01/lentejas-con-chorizo.jpg", "Lentejas","Es un guiso de Lentejas con Arroz, Papa y Carne"));
        menus.add(new Foods("https://t2.uc.ltmcdn.com/es/posts/8/1/4/como_hacer_frijoles_colombianos_31418_orig.jpg", "Frejoles","Guiso de Frejoles con Arroz, Papa y Chancho"));
        menus.add(new Foods("https://www.recetasnestle.com.ec/sites/default/files/styles/recipe_detail_desktop/public/srh_recipes/c2a08535fd04d38c99fd37755fd3dc37.png?itok=exAVQSmV", "Pure de Papa","Plato elaborado con papas cocidas y molidas, así como otros ingredientes."));
        menus.add(new Foods("https://editorialtelevisa.brightspotcdn.com/dims4/default/6e5be33/2147483647/strip/true/crop/600x338+0+31/resize/1000x563!/quality/90/?url=https%3A%2F%2Fk2-prod-editorial-televisa.s3.amazonaws.com%2Fbrightspot%2Fwp-content%2Fuploads%2F2021%2F05%2Fgarbanzos.jpg", "Garbanzos","Guiso de Garbanzoz con Arror"));

        return menus;
    }

}