package tp3;

class Administratif extends Personnel {
    private String fonction;

    Administratif(String nom, String prenom, int age, String fonction) {
        super(nom, prenom, age, "Administratif");
        this.fonction = fonction;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    @Override
    public String toString() {
        return super.toString() + " je suis " + fonction;
    }

    @Override
    public void ouMeTrouve() {
        System.out.println("Le plus facile c'est de passer dans mon bureau.\n");
    }
}
