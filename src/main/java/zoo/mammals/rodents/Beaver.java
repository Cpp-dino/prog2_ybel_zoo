package zoo.mammals.rodents;

/** Describes the shared features of the beaver. */
public class Beaver implements Rodent {
    /**
     * Every creature has a name ("beaver").
     *
     * @return the name of the animal ("beaver")
     */
    public String getName() {
        return "beaver";
    }

    /** mice can move around. */
    public void move() {
        System.out.println("Beaver moves forward by either swimming through the water or running on land.");
    }
}
