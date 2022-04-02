package Tamrin_Manzel_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name:");
        String Name = scanner.next();

        System.out.print("Please enter your student code:");
        String Code = scanner.next();

        System.out.print("Please enter your score:");
        String Score = scanner.next();

        Student_Map Test = new Student_Map(Name, Code, Score);

        Test.Get_info();

    }
}
