package Kar_Kelasi;

public class Main {

    public static void main(String[] args) {

        var Test_OB = new Objects_Class("CE", "Mabijan", "1234",
                "18", "Bijanpour", "Mahan");

        System.out.println(Test_OB.getName());      // Getting the variables with Getter methods!
        System.out.println(Test_OB.getFamily());
        System.out.println(Test_OB.getAge());
        System.out.println(Test_OB.getUsername());
        System.out.println(Test_OB.getPass());
        System.out.println(Test_OB.getJob());

        System.out.println("==================================================");

        Test_OB.print_info();   // Getting the variables with method!
    }
}
