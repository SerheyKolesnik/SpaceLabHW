package SpaseLab.HW3_Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private List<Graphic> mChikdGraphics = new ArrayList<Graphic>();

    @Override
    public void print() {
        for (Graphic graphic : mChikdGraphics) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        mChikdGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        mChikdGraphics.remove(graphic);
    }
}
