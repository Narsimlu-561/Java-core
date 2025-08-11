package HYRTutorials;
abstract class Shape
{
abstract public void numberOfSides();
}
class Trapezoid extends Shape
{
public void numberOfSides()
{
    System.out.println("Trapezoid: "+4);
}
}
class Triangle extends Shape
{
public void numberOfSides()
{
    System.out.println("Triangle: "+3);
}
}
class Hexagon extends Shape
{
public void numberOfSides()
{
    System.out.println("Hexagon: "+6);
}
}
class Demo
{
public static void main(String args[])
{
Trapezoid t=new Trapezoid();
t.numberOfSides();
Triangle tr=new Triangle();
tr.numberOfSides();
Hexagon h=new Hexagon();
h.numberOfSides();
}
}

