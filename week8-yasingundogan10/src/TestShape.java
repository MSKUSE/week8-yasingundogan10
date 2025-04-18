public class TestShape {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.describe();

        Rectangle rectangle = new Rectangle(3,4);
        rectangle.describe();


        Rectangle r1 = new Rectangle("white" , 3 ,4);
        Rectangle r2 = new Rectangle("blue" , 2 ,5);

        System.out.println(r2.equals(r1));

    }
}
