package com.example.ramzanullah.enable_retrofit_jason.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ramzanullah.enable_retrofit_jason.R;


/**
 * Created by RamzanUllah on 18-Apr-17.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView id, name, mobile;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        id = (TextView) itemView.findViewById(R.id.id_id);
        name = (TextView) itemView.findViewById(R.id.name_id);
        mobile = (TextView) itemView.findViewById(R.id.mobile_id);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(, "", Toast.LENGTH_SHORT).show();
    }
}
