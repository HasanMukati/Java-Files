
public class Can {

	double heightVal;
	double radiusVal;
	double PI=3.14;

	public Can(double h,double r)
{
	h=heightVal;
	r=radiusVal;

}

	public double getSurfaceAreaMethod(double heightVal,double radiusVal)
{

	double area;
	area=((2*PI*heightVal*radiusVal)+(2*PI*radiusVal*radiusVal));
	System.out.println("Can SurfaceArea: "+area);
	return area;
}

	public double getVolumeMethod(double heightVal,double radiusVal)
{
	double area;
	area=(PI*radiusVal*radiusVal*heightVal);
	System.out.println("Can Volume: "+area);
	return area;

	}

	}