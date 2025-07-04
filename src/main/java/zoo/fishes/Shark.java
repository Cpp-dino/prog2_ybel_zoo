package zoo.fishes;

/** Describes the shared features of the shark. */
public class Shark implements Fish {
    /**
     * Every creature has a name ("shark").
     *
     * @return the name of the animal ("shark")
     */
    public String getName() {
        return "shark";
    }

    /** sharks can move around. */
    public void move() {
        System.out.println("Shark moves forward by swinging its fin.");
    }
}
