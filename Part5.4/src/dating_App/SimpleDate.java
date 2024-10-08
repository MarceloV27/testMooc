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

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }

    public void advance() {

        if (this.day >= 30) {
            this.day = 1;

            if (this.month == 12) {
                this.month = 0;
                this.month++;
                this.year++;
            } else {
                this.month++;
            }

        } else {
            this.day++;
        }

    }

    public void advance(int howManyDay) {

        if (this.day >= 30) {
            this.day = 0;
            this.day += howManyDay;
            if (this.month == 12) {
                this.month = 1;
                this.year++;

            }
        } else {
            this.day++;
        }

    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);


        if(newDate.day >= 30){
            newDate.day = 0;
            newDate.day += days ;
            if(newDate.month == 12 ){
                newDate.month = 1;
                newDate.year++;
            }else{
                newDate.month++;
            }

        }
        return newDate;

    }

}
