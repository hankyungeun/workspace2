package day03.Practice;


public class ArrayUtils {
    // int 배열을 double 배열로 변환
    static double [] intToDouble( int[] source ){
        double[] arr = new double[source.length];
        for(int i = 0; i <source.length; i++){
            arr[i] = (double) Math.ceil(source[i]);
        }
        return arr;
    }
    // double 배열을 int 배열로 변환
    static int [] doubleToInt( double[] source ){
        int[] arr = new int[source.length];
        for(int i = 0; i < source.length; i++){
            arr[i] = (int)Math.ceil(source[i]);
        }
        return arr;
    }
    // int 배열 두 개를 연결한 새로운 배열 리턴
//    static int [] concat( int[] s1, int[] s2 ){
//        int[] arr = addIntArr(s1, s2);
//
//        return concat(s1.concat(s2));
//    }
}
