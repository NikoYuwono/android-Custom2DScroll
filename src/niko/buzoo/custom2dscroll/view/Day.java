package niko.buzoo.custom2dscroll.view;

import java.util.ArrayList;

import niko.buzoo.custom2dscroll.model.TVProgramModel;
import niko.buzoo.custom2dscroll.util.BaseID;
import niko.buzoo.custom2dscroll.util.Util;

import android.content.Context;
import android.widget.LinearLayout;

public class Day extends LinearLayout {

	private Context context;
	private TVProgramModel programModel;
	private ArrayList<String> programName;
	private ArrayList<Integer> programHour;
	
	private Day(Context context) {
		super(context);
		this.context = context;
		programModel = TVProgramModel.initTVProgramModelWithPrebuiltHour();
		LayoutParams lpDay = new LayoutParams(Util.getDisplayWidth(context)/12,LayoutParams.WRAP_CONTENT);
		this.setLayoutParams(lpDay);
		this.setOrientation(VERTICAL);
		initContent();
		initView(BaseID.SCHEDULE_CONTENT);
	}
	
	private Day(Context context, TVProgramModel programModel) {
		super(context);
		this.context = context;
		this.programModel = programModel;
		LayoutParams lpDay = new LayoutParams(Util.getDisplayWidth(context)/4,LayoutParams.WRAP_CONTENT);
		this.setLayoutParams(lpDay);
		this.setOrientation(VERTICAL);
		initContent();
		initView(BaseID.SCHEDULE_CONTENT);
	}
	
	public static Day initDayScheduleHour(Context context) {
		Day day = new Day(context);
		return day;
	}
	
	public static Day initDayScheduleWithTVProgramModel(Context context, TVProgramModel programModel) {
		Day day = new Day(context, programModel);
		return day;
	}
	
	private void initContent() {
		programName = programModel.getProgramName();
		programHour = programModel.getProgramHour();
	}
	
	private void initView(int type) {
    	for(int i=0;i<programName.size();i++) {
    		this.addView(ChildDay.initChildDayProgramSchedule(context, programName.get(i), programHour.get(i), type));
    	}
	}
}