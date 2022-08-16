import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        //account
        Account account = new Account("1","B",3);
        System.out.println(account.getId());
        System.out.println(account.getName());
        System.out.println(account.getBalance());


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
        //setting a new r


        //Account Examople
//        Scanner scanner = new Scanner(System.in)
//
//                @



    }


}
