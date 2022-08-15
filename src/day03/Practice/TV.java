package day03.Practice;

import lombok.Data;

@Data
public class TV {
    private int channel = 7;
    private int volume = 20;
    private boolean power = false;

    public void channelUp(){
        this.channel++;
    }
    public void channelDown(){
        this.channel--;
    }

    public void volumeUp(){
        this.volume++;
    }
    public void volumeDown(){
        this.volume--;
    }

    public void powerOn(){
        this.power = true;
    }
    public void powerOff(){
        this.power = false;
    }
}
