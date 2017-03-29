package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.example.android.architecture.blueprints.todoapp.R;

import java.util.ArrayList;

import static com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity.FRAGMENT_TAG;

/**
 * Created by fabiohh on 3/29/17.
 */

public class SmartTopperView extends RelativeLayout {
    private AvatarCarouselAdapter mCarouselAdapter;
    private AvatarRecyclerView mAvatarRecyclerView;
    private CircleCarouselViewInterface mCircleCarouselViewInterface;

    public SmartTopperView(Context context) {
        super(context);
        init(context);
    }

    public SmartTopperView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public SmartTopperView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {

        inflate(getContext(), R.layout.layout_smart_topper_view, this);

        FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
        Fragment parentFragment = fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        mCircleCarouselViewInterface = (CircleCarouselViewInterface) parentFragment;

        mCarouselAdapter = new AvatarCarouselAdapter(context, new ArrayList<Avatar>(), mCircleCarouselViewInterface);

    }
}
