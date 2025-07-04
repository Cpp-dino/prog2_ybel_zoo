package zoo.reptiles;

/** Describes the shared features of the snake. */
public class Snake implements Reptile {
    /**
     * Every creature has a name ("snake").
     *
     * @return the name of the animal ("snake")
     */
    public String getName() {
        return "snake";
    }

    /** snakes can move around. */
    public void move() {
        System.out.println("Snake moves forward by swinging its entire body.");
    }
}
