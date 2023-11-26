package account;

public class TestAccount {
  public static void main(String[] args) {
    Account account1 = new Account();
    account1.setNumber("123");
    account1.setHolder("Dilan Lopez");
    account1.setAmount(1200);


    account1.deposit(1200);

  }
}
