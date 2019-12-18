import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException, JavaLayerException, InterruptedException, URISyntaxException {
        while(true) {
            if (Alarm.isAlarm()) {
                Alarm alarm = new Alarm();
                alarm.startAlarm();

                alarm = null;
                System.gc();
            }
            Thread.sleep(60000);
        }
    }
}
