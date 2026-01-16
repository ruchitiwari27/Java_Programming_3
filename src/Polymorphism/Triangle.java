package Polymorphism;


class Triangle extends Base_shape{
    @Override
    public  void calculatearea() {

        int base = 4;
        int height = 6;
        int area = (base * height) / 2;

        System.out.println("area of triangle:"+area);


    }
}