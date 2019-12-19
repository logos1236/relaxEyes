import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alarm {
    private static ClassLoader classLoader = Main.class.getClassLoader();
    private static String alarm_file_path = "Ship.mp3";
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm");

    private InputStream stream = null;
    private Player player = null;

    public Alarm() throws JavaLayerException {
        this.stream = classLoader.getResourceAsStream(alarm_file_path);
        this.player = new Player(stream);
    }

    public static boolean isAlarm() {
        int current_minute = Integer.parseInt(dtf.format(LocalDateTime.now()));
        if (current_minute==0) {
            return true;
        } else {
            return false;
        }
    }

    public void startAlarm() throws JavaLayerException {
        System.out.println("Relax eyes! "+ LocalDateTime.now());
        System.out.println("Memory usage:"+(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        System.out.println("=======");

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Window();
            }
        });

        player.play();
        player.close();

        player = null;
        stream = null;
    }
}
