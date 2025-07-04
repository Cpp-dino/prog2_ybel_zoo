package zoo.mammals.primates;

/** Describes the shared features of the gorilla. */
public class Gorilla implements Primate {
    /**
     * Every creature has a name ("gorilla").
     *
     * @return the name of the animal ("gorilla")
     */
    public String getName() {
        return "gorilla";
    }

    /** gorillas can move around. */
    public void move() {
        System.out.println("Gorilla moves climbing trees.");
    }
}
