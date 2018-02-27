import java.util.Scanner;

public class Lab1
{ 
	public static void main(String[] args)
	 {
	 	//List<Point3d> our_points = new ArrayList<Point3d>();
	 	Point3d[] our_points = new Point3d[3];
	 	for (int i=0; i<3; i++)
	 	{
	 		Scanner inp = new Scanner(System.in);
	        System.out.print("Введите x: ");
	        double a = inp.nextDouble();
	        System.out.print("Введите y: ");
	        double b = inp.nextDouble();
	        System.out.print("Введите z: ");
	        double c = inp.nextDouble();
	        //points.add(new Point3d(a,b,c));
	        our_points[i]=new Point3d(a,b,c);
	 	}
	 	System.out.println(computeArea(our_points[0], our_points[1], our_points[2]));

	 }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3)
	 	{
	 	  if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) 
	 	  System.out.print("Error");

	 	  double a = p1.distanceTo(p2);
	 	  double b = p2.distanceTo(p3);
          double c = p3.distanceTo(p1);
          double p = (a + b + c)/2;
          return (Math.sqrt(p * (p-a) * (p-b) * (p-c)));
        }


}