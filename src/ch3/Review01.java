package ch3;

public class Review01 {
    public static void main(String[] args) {
        int myAge = 23;
        int teacherAge = 38;

        boolean value = (myAge > 25);
        System.out.println(value);

        System.out.println(myAge <= 25);
        System.out.println(myAge == teacherAge);

        char ch;
        ch = (myAge > teacherAge) ? 'T' : 'F';
        System.out.println(ch);

        int num = -5 + 3 * 10 / 2; //우선순위 : 곱셈 > 나눗셈 > 덧셈,뺄셈
        System.out.println(num);
    }
}
