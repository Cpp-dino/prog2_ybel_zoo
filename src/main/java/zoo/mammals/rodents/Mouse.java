package zoo.mammals.rodents;

/** Describes the shared features of the mouse. */
public class Mouse implements Rodent {
    /**
     * Every creature has a name ("mouse").
     *
     * @return the name of the animal ("mouse")
     */
    public String getName() {
        return "mouse";
    }

    /** mice can move around. */
    public void move() {
        System.out.println("Mouse moves forward by digging tunnels.");
    }
}
