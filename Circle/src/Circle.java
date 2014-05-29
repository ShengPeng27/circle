public class Circle{
	private int numberOfWheels,weight;
	public Circle()
	{
		this(100,1000);
	}
	public Circle(int numberOfWheels,int weight)
	{
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	
	public String toString()
	{
		return "Number of wheels: "+numberOfWheels+" weight: "+weight;
	}
}