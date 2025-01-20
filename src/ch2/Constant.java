package ch2;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; //상수 = 변하지 않는 수 = 초기화 필수(안하면 오류)

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
        
        //MAX_NUM = 11; 상수는 초기화 이후 변경 불가능하여 오류발생
        
        //상수장점 : 변경되지 않고 선언부분에 변수명 부분만 수정하면되므로 사용편리
    }

}
