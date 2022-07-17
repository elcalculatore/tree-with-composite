import java.util.ArrayList;

public class Dossier extends Composant {

    ArrayList<Composant> composants = new ArrayList<Composant>();

    public Dossier(String name, int branche) {
        super(name, branche);
    }

    public void ajouter(Composant comp) {
        composants.add(comp);
    }

    public void afficher() {

        int branche = getBranche();
        for (int i = 0; i < branche; i++) {
            System.out.print("|\t");
        }
        System.out.println("|--" + getName());
        for (Composant comp : composants) {
            comp.afficher();
        }
    }
}
