package santa_s_Workshop;

public class Gift {
    private String name;
    private int weight;

    Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String toString(){
        String gift = this.name + "(" + this.weight + " kg"+")";

        return  gift;

    }


}
