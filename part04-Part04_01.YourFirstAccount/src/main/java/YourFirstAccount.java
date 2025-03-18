
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account moe = new Account("Moe",100);
        
        moe.deposit(20.0);
        
        System.out.println(moe.toString());
    }
}
