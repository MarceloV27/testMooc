package printingACollection;

import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;

    }

    public String toString(){


        int count = 0;
        if(this.elements.size() > 0){
            count++;
        }



        String print = "";

         for(String printElement : this.elements) {
             String print = "The collection " + this.name + " is empty. \n"
                     + "The collection " + printElement + " has " + count + " element";
         }

        if (this.elements.isEmpty()) {
            return " ";
        }

           return print;


    }





}
