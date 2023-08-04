package com.shon.ec3.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shon.ec3.databinding.ItemFoodsResumeBinding;
import com.shon.ec3.model.Menus;
import com.shon.ec3.model.Foods;

import java.util.List;

import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;

public class RVResumeAdapter extends RecyclerView.Adapter<RVResumeAdapter.ResumeVH> {
    private List<Menus> menus;

    public RVResumeAdapter(List<Menus> menus) {this.menus = menus;}

    @NonNull
    @Override
    public ResumeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemFoodsResumeBinding binding = ItemFoodsResumeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ResumeVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ResumeVH holder, int position) {

        holder.bind(menus.get(position));

    }

    @Override
    public int getItemCount() {return menus.size();}

    class ResumeVH extends RecyclerView.ViewHolder {

        private ItemFoodsResumeBinding binding;

        public ResumeVH(ItemFoodsResumeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Menus menus) {

            binding.txtNameFood.setText(menus.getName());
            ImageLoader imageLoader = Coil.imageLoader(binding.getRoot().getContext());
            ImageRequest request = new ImageRequest.Builder(binding.getRoot().getContext())
                    .data(menus.getImgUrl())
                    .crossfade(true)
                    .target(binding.imgFood)
                    .build();
            imageLoader.enqueue(request);

            binding.txtLittleDescription.setVisibility(View.GONE);

        }
    }

}
