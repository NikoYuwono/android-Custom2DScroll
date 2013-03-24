package niko.buzoo.custom2dscroll.syncscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class SynchronizableScrollView extends ScrollView {

    private SynchronizableScrollViewListener scrollViewListener = null;

    public SynchronizableScrollView(Context context) {
        super(context);
    }

    public SynchronizableScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SynchronizableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrollViewListener(SynchronizableScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
        if(scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }
    }

}