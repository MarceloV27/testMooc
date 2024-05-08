package PaymentCard;

public class PaymentCard {

    private double balance;

    public PaymentCard( double balance){

        this.balance = balance;
    }

    public void eatAffordably(){
        // In side to this method you need to subtract $2.60 to your BALANCE

        if(balance > 2.6){
            balance = balance - 2.6;
        }else if(balance ==0){
            balance = 0;
        }else{
            balance *= 1;
        }
    }

    public void eatHeartily(){
        // In side to this method you need to subtract $4.60 to your BALANCE

        if(balance > 4.60){
            balance = balance - 4.60;
        }else if (balance == 0){
            balance = 0;
        }else{
            balance *= 1;
        }
    }

    public void addMoney(double deposit) {
        // In this method variable DEPOSIT increase until $150 and do not display negative.


       if (deposit < 0) {
            balance *= 1;
        } else if (deposit > 150) {
            balance = 150;
        } else if (balance <= 150) {
            balance += deposit;

        }

    }


    public String toString(){
        // NOT CHANGE IT BECAUSE IS A STRING!
        return "The card has a balance of " + balance +" euros";
    }


}
