package day03.Practice;

import lombok.Data;

@Data
public class Song {
    private String title;
    private String artist;
    private String album;
    private String composer;
    private String year;
    private String track;


    public void show(){
        System.out.println(artist +" " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
    }
}
