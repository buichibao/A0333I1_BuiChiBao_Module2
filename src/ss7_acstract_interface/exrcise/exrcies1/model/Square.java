package ss7_acstract_interface.exrcise.exrcies1.model;

public class Square extends Rectangle{
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
    public void resize(double percent) {
        System.out.println("Diện tích của hình vuông sau khi thay đổi kích thước là "+(getArea()+(getArea()*percent)));
    }
}
