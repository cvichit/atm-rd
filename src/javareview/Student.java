package javareview;

public class Student {
    // --------- access specifier / access modifier -----
    // ตัวระบุการเช้าถึงตัวแปรและเมทอด มี 4 ระดับ
    // private, public, package (default), protected

    // -------- 1. field, attribute, instance variable
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;

    // --------- 2. constructor ----------
    // ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริิ่มต้นให้ field
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    // --------- 3. method (คล้ายฟังก์ชัน)
    public double getTotalScore() {
        double total = midtermScore+finalScore;
        return total;
    }
    // getters
    public  int getId(){
        return id;
    }
    // setters
    public  String getName(){
        return name;
    }

    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }
    public  void setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }
    // toString method
    public  String toString(){
        return  id + " -- " +name;
    }
}
