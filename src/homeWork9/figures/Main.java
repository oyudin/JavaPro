package homeWork9.figures;

public class Main {
    public static void main(String[] args) {

        Squareable[] figures = new Squareable[]{new Circle(), new Triangle(), new Area()};
        calcSum(figures);
    }


    public static void calcSum(Squareable[] squareable) {
        double sum = 0;
        for (int i = 0; i < squareable.length; i++) {
            System.out.println("square: " + squareable[i].square());
            sum = sum + squareable[i].square();
        }
        System.out.println("Sum of all figures is: " + sum);
    }
}