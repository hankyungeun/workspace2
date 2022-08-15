package day03.Practice;

import lombok.Data;

@Data
public class Point {
    protected int x;
    protected int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        System.out.println("point 기본 생성자");
    }

    public void show() {
        System.out.printf("좌표[x=%d,y=%d]에 점을 그렸습니다.\n",x,y);
    }
    public void show(boolean visible) {
        if(visible) {
            show();
        }else {
            System.out.printf("좌표[x=%d,y=%d]에 점을 지웠습니다.\n",x,y);
        }

    }
}
