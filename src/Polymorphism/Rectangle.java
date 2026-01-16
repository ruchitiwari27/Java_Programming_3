package Polymorphism;


   class Rectangle extends Base_shape {
@Override
public  void calculatearea() {
        int length=8;
        int breadth=9;
        int area=length*breadth;
        System.out.println("area of Rectangle:"+area);

        }}