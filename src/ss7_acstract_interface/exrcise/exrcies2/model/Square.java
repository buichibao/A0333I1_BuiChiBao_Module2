package ss7_acstract_interface.exrcise.exrcies2.model;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double size) {
        super(size, size);

    }

    @Override
    public String toString() {
        return "Square{"
                +super.getWidth() +"}";
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
