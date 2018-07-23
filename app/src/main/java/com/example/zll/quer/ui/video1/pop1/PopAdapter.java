package com.example.zll.quer.ui.video1.pop1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zll.quer.R;
import com.example.zll.quer.bean.PopBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by zll on 2018/7/19.
 */

public class PopAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<PopBean.DataBean> list;
    private Context context;

    public PopAdapter(List<PopBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popfragment, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder holder1= (ViewHolder) holder;
        holder1.pop_sdv.setImageURI(list.get(position).getCover());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private final SimpleDraweeView pop_sdv;

        public ViewHolder(View itemView) {
            super(itemView);
            pop_sdv = itemView.findViewById(R.id.pop_sdv);
        }
    }
}
