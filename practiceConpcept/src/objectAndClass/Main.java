package objectAndClass;

public class Main {
    public static void main(String[] args) {

        Person person0 = new Person("Marcelo",2,2000);

        Person person1 = new Person("Pepito", 1, 1999);

        Person person2 = new Person(2,1998,"Pablito");

        System.out.println(person0);
        person0.CalculateYourAge();
       person0.checkAge();




    }
}
