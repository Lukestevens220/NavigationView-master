package com.android4dev.navigationview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android4dev.navigationview.R;
import com.android4dev.navigationview.model.CategoryResults;

import java.util.List;


/**
 * Created by TheAppExperts on 12/10/2016.
 */

public class ProductAdapter extends RecyclerView.Adapter{

    private List<CategoryResults.Listing> categories;
    private int rowLayout;
    private Context context;

    public ProductAdapter(List<CategoryResults.Listing> categories, Context context) {
        this.categories = categories;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.categories, viewGroup, false);
        return new ProductViewHolder(v);
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
        CategoryResults.Listing categoryResults = categories.get(position);
        ProductViewHolder holder = (ProductViewHolder) viewHolder;
        holder.category.setText(categoryResults.getName());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
