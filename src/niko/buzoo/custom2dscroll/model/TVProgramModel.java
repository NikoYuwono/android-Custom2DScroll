package niko.buzoo.custom2dscroll.model;

import java.util.ArrayList;

import niko.buzoo.custom2dscroll.util.BaseID;

public class TVProgramModel {

	private ArrayList<String> programName;
	private ArrayList<Integer> programHour;

	private TVProgramModel(int type) {
		if (type == BaseID.STANDART_MODEL) {
			programName = new ArrayList<String>();
			programHour = new ArrayList<Integer>();
		} else if (type == BaseID.PREBUILT_HOUR_MODEL) {
			programName = new ArrayList<String>();
			programHour = new ArrayList<Integer>();
			String[] hours = new String[] { "12\nam", "1\nam", "2\nam",
					"3\nam", "4\nam", "5\nam", "6\nam", "7\nam", "8\nam",
					"9\nam", "10\nam", "11\nam", "12\npm", "1\npm", "2\npm",
					"3\npm", "4\npm", "5\npm", "6\npm", "7\npm", "8\npm",
					"9\npm", "10\npm", "11\npm" };
			for(int i=0;i<hours.length;i++) {
				populateModel(hours[i], 60);
			}
		}

	}

	public static TVProgramModel initTVProgramModel() {
		TVProgramModel tvProgramModel = new TVProgramModel(
				BaseID.STANDART_MODEL);
		return tvProgramModel;
	}

	public static TVProgramModel initTVProgramModelWithPrebuiltHour() {
		TVProgramModel tvProgramModel = new TVProgramModel(
				BaseID.PREBUILT_HOUR_MODEL);
		return tvProgramModel;
	}

	public void setProgramName(ArrayList<String> programName) {
		this.programName = programName;
	}

	public ArrayList<String> getProgramName() {
		return this.programName;
	}

	public void setProgramHour(ArrayList<Integer> programHour) {
		this.programHour = programHour;
	}

	public ArrayList<Integer> getProgramHour() {
		return this.programHour;
	}

	public void populateModel(String programName, int programHour) {
		this.programName.add(programName);
		this.programHour.add(programHour);
	}
}