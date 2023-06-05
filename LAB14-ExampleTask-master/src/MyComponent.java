import javax.swing.*;
import java.awt.*;

public class MyComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g){
        int counter = 0;
        for (int i= 0; i<8; i++) {
            for (int j= 0; j<8; j++) {
                counter += 1;

                if (counter%2 ==0) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.gray);
                }
                g.fillRect(0+i*10, 0+j*10, 10, 10);
            }
            counter += 1;
        }
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Times New Roman", Font.BOLD, 20));
        g.drawString("My own component", 30, 50);
    }
}
