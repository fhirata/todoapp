package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by fabiohh on 3/29/17.
 */

public class AvatarCarouselAdapter extends RecyclerView.Adapter{
    ArrayList<Avatar> mAvatarList;
    Context mContext;
    CircleCarouselViewInterface mCircleCarouselViewInterface;

    public AvatarCarouselAdapter(Context context, ArrayList<Avatar> avatarList, CircleCarouselViewInterface circleCarouselViewInterface) {
        mContext = context;
        mAvatarList = avatarList;
        mCircleCarouselViewInterface = circleCarouselViewInterface;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
