package niko.buzoo.custom2dscroll.view;

import niko.buzoo.custom2dscroll.R;
import niko.buzoo.custom2dscroll.util.Util;
import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChildDay extends LinearLayout {

	private Context context;
	private String programName;
	private float programHour;

	private ChildDay(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	private ChildDay(Context context, String programName, int programHour, int type) {
		super(context);
		this.context = context;
		this.programName = programName;
		this.programHour = programHour;
		LayoutParams lpChildDay = new LayoutParams(
				LayoutParams.FILL_PARENT,
				(int) ((Util.getDisplayHeight(context) * 8) * (programHour / 1440.0)));
		this.setLayoutParams(lpChildDay);
		this.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.border));
		this.setOrientation(VERTICAL);
		initView();
	}
	
	public static ChildDay initChildDayProgramSchedule(Context context, String programName, int programHour, int type) {
		ChildDay childDay = new ChildDay(context, programName, programHour, type);
		return childDay;
	}

	public void initView() {
		LinearLayout llContainerHour = new LinearLayout(context);
		LayoutParams lpContainerHour = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		lpContainerHour.gravity = Gravity.TOP;
		llContainerHour.setLayoutParams(lpContainerHour);
		llContainerHour.setGravity(Gravity.LEFT);
		
		TextView tvHour = new TextView(context);
		LayoutParams lpHour = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		tvHour.setLayoutParams(lpHour);
		tvHour.setTextSize(14);
		tvHour.setTextColor(context.getResources().getColor(R.color.black));
		tvHour.setText(Float.toString(programHour));
		
		llContainerHour.addView(tvHour);

		TextView tvName = new TextView(context);
		LayoutParams lpName = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		lpName.gravity = Gravity.CENTER;
		tvName.setLayoutParams(lpName);
		tvName.setTextSize(18);
		tvName.setTextColor(context.getResources().getColor(R.color.black));
		tvName.setText(programName);

		this.addView(llContainerHour);
		this.addView(tvName);
	}
}