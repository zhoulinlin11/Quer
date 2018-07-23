package com.example.zll.quer.ui.cross;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zll.quer.R;
import com.example.zll.quer.bean.CrossBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by zll on 2018/7/18.
 */

public class CrossAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<CrossBean.DataBean> list;
    private Context context;

    public CrossAdapter(List<CrossBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cross_recyclerview, parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
         ViewHolder holder1= (ViewHolder) holder;
         holder1.sdv1.setImageURI(list.get(position).getUser().getIcon()+"");
         holder1.name1.setText(list.get(position).getUser().getNickname()+"");
         holder1.time1.setText(list.get(position).getCreateTime());
         holder1.title1.setText(list.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView sdv1;
        private final TextView name1;
        private final TextView time1;
        private final TextView title1;

        public ViewHolder(android.view.View itemView) {
            super(itemView);
            sdv1 = itemView.findViewById(R.id.sdv1);
            name1=itemView.findViewById(R.id.name1);
            time1=itemView.findViewById(R.id.time1);
            title1=itemView.findViewById(R.id.title1);

        }
    }
}
