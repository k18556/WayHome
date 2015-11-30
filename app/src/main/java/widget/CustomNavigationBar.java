package widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import normal.wayhome.com.wayhome.R;

/**
 * Created by yaoshibang on 2014/12/8.
 *
 * This Class is the header of each Activity's layout
 */
public class CustomNavigationBar extends LinearLayout {
    ViewHolder viewHolder;
    public CustomNavigationBar(Context context) {
        super(context);
        initLayout();
    }

    public CustomNavigationBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout();
    }

    public CustomNavigationBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initLayout();
    }

    private void initLayout() {
        LayoutInflater.from(getContext()).inflate(R.layout.custom_navigationbar_layout, this);
        viewHolder = new ViewHolder(this);
    }


    /** 设置左布局监听器 */
    public void setLeftListener(View.OnClickListener leftListener) {
        viewHolder.llNavLeft.setOnClickListener(leftListener);
    }

    /** 设置中间title文案 */
    public void setTitle(String title) {
        viewHolder.tvNavMiddle.setText(title);
    }

    /** 设置中间布局监听器 */
    public void setMiddleListener(View.OnClickListener leftListener) {
        viewHolder.llNavMiddle.setOnClickListener(leftListener);
    }

    /** 隐藏左边。 默认显示 */
    public void setLeftLayoutGone() {
        viewHolder.llNavLeft.setVisibility(View.GONE);
    }

    /** 隐藏右边。 默认隐藏 */
    public void setRightLayoutGone() {
        viewHolder.llNavRight.setVisibility(View.GONE);
    }

    /** 添加右布局
     * 因右布局变化多，建议另创建一个布局控件再加进来。
     * */
    protected void addViewToRightLayout(View view) {
        viewHolder.llNavRight.addView(view);
    }


    class ViewHolder {
        @Bind(R.id.llNavLeft)LinearLayout llNavLeft;
        @Bind(R.id.ivNavLeft)ImageView ivNavLeft;

        @Bind(R.id.llNavMiddle)LinearLayout llNavMiddle;
        @Bind(R.id.tvNavMiddle)TextView tvNavMiddle;

        @Bind(R.id.llNavRight)LinearLayout llNavRight;
        ViewHolder(View view) {
            ButterKnife.bind(ViewHolder.this, view);
        }
    }
}
