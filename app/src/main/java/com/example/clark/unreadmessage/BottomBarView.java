package com.example.clark.unreadmessage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by clark on 2016/10/13.
 */

public class BottomBarView  extends RelativeLayout{
    private int mCount;
    private TextView bar_num;
    private ImageView img;

    public BottomBarView(Context context) {
        this(context, null);
    }

    public BottomBarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.
                from(context).inflate(R.layout.unreadmessage_bar, this);
        bar_num = (TextView) relativeLayout.findViewById(R.id.id_bar_num);
        img = (ImageView) relativeLayout.findViewById(R.id.id_img);
        bar_num.setVisibility(View.GONE);
    }
    public  void setMessageCount(int count){
        mCount = count;
        if (count == 0){
            bar_num.setVisibility(View.GONE);
        }else {
            bar_num.setVisibility(View.VISIBLE);
            if (count < 100){
                bar_num.setText(count+"");
            }else {
                bar_num.setText("99+");
            }
        }
        invalidate();
    }
    public void addMsg(){
        setMessageCount(mCount+1);
    }
    public void setImag(int resouseId){
        img.setImageResource(resouseId);
    }
}
