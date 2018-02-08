package tp2;

class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cours
                cpp = new Cours("ITC313_Prog_Sys", "Programmation Système", 20),
                java = new Cours("ITC315_JAVA", "Java", 20),
                bd = new Cours("IT315_BD", "Base de Données", 20),
                web = new Cours("ITC315_DevWeb", "Développement Web", 20),
                reseau = new Cours("ITC312_Reseau", "Réseau", 20),
                elecAna = new Cours("ITC314_Elec_Anal", "Electronique Analogique", 20),
                elecNum = new Cours("ITC316_Elec_Num", "Electronique Numérique", 20);

        Formation infoTro = new Formation("InfoTro", "IT");

        infoTro.addCours(cpp);
        infoTro.addCours(java);
        infoTro.addCours(bd);
        infoTro.addCours(web);
        infoTro.addCours(reseau);
        infoTro.addCours(elecAna);
        infoTro.addCours(elecNum);

        System.out.println("\nPrinting formation ...");
        System.out.println(infoTro);

        System.out.println("Deleting second ...");
        infoTro.removeCours(1);

        System.out.println("Printing formation ...");
        System.out.println(infoTro);

        System.out.println("\nGet second ...");
        System.out.println(infoTro.getCours(1).toString());

        System.out.println("\nSorting datas ...");

        infoTro.getListCours().sort(null);

        System.out.println(infoTro);
    }
}