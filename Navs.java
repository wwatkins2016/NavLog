package navlog;

import java.util.*;
import java.lang.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Navs
{
//	private String[] everything;
	private ArrayList<String> Waypoints;
	private ArrayList<Double> latitude;
	private ArrayList<Double> longitude;
	private ArrayList<Double> Miles;
	private ArrayList<Double> ETE;
	private ArrayList<Integer> GroundSpeed;
	private ArrayList<Integer> Heading;
	private int WindDir;
	private int WindVel;
	private int TAS;
	
	public Navs()
	{
//		everything = new ArrayList<String>();
		Waypoints = new ArrayList<String>();
		Miles = new ArrayList<Double>();
		GroundSpeed = new ArrayList<Integer>();
		Heading = new ArrayList<Integer>();
		ETE = new ArrayList<Double>();
		WindDir = 0;
		WindVel = 0;
		TAS = 110;
		System.out.println("ATTENTION! TAS WILL BE ASSUMED TO BE 110 KNOTS!");
	}
	
	public Navs(int WDir, int WVel, int TAS)
	{
		Waypoints = new ArrayList<String>();
		Miles = new ArrayList<Double>();
		GroundSpeed = new ArrayList<Integer>();
		Heading = new ArrayList<Integer>();
		ETE = new ArrayList<Double>();
		WindDir = WDir;
		WindVel = WVel;
		this.TAS = TAS;
	}
	
	void addWaypoint(int num, String name, double latitude, double longitude)
	{
		this.Waypoints.add(name);
		this.latitude.add(latitude);
		this.longitude.add(longitude);
	}
	
	void computeMiles(double long1, double long2, double lat1, double lat2)
	{
		double dlon = long1 - long2;
		double dlat = Math.sin(deg2rad(lat1));
	}
	
	void computeWindCorrection(int dir, int vel, int thdg) //thdg = true heading to waypoint
	{
		
	}
	
	void computeVariance(int whdg, int magvar) //whdg = wind corrected heading
	{
		
	}
	
	void computeTime(int GS, double miles)
	{
		
	}
	
	private double deg2rad(double deg)
	{
		return (deg * Math.PI / 180.0);
	}
	
	private double rad2deg(double rad)
	{
		return (rad * 180 / Math.PI);
	}
}