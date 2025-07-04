package zoo.fishes;

/** Describes the shared features of the eel. */
public class Eel implements Fish {
    /**
     * Every creature has a name ("eel").
     *
     * @return the name of the animal ("eel")
     */
    public String getName() {
        return "eel";
    }

    /** eels can move around. */
    public void move() {
        System.out.println("Eel moves forward by swinging its entire body.");
    }
}
