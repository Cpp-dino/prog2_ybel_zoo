package zoo.reptiles;

/** Describes the shared features of the crocodile. */
public class Crocodile implements Reptile {
    /**
     * Every creature has a name ("crocodile").
     *
     * @return the name of the animal ("crocodile")
     */
    public String getName() {
        return "crocodile";
    }

    /** crocodiles can move around. */
    public void move() {
        System.out.println(
                "Crocodile moves forward by either swinging through the water or running on land.");
    }
}
