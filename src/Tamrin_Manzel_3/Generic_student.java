package Tamrin_Manzel_3;

import java.util.*;

public class Generic_student <Name, Code, Father> {

    public Name x;
    public Code y;
    public Father z;

    private double Score1, Score2, Score3;
    private double Score4, Score5;

    Scanner OBJECT = new Scanner(System.in);
    List <Double> list = new ArrayList <> ();

    public Name getX() {
        return x;
    }

    public void setX(Name x) {
        this.x = x;
    }

    public Code getY() {
        return y;
    }

    public void setY(Code y) {
        this.y = y;
    }

    public Father getZ() {
        return z;
    }

    public void setZ(Father z) {
        this.z = z;
    }

    public double getScore1() { return Score1; }

    public void setScore1(double score1) { Score1 = score1; }

    public double getScore2() { return Score2; }

    public void setScore2(double score2) { Score2 = score2; }

    public double getScore3() { return Score3; }

    public void setScore3(double score3) { Score3 = score3; }

    public double getScore4() { return Score4; }

    public void setScore4(double score4) { Score4 = score4; }

    public double getScore5() { return Score5; }

    public void setScore5(double score5) { Score5 = score5; }

    public void Get_Score() {

        for (int i = 1; i <= 5; i += 1)
        {
            System.out.format("please enter your Score (%d of 5):", i);

            Double Score = OBJECT.nextDouble();

            list.add(Score);

        }
    }

    public void Show_List() {

        for (Double S : list)
            System.out.format("""
                    Your scores:%.6f
                    """, S);
    }
}
