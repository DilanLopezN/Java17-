 package account;

public class Account {
 private String number;
 private String holder;
 private double amount;


 public Account() {
    amount = 0.0;
 }

 public void setNumber(String number) {
   this.number = number;
 }

 public String getNumber() {
   return number;
 }
 
 public void setHolder(String holder) {
   this.holder = holder;
 }

 public String getHolder() {
   return holder;
 }

 public void setAmount(double amount) {
   this.amount = amount;
 }

 public double getAmount() {
   return amount;
 }
 

void deposit (double value) {
  if(value > 0) {
    amount = amount + value;
    System.out.println("Deposited value R$ " + value + "  " + "Total amount R$" + amount);
  } else {
    System.out.println("Invalid deposited value");
  }
}

void withdraw (double value) {
  if(value > amount && value <= 0 ) {
    System.out.println("Value exceeds amount");
  } else {
    amount =  amount - value;
    System.out.println("Withdraw R$" + value );
  }

}

  
} 