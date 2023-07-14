package chapter2;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 더해짐
        int iNum4 = (int)(dNum1 + fNum2);
        System.out.println(iNum3);
        // 두 실수가 각각 명시적으로 형 변환이 일어남
        // 1 + 0 = 1
        System.out.println(iNum4);
        // dNum1 + fNum2 먼저 계산함
        // 두 실수의 자료형이 다르지만 float 형이 double 형으로 변환되는 묵시적 형 변환이 일어남
        // 결과 : 2.1
        // 이후 int 형으로 명시적 변환이 되어 결국 → 값은 : 2 가 된다
    }
}
