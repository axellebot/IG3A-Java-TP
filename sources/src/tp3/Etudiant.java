package tp3;

class Etudiant extends Personne {
    private String promotion;
    private int nbAbsence;

    public Etudiant() {
        promotion = "Anonyme";
        nbAbsence = -1;
    }

    public Etudiant(String nom, String prenom, int age, String promotion, int nbAbsence) {
        super(nom, prenom, age);
        this.promotion = promotion;
        this.nbAbsence = nbAbsence;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public int getNbAbsence() {
        return nbAbsence;
    }

    public void setNbAbsence(int nbAbsence) {
        this.nbAbsence = nbAbsence;
    }

    @Override
    public String toString() {
        return super.toString() + ", je suis dans la promotion " + promotion + ", j'ai été absent(e) " + nbAbsence + " fois.";
    }

    @Override
    public void ouMeTrouve() {
        System.out.println("Je suis en cours tous les jours, sauf les jeudis après-midi (je fais du sport, mais c'est comme un cours car j'aime le sport).\n");
    }
}
