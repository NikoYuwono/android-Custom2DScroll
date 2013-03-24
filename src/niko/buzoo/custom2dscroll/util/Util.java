package niko.buzoo.custom2dscroll.util;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

public class Util {
	
	public static float convertDipToPixels(Context context, float dips) {
		return (dips * context.getResources().getDisplayMetrics().density + 0.5f);
	}
	
	public static int getDisplayWidth(Context context) {
		WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		Display display = wm.getDefaultDisplay(); 
		int width = display.getWidth(); 
		
		return width;
	}
	
	public static int getDisplayHeight(Context context) {
		WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		Display display = wm.getDefaultDisplay(); 
		int height = display.getHeight(); 
		
		return height;
	}
}