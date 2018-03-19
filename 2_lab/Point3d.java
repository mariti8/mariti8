
//трехмерный класс точки.

public class Point3d
{
	double xCoord, yCoord, zCoord;

	// Конструктор, чтобы инициализировать точку к (x, y, z) значение.

	public Point3d(double x, double y, double z)
	{
		
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	//Конструктор без параметров: 
	//значения по умолчанию к точке в источнике.
	public Point3d()
	{
		double x= 0.0;
		double y= 0.0;
		double z= 0.0;
	}
	//Верните X координат точки.
	public double getX()
	{
		return xCoord;
	}
	//Верните Y координат точки.
	public double getY()
	{
		return yCoord;
	}
	//Верните Z координат точки.
	public double getZ()
	{
		return zCoord;
	}
	//Набор X координат точки
	public void setX(double val)
	{
		xCoord = val;
	}
	//Набор Y координат точки
	public void setY(double val)
	{
		yCoord = val;
	}
	//Набор Z координат точки
	public void setZ(double val)
	{
		zCoord = val;
	}
	public boolean Point3ds( Point3d a, Point3d b )
	{
		return a.equals(b);
	}
	public double distanceTo(Point3d c)
	{
		//вызов функции вычисляет двойную точность
		//приближения плавающий точкой расстояния по прямой между двумя
		//точками и возвращает это значение.
		return Math.sqrt( Math.pow(this.xCoord-c.getX(),2)+Math.pow(this.yCoord-c.getY(),2)+Math.pow(this.zCoord-c.getZ(),2));		
	}





}