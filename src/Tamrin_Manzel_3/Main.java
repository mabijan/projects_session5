package Tamrin_Manzel_3;

import Tamrin_Manzel_2.Student_Generic;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the user name:");
        String Name = scanner.next();

        System.out.print("Please enter the user code:");
        String Code = scanner.next();

        System.out.print("Please enter the user father:");
        String Father = scanner.next();

        Generic_student Test = new Generic_student();

        Test.setX(Name);
        Test.setY(Code);
        Test.setZ(Father);

        Test.Get_Score();
        Test.Show_List();

    }
}
