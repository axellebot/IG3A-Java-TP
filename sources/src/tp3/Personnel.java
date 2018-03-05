package tp3;

class Personnel extends Personne {
    private String service;

    Personnel(String nom, String prenom, int age, String service) {
        super(nom, prenom, age);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return super.toString() + ", je travail au service " + service;
    }
}
