package ch3;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;
        
        //&& : 앞 거짓이면 뒤에것 실행 x
        //|| : 앞 거짓이어도 뒤에것 실행
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
