package day01.Practice;

public class Swap {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 30;
        // Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.

        if (n1 < n2) {
            int t;
            t = n1;
            n1 = n2;
            n2 = t;
        }
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        // Q2: 아래에서 잘못된 것을 찾아서 수정하라.
        int a1 = 20;
        int a2 = 10;
        int a3 = 50;
        if (a1 >= a2) {
            if (a2 > a3) {
                System.out.println("a1이 최대값입니다.");
            }
            if (a2 < a3) {
                System.out.println("a3이 최대값입니다.");
            }
        } else {
            System.out.println("a1(" + a1 + ")은 a2(" + a2 + ")보다 작습니다.");
        }

    }

}
