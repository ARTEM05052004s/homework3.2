public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println("Текущая сумма: " + bankAccount.deposit(20000.0));
        bankAccount.withDraw(6000);
    }
}






























/* BankAccount bankAccount = new BankAccount();
        System.out.println("Текущая сумма: " + bankAccount.deposit(20000.0));
        bankAccount.withDraw(6000);
   */

