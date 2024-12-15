public class SavingsAccount extends BankAccount {
private double rate = .025;
private int savingsNumber = 0;
private String accountNumber;
public SavingsAccount(String name, double amount) {
super (name, amount);
String accNum = super.getAccountNumber() + "-" + savingsNumber;
accountNumber = accNum;
}
public SavingsAccount(SavingsAccount oldAccount, double amount) {
super(oldAccount, amount);
savingsNumber += 1;
}
public void postInterest() {
rate = (rate / 100) / 12;
setBalance((getBalance() * rate) + getBalance());
}
public String getAccountNumber() {
savingsNumber += 1;
accountNumber = super.getAccountNumber() + "-" + savingsNumber;
return accountNumber;
}
}
