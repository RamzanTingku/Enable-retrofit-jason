package com.example.ramzanullah.enable_retrofit_jason.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ramzanullah.enable_retrofit_jason.R;
import com.example.ramzanullah.enable_retrofit_jason.model.User;
import com.example.ramzanullah.enable_retrofit_jason.viewholder.RecyclerViewHolder;

import java.util.List;

/**
 * Created by RamzanUllah on 18-Apr-17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<User>itemlist;

    public RecyclerViewAdapter(List<User> itemlist) {
        this.itemlist = itemlist;
    }

}

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_xml,null);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);



        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return this.itemlist.size();
    }
}
