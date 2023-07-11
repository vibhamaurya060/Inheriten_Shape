package Package2;
import java.util.*;

abstract class Shape
{
    float area;

    abstract public void input();
    abstract public void compute();
    public void disp()
    {
        System.out.println("The area is : " + area);
    }
}

class Rectangle extends Shape
{
    float length;
    float breadth;

    public void input()
    {
        System.out.println("Calculation of Rectangle App");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        length=sc.nextFloat();
        System.out.println("Enter the breadth of Rectangle");
        breadth=sc.nextFloat();
    }
    public void compute()
    {
        area = length*breadth;
    }
}

class Square extends Shape
{
    float length;

    public void input()
    {
        System.out.println("Calculation of Square App");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Square");
        length=sc.nextFloat();
    }

    public void compute()
    {
        area=length*length;
    }
}
class Circle extends Shape
{
    float radius;

    public void input()
    {
        System.out.println("Calculation of Circle App");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        radius=sc.nextFloat();
    }

    public void compute()
    {
        area=3.14f*radius*radius;
    }
}

class Geometry
{
    public void ploy(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle re=new Rectangle();
        Square sq=new Square();
        Circle ci=new Circle();

        Geometry g=new Geometry();
        g.ploy(re);
        g.ploy(sq);
        g.ploy(ci);
       
    } 
}
