package PaymentCard;

public class Main {


    public static void main(String[] args) {

       /*   Part 1:
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);*/

    /*
      Part 2:
     PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
*/

      /*  Part 3:
     PaymentCard card = new PaymentCard(6);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);*/



        PaymentCard card = new PaymentCard(-1);
        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(200);
        System.out.println(card);



       /* PaymentCard card = new PaymentCard(100);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);

*/




    }
}
