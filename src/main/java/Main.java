public class Main {
    public static void main(String[] args) {
        //Rectangle
        RectangleClass rectangle = new RectangleClass(20, 17);
        System.out.println(rectangle.getDiagonal());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        //Circle
        Circle circle = new Circle(1);
        System.out.println(circle.getCircumference());
        System.out.println(circle.toString());

    }


}
