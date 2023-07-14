package chapter2;

public class TypeInference1 {
    public static void main(String[] args) {

        var i = 10; // int i = 10
        var j = 10.0; // int j = 10.0
        var str = "hello"; // String str = "hello"

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test"; // 다른 문자열은 대입 가능
//        str = 3; // str 변수는 String 으로 먼저 사용 → 정수 값 사용 불가능

    }
}
