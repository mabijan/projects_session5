package Tamrin_Manzel_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the user name:");
        String Name = scanner.next();

        System.out.print("Please enter the user password:");
        String Password = scanner.next();

        System.out.print("Please enter the user Email:");
        String Email = scanner.next();

        Student_Generic Test = new Student_Generic();

        Test.x = Name;
        Test.y = Password;
        Test.z = Email;

        Test.SHOW();

        System.out.println("===================================");

        Student_Generic Test2 = null;
        Student_Generic Test3= null;

        try {

            Test2 = (Student_Generic) Test.clone();
            Test3 = (Student_Generic) Test.clone();

        } catch (CloneNotSupportedException e) {

            System.out.println("Clone not supported!");
        }

        System.out.println(Test2 + """
                THis is a clone from object ((Test))//////Test2
                """);

        System.out.println("====================================");

        System.out.println(Test3 + """
                THis is a clone from object ((Test))//////Test3
                """);
    }
}

