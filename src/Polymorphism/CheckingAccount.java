package Polymorphism;

 class CheckingAccount extends BankAccount{
     public int withdraw(int s)//int overriding it doesn't matters
 {
     int limit2=s;
    System.out.println("this is again overriding this method"+limit2);
    return limit2;
}
 }
