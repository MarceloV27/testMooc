package cardPayments;

public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {

        if(payment >= 2.5){
            this.affordableMeals++;
            money += 2.5;
            return payment - 2.5;
        }else{
            return payment;
        }
    }

    public double eatHeartily(double payment) {

        if(payment >= 4.3){
            this.heartyMeals++;
            money += 4.3;

            return payment - 4.3;
        }else{
            return payment;
        }
    }
        // Card payments don't increase the amount of chas in the register
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned



        if(card.takeMoney(2.5)){
            this.affordableMeals++;
            return true;
        }else{
            return false;
        }

    }

    // Card payments don't increase the amount of chas in the register
    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if(card.takeMoney(4.3)){
            this.heartyMeals++;
            return true;
        }else{
            return false;
        }

    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum < 0){
           card.balance();
        }else{
            card.addMoney(sum);
            money += sum;
        }

    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }


}