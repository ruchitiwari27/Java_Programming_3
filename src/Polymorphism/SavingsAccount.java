package Polymorphism;

 class SavingsAccount extends BankAccount {
    @Override
    public int withdraw(int l){
        int limit1=l;
        System.out.println("this overrides this method"+limit1);
    return limit1;
    }
}
