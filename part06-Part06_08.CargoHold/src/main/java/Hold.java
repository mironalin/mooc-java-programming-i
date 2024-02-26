import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;

    public Hold(int maximumWeight) {
        hold = new ArrayList<>();
        maxWeight = maximumWeight;
    }

    public int totalHoldWeight() {
        int total = 0;
        
        for (Suitcase suitcase : hold) {
            total += suitcase.totalWeight();
        }
        
        return total;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalHoldWeight() + suitcase.totalWeight() <= maxWeight) {
            hold.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return hold.size() + " suitcases (" + totalHoldWeight() + " kg)";
    }

}
