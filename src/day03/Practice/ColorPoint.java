package day03.Practice;

public class ColorPoint extends Point{
    private String color;
    public ColorPoint() {
        System.out.println("ColorPoint 기본 생성자");
    }
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    public void show() {
        System.out.printf("좌표[x=%d,y=%d,color=%s]에 점을 그렸습니다.\n",x,y,color);
    }

}
