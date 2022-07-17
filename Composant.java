public abstract class Composant {

    private int branche;
    private String name;

    public Composant(String name, int branche) {
        this.name = name;
        this.branche = branche;
    }

    public abstract void afficher();

    public String getName() {
        return this.nom;
    }

    public int getbranche() {
        return this.branche;
    }
}
