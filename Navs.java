package navlog;

public class Navs
{
	private String[] everything;
	private String[] Waypoints;
	private int[] Miles;
	private int[] GroundSpeed;
	private int[] Heading;
	private int[] ETE;
	private int WindDir;
	private int WindVel;
	private int TAS;
	
	public Navs()
	{
		everything = new String[10];
		Waypoints = new String[10];
		Miles = new int[10];
		GroundSpeed = new int[10];
		Heading = new int[10];
		ETE = new int[10];
		WindDir = 0;
		WindVel = 0;
		TAS = 110;
		System.out.println("ATTENTION! TAS WILL BE ASSUMED TO BE 110 KNOTS!");
	}
	public Navs(int l, int WDir, int WVel, int TAS)
	{
		everything = new String[l];
		Waypoints = new String[l];
		Miles = new int[l];
		GroundSpeed = new int[l];
		Heading = new int[l];
		ETE = new int[l];
		WindDir = WDir;
		WindVel = WVel;
		this.TAS = TAS;
		System.out.println("ATTENTION! TAS WILL BE ASSUMED TO BE 110 KNOTS!");
	}
}
