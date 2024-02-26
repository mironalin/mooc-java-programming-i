
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int priceDiff = (squares * princePerSquare) - (compared.squares * compared.princePerSquare);

        if (priceDiff >= 0) {
            return priceDiff;
        } else {
            return -1 * priceDiff;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (squares * princePerSquare > compared.squares * compared.princePerSquare) {
            return true;
        } else {
            return false;
        }
    }

}
