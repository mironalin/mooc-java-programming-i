import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + " (" + items.get(i).getWeight() + " kg)");
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heavy = items.get(0);

        for (int i = 1; i < items.size(); i++) {
            if (heavy.getWeight() < items.get(i).getWeight()) {
                heavy = items.get(i);
            }
        }

        return heavy;
    }
    

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return "1 item " + "(" + totalWeight() +" kg)";
        }

        return items.size() + " items " + "(" + totalWeight() + " kg)";
    }
}
