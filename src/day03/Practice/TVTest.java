package day03.Practice;

public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.getChannel());
        tv.channelUp();
        System.out.println(tv.getChannel());
        tv.channelDown();
        System.out.println(tv.getChannel());
        tv.setChannel(50);
        System.out.println(tv.getChannel());
    }
}
