import javazoom.jl.decoder.JavaLayerException;
import java.io.*;
import java.net.URISyntaxException;

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
