package Tamrin_Manzel_2;

public class Student_Generic <Name, Password, Email> implements Cloneable {

    public Name x;
    public Password y;
    public Email z;

    public void SHOW() {

        System.out.format("""
                Name = %s
                Password = %s
                Email = %S
                """, x, y, z);

    }

    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }
}
