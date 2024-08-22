package Money;

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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){

        int totalCents = this.cents + addition.cents;
        int totalEuros = this.euros + addition.euros;
        Money newMoney = new Money(this.euros, this.cents);
        return newMoney;
    }


    public boolean lessThan(Money compared){

        Money newMoney = new Money(this.euros, this.cents);
        if(newMoney.euros + newMoney.cents < compared.euros + compared.cents ){
            return true;
        }else{
            return false;
        }

    }

    public Money minus(Money decreaser){
        int totalEuros = this.euros - decreaser.euros;
        int totalCents = this.cents - decreaser.cents;
        System.out.println(totalEuros);

        if(totalCents >= 0){
            if(totalCents < 0){
                totalEuros = totalEuros -1;
                totalEuros = totalCents + 100;
            }
        }else{
            totalEuros = 0;
            totalCents =0;
        }

        Money newMoney = new Money(this.euros, this.cents);
        return newMoney;
    }

}
