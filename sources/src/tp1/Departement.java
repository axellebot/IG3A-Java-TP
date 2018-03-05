package tp1;

class Departement {
    private Ville[] tabVilles;
    private int numero;
    private String nom;
    private int nbVillesSaisies;

    /**
     * Constructor
     *
     * @param nom
     * @param numero
     * @param nbVilles
     */
    Departement(String nom, int numero, int nbVilles) {
        this.nom = nom;
        this.numero = numero;
        this.nbVillesSaisies = 0;
        tabVilles = new Ville[nbVilles];
    }

    public void ajouterVille(Ville ville) {
        if (tabVilles.length > nbVillesSaisies) {
            tabVilles[nbVillesSaisies] = ville;
            nbVillesSaisies++;
        } else {
            System.out.println("Tableau plein");
        }
    }


    public Ville[] getTabVilles() {
        return tabVilles;
    }

    public void setTabVilles(Ville[] tabVilles) {
        this.tabVilles = tabVilles;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbVillesSaisies() {
        return nbVillesSaisies;
    }

    public void setNbVillesSaisies(int nbVillesSaisies) {
        this.nbVillesSaisies = nbVillesSaisies;
    }


    @Override
    public String toString() {
        String msg = "";

        Ville tmp = null;
        msg += "Ville du Departement " + this.nom + "(" + this.numero + "):\n";

        for (int i = 0; i < tabVilles.length; i++) {
            tmp = tabVilles[i];
            msg += i + 1 + ". " + tmp + '\n';
        }
        return msg;

    }
}
