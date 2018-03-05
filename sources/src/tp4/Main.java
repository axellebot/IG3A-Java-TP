package tp4;

class Main {
    private static final String SEPARATOR = "------------------------------------------------------------";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormeGeometrique forme1, forme2;

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
            tab.addElement(forme2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println(tab);
            tab.trier();
            System.out.println(tab);
        }
    }
}
