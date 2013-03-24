package niko.buzoo.custom2dscroll;

import java.util.ArrayList;

import niko.buzoo.custom2dscroll.model.TVProgramModel;
import niko.buzoo.custom2dscroll.syncscroll.HorizontalSynchronizableScrollView;
import niko.buzoo.custom2dscroll.syncscroll.HorizontalSynchronizableScrollViewListener;
import niko.buzoo.custom2dscroll.util.Util;
import niko.buzoo.custom2dscroll.view.Day;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	private Context context;
	private ScrollView svContainer;
	private LinearLayout llContainerMain, llContainerHorizontal;
	private HorizontalSynchronizableScrollView hsvContainer, hsvDate;
	private ArrayList<TVProgramModel> days;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.context = this;
		days = new ArrayList<TVProgramModel>();
		initContent();
		initView();
	}

	private void initContent() {
		TVProgramModel mon = TVProgramModel.initTVProgramModel();
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("J-MELO", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("Itadakimasu!", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("ASIA 7 DAYS", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("TOMORROW beyond 3.11", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("J-MELO", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("ITADAKIMASU", 30);
		mon.populateModel("ASIA 7 DAYS", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("TOMORROW beyond 3.11", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("J-MELO", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("ITADAKIMASU", 30);
		mon.populateModel("ASIA 7 DAYS", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("TOMORROW beyond 3.11", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("J-MELO", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("Itadakimasu!", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("ASIA 7 DAYS", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("TOMORROW beyond 3.11", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("J-MELO", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("ITADAKIMASU", 30);
		mon.populateModel("ASIA 7 DAYS", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("TOMORROW beyond 3.11", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("J-MELO", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("ITADAKIMASU", 30);
		mon.populateModel("ASIA 7 DAYS", 30);
		mon.populateModel("NEWSLINE", 30);
		mon.populateModel("TOMORROW beyond 3.11", 30);
		days.add(mon);

		TVProgramModel tue = TVProgramModel.initTVProgramModel();
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("TOKYO FASHION EXPRESS", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("journeys in japan", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("Today's Close-Up", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("At Home with Venetia in Kyoto", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("TOKYO FASHION EXPRESS", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("journeys in japan", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("Today's Close-Up", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("At Home with Venetia in Kyoto", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("TOKYO FASHION EXPRESS", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("journeys in japan", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("Today's Close-Up", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("At Home with Venetia in Kyoto", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("TOKYO FASHION EXPRESS", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("journeys in japan", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("Today's Close-Up", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("At Home with Venetia in Kyoto", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("TOKYO FASHION EXPRESS", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("journeys in japan", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("Today's Close-Up", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("At Home with Venetia in Kyoto", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("TOKYO FASHION EXPRESS", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("journeys in japan", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("Today's Close-Up", 30);
		tue.populateModel("NEWSLINE", 30);
		tue.populateModel("At Home with Venetia in Kyoto", 30);
		days.add(tue);

		TVProgramModel wed = TVProgramModel.initTVProgramModel();
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("imagine-nation", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("TOKYO EYE", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("Today's Close-Up", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("MAPPING KYOTO STREETS", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("imagine-nation", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("TOKYO EYE", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("Today's Close-Up", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("MAPPING KYOTO STREETS", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("imagine-nation", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("TOKYO EYE", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("Today's Close-Up", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("MAPPING KYOTO STREETS", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("imagine-nation", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("TOKYO EYE", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("Today's Close-Up", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("MAPPING KYOTO STREETS", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("imagine-nation", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("TOKYO EYE", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("Today's Close-Up", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("MAPPING KYOTO STREETS", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("imagine-nation", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("TOKYO EYE", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("Today's Close-Up", 30);
		wed.populateModel("NEWSLINE", 30);
		wed.populateModel("MAPPING KYOTO STREETS", 30);
		days.add(wed);

		TVProgramModel thu = TVProgramModel.initTVProgramModel();
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Great Gear", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Begin Japanology", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("WORLD TV TRYOUT", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("TAKESHI Art Beat", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Great Gear", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Begin Japanology", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("WORLD TV TRYOUT", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("TAKESHI Art Beat", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Great Gear", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Begin Japanology", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("WORLD TV TRYOUT", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("TAKESHI Art Beat", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Great Gear", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Begin Japanology", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("WORLD TV TRYOUT", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("TAKESHI Art Beat", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Great Gear", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Begin Japanology", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("WORLD TV TRYOUT", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("TAKESHI Art Beat", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Great Gear", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("Begin Japanology", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("WORLD TV TRYOUT", 30);
		thu.populateModel("NEWSLINE", 30);
		thu.populateModel("TAKESHI Art Beat", 30);
		days.add(thu);

		TVProgramModel fri = TVProgramModel.initTVProgramModel();
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Science View", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("JIB Program", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("ASIAN VOICES", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Asia Insight", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Science View", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("JIB Program", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("ASIAN VOICES", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Asia Insight", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Science View", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("JIB Program", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("ASIAN VOICES", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Asia Insight", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Science View", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("JIB Program", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("ASIAN VOICES", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Asia Insight", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Science View", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("JIB Program", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("ASIAN VOICES", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Asia Insight", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Science View", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("JIB Program", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("ASIAN VOICES", 30);
		fri.populateModel("NEWSLINE", 30);
		fri.populateModel("Asia Insight", 30);
		days.add(fri);

		TVProgramModel sat = TVProgramModel.initTVProgramModel();
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Kawaii International", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("WORLD TV SELECTION", 50);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Festivals of the Orient!", 10);
		sat.populateModel("Four Seasons in Japan", 10);
		sat.populateModel("JAPAN 7 DAYS", 30);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("NHK  Documentary", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Kawaii International", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("WORLD TV SELECTION", 50);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Festivals of the Orient!", 10);
		sat.populateModel("Four Seasons in Japan", 10);
		sat.populateModel("JAPAN 7 DAYS", 30);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("NHK  Documentary", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Kawaii International", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("WORLD TV SELECTION", 50);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Festivals of the Orient!", 10);
		sat.populateModel("Four Seasons in Japan", 10);
		sat.populateModel("JAPAN 7 DAYS", 30);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("NHK  Documentary", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Kawaii International", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("WORLD TV SELECTION", 50);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Festivals of the Orient!", 10);
		sat.populateModel("Four Seasons in Japan", 10);
		sat.populateModel("JAPAN 7 DAYS", 30);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("NHK  Documentary", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Kawaii International", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("WORLD TV SELECTION", 50);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Festivals of the Orient!", 10);
		sat.populateModel("Four Seasons in Japan", 10);
		sat.populateModel("JAPAN 7 DAYS", 30);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("NHK  Documentary", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Kawaii International", 45);
		sat.populateModel("YJK mini", 5);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("WORLD TV SELECTION", 50);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("Festivals of the Orient!", 10);
		sat.populateModel("Four Seasons in Japan", 10);
		sat.populateModel("JAPAN 7 DAYS", 30);
		sat.populateModel("NEWSLINE", 10);
		sat.populateModel("NHK  Documentary", 45);
		sat.populateModel("YJK mini", 5);
		days.add(sat);

		TVProgramModel sun = TVProgramModel.initTVProgramModel();
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("cool japan", 45);
		sun.populateModel("Fudoki", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("SPORTS JAPAN", 30);
		sun.populateModel("Meet and Speak", 10);
		sun.populateModel("Satoyama", 10);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("March to Recovery", 50);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("ASIA BIZ FORECAST", 30);
		sun.populateModel("Inspiring Landscapes", 15);
		sun.populateModel("NHK Documentary 5 min", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("cool japan", 45);
		sun.populateModel("Fudoki", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("SPORTS JAPAN", 30);
		sun.populateModel("Meet and Speak", 10);
		sun.populateModel("Satoyama", 10);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("March to Recovery", 50);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("ASIA BIZ FORECAST", 30);
		sun.populateModel("Inspiring Landscapes", 15);
		sun.populateModel("NHK Documentary 5 min", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("cool japan", 45);
		sun.populateModel("Fudoki", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("SPORTS JAPAN", 30);
		sun.populateModel("Meet and Speak", 10);
		sun.populateModel("Satoyama", 10);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("March to Recovery", 50);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("ASIA BIZ FORECAST", 30);
		sun.populateModel("Inspiring Landscapes", 15);
		sun.populateModel("NHK Documentary 5 min", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("cool japan", 45);
		sun.populateModel("Fudoki", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("SPORTS JAPAN", 30);
		sun.populateModel("Meet and Speak", 10);
		sun.populateModel("Satoyama", 10);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("March to Recovery", 50);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("ASIA BIZ FORECAST", 30);
		sun.populateModel("Inspiring Landscapes", 15);
		sun.populateModel("NHK Documentary 5 min", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("cool japan", 45);
		sun.populateModel("Fudoki", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("SPORTS JAPAN", 30);
		sun.populateModel("Meet and Speak", 10);
		sun.populateModel("Satoyama", 10);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("March to Recovery", 50);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("ASIA BIZ FORECAST", 30);
		sun.populateModel("Inspiring Landscapes", 15);
		sun.populateModel("NHK Documentary 5 min", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("cool japan", 45);
		sun.populateModel("Fudoki", 5);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("SPORTS JAPAN", 30);
		sun.populateModel("Meet and Speak", 10);
		sun.populateModel("Satoyama", 10);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("March to Recovery", 50);
		sun.populateModel("NEWSLINE", 10);
		sun.populateModel("ASIA BIZ FORECAST", 30);
		sun.populateModel("Inspiring Landscapes", 15);
		sun.populateModel("NHK Documentary 5 min", 5);
		days.add(sun);
	}

	private void initView() {
		llContainerMain = new LinearLayout(context);
		LayoutParams lpContainerMain = new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		llContainerMain.setLayoutParams(lpContainerMain);
		llContainerMain.setOrientation(LinearLayout.VERTICAL);

		svContainer = new ScrollView(context);
		LayoutParams lpSV = new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.WRAP_CONTENT);
		svContainer.setLayoutParams(lpSV);
		svContainer.setVerticalScrollBarEnabled(false);
		svContainer.setVerticalFadingEdgeEnabled(false);

		llContainerHorizontal = new LinearLayout(context);
		LayoutParams lpContainerHorizontal = new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		llContainerHorizontal.setLayoutParams(lpContainerHorizontal);
		llContainerHorizontal.setOrientation(LinearLayout.HORIZONTAL);

		ScrollView svLeftBar = new ScrollView(context);
		LayoutParams lpSVLeftBar = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		svLeftBar.setLayoutParams(lpSVLeftBar);
		svLeftBar.setVerticalScrollBarEnabled(false);
		svLeftBar.setVerticalFadingEdgeEnabled(false);
		svLeftBar.addView(Day.initDayScheduleHour(context));

		hsvContainer = new HorizontalSynchronizableScrollView(context);
		LayoutParams lpHSV = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		hsvContainer.setLayoutParams(lpHSV);
		hsvContainer.setHorizontalScrollBarEnabled(false);
		hsvContainer.setHorizontalFadingEdgeEnabled(false);
		hsvContainer.setScrollViewListener(new horizontalScrollSync());

		LinearLayout llContainerContent = new LinearLayout(context);
		LayoutParams lpContainerContent = new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		llContainerContent.setLayoutParams(lpContainerContent);
		llContainerContent.setOrientation(LinearLayout.HORIZONTAL);

		for (int i = 0; i < 7; i++) {
			llContainerContent.addView(Day.initDayScheduleWithTVProgramModel(
					context, days.get(i)));
		}
		hsvContainer.addView(llContainerContent);

		llContainerHorizontal.addView(svLeftBar);
		llContainerHorizontal.addView(hsvContainer);

		svContainer.addView(llContainerHorizontal);

		llContainerMain.addView(createHorizontalHeader());
		llContainerMain.addView(svContainer);

		LinearLayout llMain = (LinearLayout) findViewById(R.id.llMainContainer);
		llMain.addView(llContainerMain);
	}

	private LinearLayout createHorizontalHeader() {
		LinearLayout llContainerHorizontalHeader = new LinearLayout(context);
		LayoutParams lpContainerHorizontalHeader = new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		llContainerHorizontalHeader
				.setLayoutParams(lpContainerHorizontalHeader);
		llContainerHorizontalHeader.setOrientation(LinearLayout.HORIZONTAL);

		LinearLayout llGapFiller = new LinearLayout(context);
		LayoutParams lpGapFiller = new LayoutParams(
				Util.getDisplayWidth(context) / 12, LayoutParams.WRAP_CONTENT);
		llGapFiller.setLayoutParams(lpGapFiller);

		hsvDate = new HorizontalSynchronizableScrollView(context);
		LayoutParams lpHsvDate = new LayoutParams(LayoutParams.FILL_PARENT,
				(int) ((Util.getDisplayHeight(context) * 8) * (20 / 1440.0)));
		hsvDate.setLayoutParams(lpHsvDate);
		hsvDate.setHorizontalScrollBarEnabled(false);
		hsvDate.setHorizontalFadingEdgeEnabled(false);
		hsvDate.setScrollViewListener(new horizontalScrollSync());

		LinearLayout llContainerChildHorizontalHeader = new LinearLayout(
				context);
		LayoutParams lpContainerChildHorizontalHeader = new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		llContainerChildHorizontalHeader
				.setOrientation(LinearLayout.HORIZONTAL);
		llContainerChildHorizontalHeader
				.setLayoutParams(lpContainerChildHorizontalHeader);
		for (int i = 0; i < 7; i++) {
			llContainerChildHorizontalHeader
					.addView(createChildHorizontalHeader("testday",
							"testmonth", "testdayname"));
		}

		hsvDate.addView(llContainerChildHorizontalHeader);

		llContainerHorizontalHeader.addView(llGapFiller);
		llContainerHorizontalHeader.addView(hsvDate);

		return llContainerHorizontalHeader;
	}

	private LinearLayout createChildHorizontalHeader(String day, String month,
			String dayName) {
		LinearLayout llDate = new LinearLayout(context);
		LayoutParams lpDate = new LayoutParams(
				Util.getDisplayWidth(context) / 4,
				(int) ((Util.getDisplayHeight(context) * 8) * (20 / 1440.0)));
		llDate.setLayoutParams(lpDate);
		llDate.setBackgroundDrawable(context.getResources().getDrawable(
				R.drawable.border));

		TextView tvDay = new TextView(context);
		LayoutParams lpDay = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		tvDay.setLayoutParams(lpDay);
		tvDay.setText(day);

		TextView tvMonth = new TextView(context);
		LayoutParams lpMonth = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		tvMonth.setLayoutParams(lpMonth);
		tvMonth.setText(month);

		TextView tvDayName = new TextView(context);
		LayoutParams lpDayName = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		tvDayName.setLayoutParams(lpDayName);
		tvDayName.setText(dayName);

		llDate.addView(tvDay);
		llDate.addView(tvMonth);
		llDate.addView(tvDayName);

		return llDate;
	}

	private class horizontalScrollSync implements
			HorizontalSynchronizableScrollViewListener {

		@Override
		public void onScrollChanged(
				HorizontalSynchronizableScrollView scrollView, int x, int y,
				int oldx, int oldy) {
			if (scrollView == hsvContainer) {
				hsvDate.scrollTo(x, y);
			} else if (scrollView == hsvDate) {
				hsvContainer.scrollTo(x, y);
			}

		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
