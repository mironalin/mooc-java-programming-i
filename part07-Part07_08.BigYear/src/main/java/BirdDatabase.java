import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public boolean addObservation(String name) {
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(name)) {
                birds.get(i).addObservation();
                return true;
            }
        }
        return false;
    }

    public String getAll() {
        String allBirds = "";
        for (int i = 0; i < birds.size(); i++) {
            if (i == birds.size() - 1) {
                allBirds = allBirds + birds.get(i);
            } else {
                allBirds = allBirds + birds.get(i) + "\n";
            }
        }
        return allBirds;
    }

    public String getOne(String name) {
        String oneBird = "";
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(name)) {
                return birds.get(i).toString();
            }
        }
        return null;
    }
}
