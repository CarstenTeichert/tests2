package dmi.friedata.model;

public class SnowMeasurement {  
	// fra tabel obsdb.snow_man

	private String insid;
	
	private String statid;
	
	private String timeobs;
	
	private boolean best;
	
	private double snow_depth_man;
	
	private int snow_depth_man_qc1;
	
	private double snow_cover_man;
	
	private int snow_cover_man_qc1;
	
	public String getInsid() {
		return insid;
	}
	public void setInsid(String insid) {
		this.insid = insid;
	}
	public String getStatid() {
		return statid;
	}
	public void setStatid(String statid) {
		this.statid = statid;
	}
	public String getTimeobs() {
		return timeobs;
	}
	public void setTimeobs(String timeobs) {
		this.timeobs = timeobs;
	}
	public boolean isBest() {
		return best;
	}
	public void setBest(boolean best) {
		this.best = best;
	}
	public double getSnow_depth_man() {
		return snow_depth_man;
	}
	public void setSnow_depth_man(double snow_depth_man) {
		this.snow_depth_man = snow_depth_man;
	}
	public int getSnow_depth_man_qc1() {
		return snow_depth_man_qc1;
	}
	public void setSnow_depth_man_qc1(int snow_depth_man_qc1) {
		this.snow_depth_man_qc1 = snow_depth_man_qc1;
	}
	public double getSnow_cover_man() {
		return snow_cover_man;
	}
	public void setSnow_cover_man(double snow_cover_man) {
		this.snow_cover_man = snow_cover_man;
	}
	public int getSnow_cover_man_qc1() {
		return snow_cover_man_qc1;
	}
	public void setSnow_cover_man_qc1(int snow_cover_man_qc1) {
		this.snow_cover_man_qc1 = snow_cover_man_qc1;
	}
	
	public String toString(){
//		private int insid;
//		private long statid;
//		private String timeobs;
//		private boolean best;		
//		private double snow_depth_man;		
//		private int snow_depth_man_qc1;		
//		private double snow_cover_man;		
//		private int snow_cover_man_qc1;
		StringBuilder sb = new StringBuilder();
		sb.append("***** Snow Details *****\n");
		sb.append("insid="+getInsid()+"\n");
		sb.append("statid="+getStatid()+"\n");
		sb.append("timeobs="+getTimeobs()+"\n");
		sb.append("best="+isBest()+"\n");
		sb.append("snow_depth_man="+getSnow_depth_man()+"\n");
		sb.append("snow_depth_man_qc1="+getSnow_depth_man_qc1()+"\n");
		sb.append("snow_cover_man="+getSnow_cover_man()+"\n");
		sb.append("snow_cover_man_qc1="+getSnow_cover_man_qc1()+"\n");
		sb.append("*****************************");
		
		return sb.toString();
	}
}

