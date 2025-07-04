package zoo;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * zoo for habitats of various types.
 *
 * @param <T> kind of contained habitats
 */
public class Zoo<T extends Habitat<?>> {
    // habitats of various animal types in the zoo,
    // every habitat can only be contained once
    private Set<T> habitats = new LinkedHashSet<>();

    /**
     * add new habitat to this zoo.
     *
     * <p>the newly added habitat must not be contained in this zoo already
     *
     * @param habitat the new habitat to be added
     */
    public void build(T habitat) {
        habitats.add(habitat);
    }

    /**
     * remove the habitat contained in this zoo.
     *
     * @param habitat the habitat to be removed
     */
    public void abandon(T habitat) {
        habitats.remove(habitat);
    }

    /**
     * visits all habitats contained in this zoo in order of their creation.
     *
     * <p>this means to print the habitats names
     */
    public void visitAllHabitats() {
        for (T habitat : habitats) {
            System.out.println("Habitat '" + habitat.getName() + "' ist Teil dieses Zoos.");
        }
    }
}
