package Polymorphism;


class Circle extends Base_shape {
    // int r=6;
    // int result;

    @Override
    public void calculatearea() {
        int radius = 2;
        double area = Math.PI * radius * radius;
        System.out.println("area of circle:" + area);

    }
}
