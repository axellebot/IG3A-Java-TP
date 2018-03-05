package tp2;

class Cours implements Comparable {
    private String intitule;
    private String code;
    private int volumeHorraire;

    /**
     * Constructor
     *
     * @param code
     * @param intitule
     * @param volumeHorraire
     */
    Cours(String code, String intitule, int volumeHorraire) {
        code = verifyCode(code);
        this.code = code;
        this.intitule = intitule;
        this.volumeHorraire = volumeHorraire;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        code = verifyCode(code);
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getVolumeHorraire() {
        return volumeHorraire;
    }

    public void setVolumeHorraire(int volumeHorraire) {
        this.volumeHorraire = volumeHorraire;
    }

    @Override
    public String toString() {
        return "Le cours " + intitule + " (" + code + ")" + " -> " + volumeHorraire + "H.";
    }

    @Override
    public int compareTo(Object o) {
        Cours obj = (Cours) o;
        int diff;

        diff = this.code.compareTo(obj.getIntitule());
        if (diff == 0)
            diff = this.code.compareTo(obj.getCode());
        if (diff == 0)
            diff = this.volumeHorraire - obj.volumeHorraire;
        return diff;
    }

    static String verifyCode(String code) {
        return code.replaceAll("[^A-Za-z0-9]", "");
    }
}
