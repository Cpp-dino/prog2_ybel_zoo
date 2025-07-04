package zoo.mammals.cats;

/** Describes the shared features of the british shorthair cat. */
public class BritishShorthair implements Cat {
    /**
     * Every creature has a name ("british shorthair cat").
     *
     * @return the name of the animal ("british shorthair cat")
     */
    public String getName() {
        return "british shorthair cat";
    }

    /** british shorthair cats can move around. */
    public void move() {
        System.out.println("British shorthair cat only moves when its time for feeding.");
    }
}
