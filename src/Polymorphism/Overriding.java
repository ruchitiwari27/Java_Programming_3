package Polymorphism;


public class Overriding extends Person{
    public  int add(int a, int b) {
        return a + b;
    }
    public void behaviour(){
        System.out.println("overriding:");
    }

    public static void main(String[] args) {
//        Overriding  c = new Overriding();
//        System.out.println(c.add(2, 3));//
//        c.nature();
//       c.behaviour();
//        Person p=new Person();//method is called according to Object(class)
//        p.nature();
//        p.behaviour();
        Person p1=new Overriding();
        p1.behaviour();
        p1.nature();

    }
}