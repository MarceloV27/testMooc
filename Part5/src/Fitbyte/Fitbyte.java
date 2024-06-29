package Fitbyte;

public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){

        double resultMax = 200 - (percentageOfMaximum * age);
        return (resultMax - restingHeartRate)*(percentageOfMaximum)+ restingHeartRate;
    }


}
