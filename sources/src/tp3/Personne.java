package tp3;

class Personne {
    private String nom;
    public String prenom;
    protected int age;

    Personne() {
        prenom = "Anonyme";
        nom = "Anonyme";
        age = -1;
    }

    Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Je suis " + nom.toUpperCase() + " " + prenom + " (" + age + " an(s))";
    }

    public void ouMeTrouve() {
        System.out.println("Je ne sais pas où je suis.\n");
    }
}
