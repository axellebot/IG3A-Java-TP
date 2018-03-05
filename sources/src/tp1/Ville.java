package tp1;

import java.util.Objects;

class Ville {
    private String nom;
    private double superficie;
    private int population;

    /**
     * Constructor
     *
     * @param nom
     * @param superficie
     * @param population
     */
    Ville(String nom, double superficie, int population) {
        this.nom = nom;
        this.population = population;
        this.superficie = superficie;
    }

    Ville() {
        this.nom = "inconnu";
        this.population = 0;
        this.superficie = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return nom + ", " + superficie + "kilomètres carrés, pour  " + population + " habitant";
    }

    public boolean estIdentique(Ville v) {
        //return this.equals(v);
        return (this.getNom() == v.getNom() &&
                this.getSuperficie() == v.getSuperficie() &&
                this.getPopulation() == v.getPopulation());
    }

    static boolean sontIdentiques(Ville v1, Ville v2) {
        return (v1.getNom() == v2.getNom() &&
                v1.getSuperficie() == v2.getSuperficie() &&
                v1.getPopulation() == v2.getPopulation());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Ville)) {
            return false;
        }

        Ville v = (Ville) obj;

        return (Objects.equals(nom, v.getNom()) &&
                superficie == v.getSuperficie() &&
                population == v.getPopulation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, superficie, population);
    }
}
