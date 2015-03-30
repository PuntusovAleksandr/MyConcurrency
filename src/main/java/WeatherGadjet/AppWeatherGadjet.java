package WeatherGadjet;

import javax.swing.*;

/**
 * Created by Aleksandr on 28.03.2015.
 */
public class AppWeatherGadjet {
    private static JFrame frame;

    public static void main(String[] args) throws InterruptedException {


        frame = new JFrame("Weatheer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 450);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
//        frame.add(new FonToPanel());
        frame.add(new MyPanel());


        frame.setVisible(true);

    }
}
