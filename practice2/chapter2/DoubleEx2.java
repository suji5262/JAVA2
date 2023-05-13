package chapter2;

public class DoubleEx2 {
    public static void main(String[] args) {

        double dnum = 1;

        for (int i = 0; i < 10000; i++) { // 지정한 문장을 정해진 횟수만큼 반복해서 수행해라
            dnum = dnum + 0.1;
        } // 더하기를 10,000번 반복하라는 의미
        // 약간의 오차를 감수하고라도 더 넓은 범위의 실수 값을 표현하기 위해 부동 소수점 반식을 사용

        System.out.println(dnum);
    }
}
