package zoo.mammals;

/** Describes the shared features of the whale. */
public class Whale implements Mammal {
    /**
     * Every creature has a name ("whale").
     *
     * @return the name of the animal ("whale")
     */
    public String getName() {
        return "whale";
    }

    /** whales can move around. */
    public void move() {
        System.out.println("Whale moves forward by swinging its fin.");
    }
}
