public class Fichier extends Composant {

    public Fichier(String name, int branche) {
        super(name, branche);
    }

    public void afficher() {
        int branche = getBranche();
        for (int i = 0; i < branche; i++) {
            System.out.print("|\t");
        }
        System.out.println(getName());
    }
}
