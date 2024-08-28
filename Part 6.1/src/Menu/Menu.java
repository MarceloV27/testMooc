package Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        // The first thing to do add
        meals.add(meal);
    }

    public void clearMenu(){
        this.meals.clear();
    }

    public void printMeals(){
        for(String meal : meals){
            if(meal.equals(meal)){
                System.out.println(meal);
            }
        }

    }




}
