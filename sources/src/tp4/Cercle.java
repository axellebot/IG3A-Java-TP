package tp4;

public class Cercle extends FormeGeometrique {
    private double rayon;

    public Cercle(double epaisseur, double rayon) {
        super(epaisseur);
        this.rayon = rayon;
    }

    public Cercle(double rayon) {
        super(1);
        this.rayon = rayon;
    }

    @Override
    public double calculPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double calculSuperficie() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                ", epaisseur=" + epaisseur +
                '}';
    }
}
