public class Shape {

    private String color = "white";

    public Shape() {


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

/*
    }

    public void describe (int sideA , int sideB) {

        System.out.println("Side A is " + sideA +" sideB is " +sideB);
    }

    public  void descibe ( int sideA ) {
        System.out.println("Side A is " + sideA);

}
    public void describe (double sideA) {
            System.out.println("Side A is " +sideA
            );
        }
  */

    public void describe() {
        System.out.println("This is a shape and" +" its color is "+ this.color);
    }

}

