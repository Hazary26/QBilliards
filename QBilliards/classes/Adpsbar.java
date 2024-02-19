package classes;
import javax.swing.*;
import java.awt.*;

public class Adpsbar extends JFrame {
    private JPanel progressPanel;
    private JProgressBar progressBar;
    private JLabel progres_label2;
    ImageIcon progres_image2;

    public Adpsbar() {
        super("Loading");
        this.setBounds(0,0,1366, 768);
        progressPanel = new JPanel();
        progressPanel.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        progres_label2 =new JLabel();
        progres_image2 = new ImageIcon("image/pbarr.jpg");
        progres_label2.setBounds(0,0,1366,768);
        progres_label2.setIcon(progres_image2);
        progressPanel.add(progres_label2);

        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setBounds(528, 332, 345, 40);
        progressBar.setStringPainted(true);
        progressPanel.add(progressBar);

        progressBar.setString("Loading...");
        progressBar.setFont(new Font("Arial", Font.BOLD, 16));
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(new Color(226,122,189));
        new TaskWorker().execute();
        add(progressPanel);
    }


    private class TaskWorker extends SwingWorker<Void, Void> {
        @Override
        protected Void doInBackground() throws Exception {
            int counter = 0;
            while (counter <= 100) {
                progressBar.setValue(counter);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter += 10;
            }
            dispose(); 
            Ahome home= new Ahome(); 
            home.setVisible(true);

            return null;
        }
    }
}
