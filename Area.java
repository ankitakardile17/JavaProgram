package encapsulationassignment;

public class Area {
	private int length;
	private int breadth;
	private int area;
	
	public void setLen(int l)
	{
		length=l;
	}
	public int getLen()
	{
		return length;
	}
	public void setBreadth(int b)
	{
		breadth=b;
	}
	public int getBreadth()
	{
		return breadth;
	}
	public int getArea(int l,int b)
	{
		return area=l*b;
	}

}
