package trianglin;

public class Triangle extends GeometricObject{
	
	double side1 = 1;
	double side2 = 2;
	double side3 = 3;
	
	public Triangle (){
		
	}
	
	public Triangle (int side1, int side2, int side3){
		
	}
	
	public double Getside1 (){
		return this.side1;
	}
	public double Getside2 (){
		return this.side2;
	}
	public double Getside3 (){
		return this.side3;
	}
	
	
	public double GetPer (){
		double Per;
		Per = this.side1 + this.side2 + this.side3;
		return Per;
	}
	
	public double GetArea (){
		double halfp;
		double area1;
		double areaf;
		halfp = (this.side1 + this.side2 + this.side3) / 2;
		area1 = halfp * (halfp - this.side1) * (halfp - this.side2)* (halfp - this.side3);
		areaf = Math.sqrt(area1);
		return areaf;
	}
	
	public String toString (){
		return ("The area of the triangle is" + GetArea() + " and the perimeter is " + GetPer ());
	}
	
	
	
	
	
	
}
