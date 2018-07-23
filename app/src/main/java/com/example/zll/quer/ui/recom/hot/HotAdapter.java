package com.example.zll.quer.ui.recom.hot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zll.quer.R;
import com.example.zll.quer.bean.RecomBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by zll on 2018/7/17.
 */

public class HotAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<RecomBean.DataBean> list;
    private Context context;

    public HotAdapter(List<RecomBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hot_recyclerview, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
     ViewHolder holder1= (ViewHolder) holder;
     holder1.sdv.setImageURI(list.get(position).getCover());
     holder1.name.setText(list.get(position).getUser().getNickname());
     holder1.time.setText(list.get(position).getCreateTime());
     holder1.title.setText(list.get(position).getWorkDesc());
     holder1.jcvp.setUp(list.get(position).getVideoUrl(),JCVideoPlayer.SCREEN_LAYOUT_NORMAL,"视频标题");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView sdv;
        private final TextView name;
        private final TextView time;
        private final TextView title;
        private final JCVideoPlayer jcvp;

        public ViewHolder(android.view.View itemView) {
            super(itemView);
            sdv = itemView.findViewById(R.id.sdv);
            name=itemView.findViewById(R.id.name);
            time=itemView.findViewById(R.id.time);
            title=itemView.findViewById(R.id.title);
            jcvp = itemView.findViewById(R.id.jcvp);
        }
    }
}
