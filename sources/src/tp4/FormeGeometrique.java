package tp4;

public abstract class FormeGeometrique implements Comparable {
    protected double epaisseur;

    protected FormeGeometrique(double epaisseur) {
        this.epaisseur = epaisseur;
    }

    public abstract double calculPerimetre();

    public abstract double calculSuperficie();

    public abstract String toString();

    @Override
    public int compareTo(Object o) {
        FormeGeometrique obj = (FormeGeometrique) o;
        double result = Double.compare(this.calculPerimetre(), obj.calculPerimetre());
        if (result == 0) result = Double.compare(this.calculSuperficie(), obj.calculSuperficie());
        return (int) result;
    }
}
