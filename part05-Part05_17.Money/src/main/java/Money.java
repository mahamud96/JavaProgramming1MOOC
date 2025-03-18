
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        return new Money(addition.euros + this.euros, addition.cents + this.cents);
    }
    
    public boolean lessThan(Money compared){
        
        if(this.euros < compared.euros){
            return true;
        }
        
        if(this.euros == compared.euros){
            return this.cents < compared.cents;
        }
        
        return false;
        
    }
    
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser) == true){
            return new Money(0, 0);
        }
        
        int euro = this.euros - decreaser.euros;
        int cent = this.cents - decreaser.cents;
        
        if (cent < 0) {
            cent = 100 - decreaser.cents;
            euro--;
        }
        
        return new Money(euro, cent);
    }

    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
