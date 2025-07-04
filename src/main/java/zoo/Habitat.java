package zoo;

import java.util.HashSet;
import java.util.Set;

/**
 * habitat for animals of same species.
 *
 * @param <T> species of contained animals
 */
public class Habitat<T extends Animal> {
    // name for this habitat
    private String name;
    // animals of species 'T' in the habitat,
    // every animal can only be contained once.
    private Set<T> animals = new HashSet<>();

    /**
     * create new habitat for animals of species 'T'.
     *
     * @param name the name for the newly created habitat
     */
    public Habitat(String name) {
        this.name = name;
    }

    /**
     * add new animal to this zoo
     *
     * <p>the newly added animal must not be contained in this habitat already.
     *
     * @param animal the new animal to be added
     */
    public void add(T animal) {
        animals.add(animal);
    }

    /**
     * remove the animal contained in this zoo.
     *
     * @param animal the animal to be removed
     */
    public void remove(T animal) {
        animals.remove(animal);
    }

    /**
     * returns the name of this habitat.
     *
     * @return name the name of this habitat
     */
    public String getName() {
        return name;
    }
}
