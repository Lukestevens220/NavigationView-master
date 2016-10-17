package com.android4dev.navigationview.ProductsByCategory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android4dev.navigationview.Category.CategoryResults;
import com.android4dev.navigationview.R;

import java.util.List;

/**
 * Created by TheAppExperts on 17/10/2016.
 */

public class ProductsByCategoryAdapter extends RecyclerView.Adapter{

    private List<ProductsByCategoryResults> categories;
    private int rowLayout;
    private Context context;

    public ProductsByCategoryAdapter(List<ProductsByCategoryResults> categories, Context context) {
        this.categories = categories;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.categories, viewGroup, false);
        return new com.android4dev.navigationview.Category.CategoryAdapter.ProductViewHolder(v);
    }


    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        LinearLayout productLayout;
        TextView category;

        public ProductViewHolder(View v) {
            super(v);
            productLayout = (LinearLayout) v.findViewById(R.id.product_layout);
            category = (TextView) v.findViewById(R.id.category);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,  int position) {
        ProductsByCategoryResults categoryResults = categories.get(position);
        com.android4dev.navigationview.ProductsByCategory.ProductsByCategoryAdapter.ProductViewHolder holder = (com.android4dev.navigationview.ProductsByCategory.ProductsByCategoryAdapter.ProductViewHolder) viewHolder;
        holder.category.setText(categoryResults.getDescription());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
