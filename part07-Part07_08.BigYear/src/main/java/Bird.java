public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    // Other methods
    public void addObservation() {
        this.observations++;
    }

    // toString method
    public String toString() {
        return name + " (" + latinName +"): " + observations + " observations";
    }
}
