package zoo.mammals;

/** Describes the shared features of the bat. */
public class Bat implements Mammal {
    /**
     * Every creature has a name ("bat").
     *
     * @return the name of the animal ("bat")
     */
    public String getName() {
        return "bat";
    }

    /** bats can move around. */
    public void move() {
        System.out.println("Bat moves forward by flying.");
    }
}
