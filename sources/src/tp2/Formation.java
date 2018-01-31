package tp2;

import java.util.ArrayList;

class Formation {
    private String nom;
    private String code;
    private ArrayList<Cours> listCours;

    /**
     * Constructor
     *
     * @param nom
     * @param code
     */
    public Formation(String nom, String code) {
        code = verifyCode(code);
        this.nom = nom;
        this.code = code;
        this.listCours = new ArrayList<Cours>();
    }

    public void addCours(Cours cours) {
        this.listCours.add(cours);
    }

    /**
     * Remove Cours
     *
     * @param index index of the cours
     * @return Cours the removed cours
     */
    public Object removeCours(int index) {
        return this.listCours.remove(index);
    }

    public Object getCours(int number) {
        return listCours.get(number);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        code = verifyCode(code);
        this.code = code;
    }

    public ArrayList<Cours> getListCours() {
        return listCours;
    }

    public void setListCours(ArrayList<Cours> listCours) {
        this.listCours = listCours;
    }

    @Override
    public String toString() {
        String txt = "La formation " + nom + " (" + code + ") : \n";
        for (Object cours : listCours) {
            txt += cours.toString() + '\n';
        }
        return txt;
    }

    static String verifyCode(String code) {
        return code.replaceAll("[^A-Za-z0-9]", "");
    }
}
