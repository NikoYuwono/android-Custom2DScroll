package niko.buzoo.custom2dscroll.syncscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class HorizontalSynchronizableScrollView extends HorizontalScrollView {

    private HorizontalSynchronizableScrollViewListener horizontalScrollViewListener = null;

    public HorizontalSynchronizableScrollView(Context context) {
        super(context);
    }

    public HorizontalSynchronizableScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public HorizontalSynchronizableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrollViewListener(HorizontalSynchronizableScrollViewListener horizontalScrollViewListener) {
        this.horizontalScrollViewListener = horizontalScrollViewListener;
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
        if(horizontalScrollViewListener != null) {
        	horizontalScrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }
    }

}