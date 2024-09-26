package cargoHold;

import java.util.ArrayList;

public class Suitcase {

    ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
        item.getWeight();


       if(totalItemsWeight < this.maximumWeight ){
           items.add(item);
       }
    }

    public String toString(){
        return items.toString();
    }

}
