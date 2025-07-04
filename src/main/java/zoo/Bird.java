package zoo;

/** Describes the shared features of the bird. */
public class Bird implements Animal {
    /**
     * Every creature has a name ("bird").
     *
     * @return the name of the animal ("bird")
     */
    public String getName() {
        return "bird";
    }

    /** bats can move around. */
    public void move() {
        System.out.println("Bird moves forward by flying.");
    }
}
