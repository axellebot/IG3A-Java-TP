package tp4;

import java.util.ArrayList;
import java.util.List;

public class TableauFormeGeometrique {
    private int nbFormeGeometrique;
    private List<FormeGeometrique> formeGeometriques;

    public TableauFormeGeometrique(int nbFormeGeometrique) {
        this.nbFormeGeometrique = nbFormeGeometrique;
        this.formeGeometriques = new ArrayList<>(nbFormeGeometrique);
    }

    public void addElement(FormeGeometrique e) throws Exception {
        if (formeGeometriques.size() + 1 > nbFormeGeometrique) throw new Exception("Out of bounds");
        formeGeometriques.add(e);
    }

    public void trier() {
        formeGeometriques.sort(null);
    }

    @Override
    public String toString() {
        String tmp = "TableauFormeGeometrique{" +
                "nbFormeGeometrique=" + nbFormeGeometrique +
                ", formeGeometriques=" + formeGeometriques +
                ", [";
        for (FormeGeometrique fg : formeGeometriques) {
            tmp += fg.toString() + ", ";
        }
        tmp += "]}";
        return tmp;
    }
}
