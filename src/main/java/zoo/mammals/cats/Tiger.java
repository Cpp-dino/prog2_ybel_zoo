package zoo.mammals.cats;

/** Describes the shared features of the tiger. */
public class Tiger implements Cat {
    /**
     * Every creature has a name ("tiger").
     *
     * @return the name of the animal ("tiger")
     */
    public String getName() {
        return "tiger";
    }

    /** tigers can move around. */
    public void move() {
        System.out.println("Tiges moves forward by running.");
    }
}
