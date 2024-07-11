package HealthStation;

public class HealthStation{

    private int weighings;

    HealthStation(){
        this.weighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
    }

    public void feed(Person person){
        int personFeed = person.getWeight();

        personFeed ++;

        System.out.println(personFeed);
    }


    public int weighings() {

        return weighings;
    }


}
