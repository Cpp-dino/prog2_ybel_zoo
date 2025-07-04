import zoo.Habitat;
import zoo.mammals.cats.*;
import zoo.mammals.primates.*;

/** main class for this application. */
public class Main {
    /**
     * main method for this application.
     *
     * @param args ignored in this case
     */
    public static void main(String[] args) {
        // create new habitat for cats,
        // add tiger and british shorthair cat
        Habitat<Cat> catHab = new Habitat<>("cat cosmos");

        Cat bsCat = new BritishShorthair();
        catHab.add(bsCat);

        Cat tigerCat = new Tiger();
        catHab.add(tigerCat);

        // create new habitat for primates,
        // add human and gorilla primate
        Habitat<Primate> primateHab = new Habitat<>("primate prison");

        Primate humanPrimate = new Human();
        primateHab.add(humanPrimate);
        
        Primate gorillaPrimate = new Gorilla();
        primateHab.add(gorillaPrimate);
    }
}
