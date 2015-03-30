package WeatherGadjet;

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr on 28.03.2015.
 */
public class MyPanel extends JPanel {

    private Image fon;

    WeatherDoc weatherDoc  = new WeatherDoc("2347537", "c");;
    WeatherDisplay display;

    public MyPanel() {
        fon = new ImageIcon("D:\\Джава с нуля\\Обменник\\Джава Практика\\HW\\HW5\\MyConcurrency\\src\\main\\resources\\fon.jpg").getImage();
        display = new WeatherDisplay();
        thread.start();
    }
    Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(" Ошибка ");
            }
        }
    }
});

    @Override
    public void paint(Graphics g) {
        g = ((Graphics2D) g);
        g.drawImage(fon, 0, 0, null);
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.ITALIC, 20));

        g.drawString("Город : " + display.getCity(), 50, 30);
        g.drawString("Температура в городе : " + display.getTemperature() + " " + display.getTemperatureUnit(), 50, 60);
    }


/**
 * String jDnepr= "2347537";
 * String jKiev= "924938";
 * String jOdessa="929398";
 * String jLvov="924943";
 * String jZaporozje="939628";
 * */
}
