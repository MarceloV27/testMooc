package HealthStation;

public class HealthStation {

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }


    public void feed(Person person){
        int personFeed = person.getWeight();

        personFeed ++;

        System.out.println(personFeed);
    }

    public int weighings(){
        int counterWeighings = 0;


         return counterWeighings++;

    }

}
