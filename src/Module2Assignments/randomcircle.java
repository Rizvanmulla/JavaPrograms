package Module2Assignments;

public class randomcircle 
{
	double r=Math.random();
	double circumference=2*Math.PI*r;
	double area=Math.PI*r*r;
	
	void circle()
	{
		for(int i=1;i<=5;i++)
			{
				System.out.println("Circumference of Circle is "+circumference);
				System.out.println("Area of Circle is "+area);
			}
	}
	public static void main(String[] args) 
	{
		randomcircle rc = new randomcircle(); 
		rc.circle();
	}
}
