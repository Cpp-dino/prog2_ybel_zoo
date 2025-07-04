package zoo;

/** Describes the shared features of the corall. */
public class Corall implements Animal {
    /**
     * Every creature has a name ("corall").
     *
     * @return the name of the animal ("corall")
     */
    public String getName() {
        return "corall";
    }

    /** coralls can move around. */
    public void move() {
        System.out.println("Corall does not moves forward at all.");
    }
}
