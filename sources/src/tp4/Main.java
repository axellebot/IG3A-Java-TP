package tp4;

class Main {
    private static final String SEPARATOR = "------------------------------";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercice 1
        FormeGeometrique forme1, forme2;
        forme1 = new FormeGeometrique(1.0) {
            @Override
            public double calculPerimetre() {
                return 0;
            }

            @Override
            public double calculSuperficie() {
                return 0;
            }

            @Override
            public String toString() {
                return "$classAnonymous{" +
                        "epaisseur=" + epaisseur +
                        '}';
            }
        };

        forme1 = new Cercle(1, 3);
        forme2 = new Rectangle(1, 2, 4);
        System.out.println(SEPARATOR);
        System.out.println(forme1);
        System.out.println(forme1.calculPerimetre());
        System.out.println(forme1.calculSuperficie());
        System.out.println(SEPARATOR);
        System.out.println(forme2);
        System.out.println(forme2.calculPerimetre());
        System.out.println(forme2.calculSuperficie());

        System.out.println(SEPARATOR);
        TableauFormeGeometrique tab = new TableauFormeGeometrique(2);
        try {
            tab.addElement(forme1);
            tab.addElement(forme2);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(tab);
            tab.trier();
            System.out.println(tab);
        }
    }
}
