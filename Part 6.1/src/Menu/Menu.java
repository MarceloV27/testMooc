package Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<>();

    }

    public void addMeal(String meal){

        if(this.meals.contains(meal)){
            return;
        }else{
            this.meals.add(meal);
        }

    }

    public void clearMenu(){
        this.meals.clear();
    }

    public void printMeals(){

        for(String meals: meals){
            System.out.println(meals);
        }

    }




    }