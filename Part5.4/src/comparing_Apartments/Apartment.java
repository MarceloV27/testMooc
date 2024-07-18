package comparing_Apartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    // Part 1
    public boolean largerThan(Apartment compared){

        if(this.squares > compared.squares){
            return true;
        }else{
            return false;
        }
    }

    // Part 2
    public int priceDifference(Apartment compared){
        int squarePriceFirst = this.pricePerSquare * squares;
        int squarePriceSecond = compared.pricePerSquare * compared.squares;

        if(squarePriceFirst < squarePriceSecond){
            return  squarePriceSecond - squarePriceFirst ;
        } else if(squarePriceFirst > squarePriceSecond){
            return squarePriceFirst - squarePriceSecond;
        }else{
            return 0;
        }
    }

    // Part 3
    public boolean moreExpensiveThan(Apartment compared){
        int squarePriceFirst = this.pricePerSquare * squares;
        int squarePriceSecond = compared.pricePerSquare * compared.squares;

        if(squarePriceFirst > squarePriceSecond){
            return true;
        }else if(squarePriceFirst < squarePriceSecond){
            return false;
        }else{
            return false;
        }

    }





}