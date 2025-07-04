package zoo.mammals.primates;

/** Describes the shared features of the human. */
public class Human implements Primate {
    /**
     * Every creature has a name ("human").
     *
     * @return the name of the animal ("human")
     */
    public String getName() {
        return "human";
    }

    /** humans can move around. */
    public void move() {
        System.out.println("Human moves forward by car.");
    }
}
