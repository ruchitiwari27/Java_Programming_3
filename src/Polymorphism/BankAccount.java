package Polymorphism;

class BankAccount {
    public void deposit(){
        System.out.println("we deposit on banks:");
    }
    public int withdraw(int l){
        int limit=l ;
        System.out.println("we withdraw also  fron bank");
        return limit;
    }
    public static void main(String[]args){
        BankAccount s=new SavingsAccount();
        s.deposit();
        s.withdraw(300000);
        CheckingAccount c=new CheckingAccount();
       c.withdraw(400000);
    }
}
