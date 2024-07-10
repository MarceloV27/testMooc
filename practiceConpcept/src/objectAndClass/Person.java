package objectAndClass;

public class Person {
    private String name;
    private int age;
    private int birthYear;
    private int restulage;
    private int restulAge;

    public Person(String name, int age, int birthYear){
        this.name = name;
        this.age = age;
        this.restulAge = restulAge;
        this.birthYear = birthYear;
    }

    public Person(int age, int birthYear, String name){
        this.name = name;
        this.age = age;
        this.restulAge = restulAge;
        this.birthYear = birthYear;
    }


    public void CalculateYourAge(){
         this.restulAge = -(this.birthYear - 2024);
        System.out.println(restulAge);
    }

  public void checkAge(){
      if (this.age >= this.restulAge  ) {
          System.out.println("You can drive!");
      }else{
          System.out.println("You can not drive! ");
      }
  }

  public String getName(){
      return this.name;
  }

  public String toString(){
        return "Name" + this.name + ", " + " Year Old: "+this.age+ "," + " Birth Year " + this.birthYear;
  }

}
