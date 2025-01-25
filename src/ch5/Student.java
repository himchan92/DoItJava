package ch5;

//클래스명
public class Student {
    //멤버변수 = 필드
    int studentId;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }
}
