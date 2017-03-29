package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by fabiohh on 3/29/17.
 */

public class AvatarRecyclerView extends RecyclerView {
    public AvatarRecyclerView(Context context) {
        super(context);
    }

    public AvatarRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AvatarRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
