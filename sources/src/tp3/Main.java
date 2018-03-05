package tp3;

class Main {
    private static final String SEPARATOR = "------------------------------------------------------------";

    private static void affichePersonnes(Personne[] personnes) {
        for (Personne p :
                personnes) {
            System.out.println(p.toString() + '\n');
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Etudiant
                e1 = new Etudiant("Dupont", "Alice", 21, "", 3),
                e2 = new Etudiant("Dujardin", "Benjamin", 22, "", 1),
                a1 = new Etudiant(),
                a2 = new Etudiant();

        Administratif admin = new Administratif("Dupont", "Béatrice", 19, "secrétaire");
        Enseignant enseignant = new Enseignant("Machin", "Boris", 36, "informatique", "électronique");

        Personne personnes[] = {e1, e2, a1, a2, admin, enseignant};

        for (Personne p : personnes) {
            p.ouMeTrouve();
        }

        System.out.println(SEPARATOR);
        affichePersonnes(personnes);

        a1.prenom = "Axel";
        a1.setNom("Le Bot");
        a1.setAge(21);
        a1.setNbAbsence(0);
        a2.prenom = "Camille";
        a2.setNom("Dardoize");
        a2.setAge(21);
        a2.setNbAbsence(0);

        System.out.println(SEPARATOR);
        affichePersonnes(personnes);
    }
}
