import javax.swing.*;

public class Test {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(50,50,500,500);
        frame.setDefaultCloseOperation(3);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setVisible(true);
        frame.setJMenuBar(menuBar);

        JMenu menu1 = new JMenu("SAVE");
    }
}
