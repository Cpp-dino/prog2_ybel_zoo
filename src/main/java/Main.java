import zoo.Aquarium;
import zoo.Habitat;
import zoo.fishes.*;

/** main class for this application. */
public class Main {
    /**
     * main method for this application.
     *
     * @param args ignored in this case
     */
    public static void main(String[] args) {
        // create new zoo with fish habitats
        Aquarium aquarium = new Aquarium();

        // create new habitat for eels
        Habitat<Eel> eelHab = new Habitat<>("eel lagoon");

        Eel eel1 = new Eel();
        eelHab.add(eel1);

        Eel eel2 = new Eel();
        eelHab.add(eel2);

        aquarium.build(eelHab);

        // create new habitat for sharks
        Habitat<Shark> sharkHab = new Habitat<>("shark tank");

        Shark shark1 = new Shark();
        sharkHab.add(shark1);

        Shark shark2 = new Shark();
        sharkHab.add(shark2);

        aquarium.build(sharkHab);
    }
}
