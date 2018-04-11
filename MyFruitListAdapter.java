package com.retrofitdemo.retrofitlearnigtopics.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.retrofitdemo.retrofitlearnigtopics.R;
import com.retrofitdemo.retrofitlearnigtopics.model.FruitModel;
import com.retrofitdemo.retrofitlearnigtopics.utils.CircleTransform;

import java.util.List;

/**
 * Created by KP on 4/10/2018.
 */

public class MyFruitListAdapter extends RecyclerView.Adapter<MyFruitListAdapter.MyViewHolder> {

    private Context mContext;
    private LayoutInflater inflater;
    private List<FruitModel> fruitList;

    public MyFruitListAdapter(Context context, List<FruitModel> list) {
        this.fruitList = list;
        this.mContext = context;
        inflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fruit_row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            FruitModel fruitModel = fruitList.get(position);
            holder.fruit_name.setText(fruitModel.getFruit_name());
            holder.fruit_cal.setText(fruitModel.getFruit_cal());
        Glide.with(mContext)
                .load(Uri.parse(fruitModel.getFruit_image())) // add your image url
                .placeholder(R.mipmap.ic_launcher)
                .transform(new CircleTransform(mContext))
                .into(holder.fruit_image);
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView fruit_image;
        public TextView fruit_name;
        public TextView fruit_cal;

        public MyViewHolder(View itemView) {
            super(itemView);

            fruit_image = (ImageView) itemView.findViewById(R.id.imgFruit);
            fruit_name = (TextView) itemView.findViewById(R.id.txtFruitName);
            fruit_cal = (TextView) itemView.findViewById(R.id.txtFruitCalaries);

        }
    }
}
