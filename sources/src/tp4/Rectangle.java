package tp4;

public class Rectangle extends FormeGeometrique {

    private double largeur;
    private double hauteur;

    public Rectangle(double epaisseur, double largeur, double hauteur) {
        super(epaisseur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(double largeur, double hauteur) {
        super(1);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double calculPerimetre() {
        return 2 * largeur + 2 * hauteur;
    }

    @Override
    public double calculSuperficie() {
        return largeur * hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "largeur=" + largeur +
                ", hauteur=" + hauteur +
                ", epaisseur=" + epaisseur +
                '}';
    }
}
