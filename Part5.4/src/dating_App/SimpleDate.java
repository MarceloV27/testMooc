package dating_App;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }




    public void advance(int date){
     /*   Check that calling the advance method advances the date by one. When you create an object
        SimpleDate date = new SimpleDate(26, 12, 2011); and call the method date.advance() once,
            the date should be 27.12.2011. expected:<27.1[2].2011> but was:<27.1[3].2011>*/



    if(this.day >= 30){
        this.day = 1;

        if (this.month == 12) {
            this.month = 0;
            this.month++;
            this.year++;
        }else{
            this.month++;
        }

    }if(date >= 1 ){
            this.day += date;
        } else{
            this.day++;
        }
    }


}