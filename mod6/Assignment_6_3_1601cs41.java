class Volume
{
	public Volume(int a, int b, int c) // cuboid
	{
		int result = a*b*c;
		System.out.println("Volume is cuboid is: " + Integer.toString(result));
	}

	public Volume(int r, int h) // Cylinder 
	{
		float result = (float)3.16*((float)r)*((float)r)*((float)h);
		System.out.println("Volume is cylinder is: " + Float.toString(result));
	}

	public Volume(int r) // Sphere 
	{
		float result = (float)3.16*((float)r)*((float)r)*((float)r);
		System.out.println("Volume is sphere is: " + Float.toString(result));
	}
}

public class Assignment_6_3_1601cs41
{
	public static void main(String[] args) 
	{
		Volume cuboid = new Volume(3,3,4);	
		Volume cylinder= new Volume(2,4);	
		Volume sphere = new Volume(5);	
	}
	
}
