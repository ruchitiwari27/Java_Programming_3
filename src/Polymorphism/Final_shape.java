package Polymorphism;


public class Final_shape {
    public static void main(String[] args) {
        String[] st = {"circle", "rectangle", "triangle"};
        for (int i = 0; i < 3; i++) {
            System.out.println("Shapes:" + st[i]);
        }
        Base_shape c = new Circle();
        c.calculatearea();
        Base_shape r = new Rectangle();
        r.calculatearea();
        Base_shape t = new Triangle();
        t.calculatearea();

    }
}
