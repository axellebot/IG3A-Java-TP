package tp3;

class Enseignant extends Personnel {
    private String matierePrincipale;
    private String matiereSecondaire;

    public Enseignant(String nom, String prenom, int age, String matierePrincipale, String matiereSecondaire) {
        super(nom, prenom, age, "Enseignant");
        this.matierePrincipale = matierePrincipale;
        this.matiereSecondaire = matiereSecondaire;
    }

    public String getMatierePrincipale() {
        return matierePrincipale;
    }

    public void setMatierePrincipale(String matierePrincipale) {
        this.matierePrincipale = matierePrincipale;
    }

    public String getMatiereSecondaire() {
        return matiereSecondaire;
    }

    public void setMatiereSecondaire(String matiereSecondaire) {
        this.matiereSecondaire = matiereSecondaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", j'enseigne l'" + matierePrincipale + " et l'" + matiereSecondaire;
    }

    @Override
    public void ouMeTrouve() {
        System.out.println("Ce n'est pas la peine de me cherche, je saurai vous trouver !\n");
    }
}
