import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class Clock extends JPanel {
    private JLabel timeLabel;
    public Clock() {
        setBounds(20,70,200,100);
        setLayout(new FlowLayout());
        timeLabel = new JLabel();
        add(timeLabel);
    }
    public void Start(int n) {
        new Thread(()->{
            while (true) {
                updateAnotherTime(n);
            }
        }).start();
    }
    private void updateAnotherTime(int time){
        TimeZone newTimeZone = TimeZone.getTimeZone("GMT+"+time);
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(newTimeZone);
        String newTime = sdf.format(currentDate);
        timeLabel.setText(newTime);
    }
}
