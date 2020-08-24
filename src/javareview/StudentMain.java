package javareview;

public class StudentMain {
    //shortcut: psvm
    public static void main(String[] args){
        Student kwan = new Student(1, "Kwan");
        Student kate = new Student(2, "kate");

        System.out.println(kwan);
        System.out.println(kate);

        kwan.setMidtermScore(10);
        kwan.setFinalScore(8);
        System.out.println("kwan's total = " + kwan.getTotalScore());
//
//        Student s = kwan;
//        s.id = 100;
//        System.out.println(kwan.id + ": " + kwan.name);

    }
}


