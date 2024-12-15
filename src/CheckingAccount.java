public class CheckingAccount extends BankAccount {
private static double FEE = 0.15;
public CheckingAccount(String name, double amount) {
super(name, amount);
String accNum = super.getAccountNumber() + "-10";
super.setAccountNumber(accNum);
}
/**
*
*/
public boolean withdraw(double amount) {
return super.withdraw(amount + FEE);
}
}