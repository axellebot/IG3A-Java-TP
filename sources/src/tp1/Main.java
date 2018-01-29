package tp1;

public class Main {

    public static void main(String[] args) {

        Ville dijon, quetigny, beaune, macon, chalon;
        dijon = new Ville("Dijon", 40.41, 375831);
        quetigny = new Ville("Quetigny", 8.19, 9690);
        beaune = new Ville("Beaune", 31.3, 52741);
        macon = new Ville("Mâcon", 27.0, 100172);
        chalon = new Ville("Chalon-sur-Saône", 15.22, 133557);

        Departement coteDor, saoneEtLoire;
        coteDor = new Departement("Cote d'or", 21, 3);
        saoneEtLoire = new Departement("Saône-et-Loire", 71, 2);

        coteDor.ajouterVille(dijon);
        coteDor.ajouterVille(quetigny);
        coteDor.ajouterVille(beaune);
        saoneEtLoire.ajouterVille(macon);
        saoneEtLoire.ajouterVille(chalon);

        System.out.println(coteDor);
        System.out.println(saoneEtLoire);
    }
}
