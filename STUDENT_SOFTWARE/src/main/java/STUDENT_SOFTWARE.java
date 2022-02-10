import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.Arrays;

public class STUDENT_SOFTWARE {

    public  static void creatingPasswordForNewUser(JFrame mainWindow,JFrame createNewUserWindow, Font saveButtonFont){
        createNewUserWindow.dispose();

        JFrame createPasswordWindow = new JFrame("CREATE PASSWORD");
        createPasswordWindow.setResizable(false);
        createPasswordWindow.setBounds(250,20,650,650);
        createPasswordWindow.setVisible(true);
        createPasswordWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createPasswordWindow.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                mainWindow.setVisible(true);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        JLabel createPasswordLabel = new JLabel();
        createPasswordLabel.setVisible(true);
        createPasswordLabel.setBounds(0,0,650,650);
        createPasswordWindow.add(createPasswordLabel);

        JLabel mainIcon = new JLabel();
        mainIcon.setBounds(180, 30, 60, 60);
        mainIcon.setVisible(true);
        mainIcon.setBackground(Color.BLACK);
        createPasswordWindow.add(mainIcon);

        JTextField placeholderTextForPassword = new JTextField("PLEASE ENTER A PASSWORD : ");
        placeholderTextForPassword.setVisible(true);
        placeholderTextForPassword.setBackground(Color.pink);
        placeholderTextForPassword.setForeground(Color.BLACK);
        placeholderTextForPassword.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        placeholderTextForPassword.setBounds(30,250,320,80);
        placeholderTextForPassword.setEditable(false);
        userLoginLabel.add(placeholderTextForPassword);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setVisible(true);
        passwordField.setBackground(Color.pink);
        passwordField.setForeground(Color.BLACK);
        passwordField.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        passwordField.setBounds(350,250,250,80);
        userLoginLabel.add(passwordField);

        JButton saveButton = new JButton("LOGIN");
        saveButton.setVisible(true);
        saveButton.setBounds(160, 400, 300, 60);
        saveButton.setBackground(Color.green);
        saveButton.setForeground(Color.BLACK);
        saveButton.setFont(loginButtonFont);
        userLoginLabel.add(saveButton);





    }
    public  static void createNewUser(JFrame mainWindow,Font saveButtonFont){
        mainWindow.dispose();
        JFrame createNewUserWindow = new JFrame("CREATE NEW USER");
        createNewUserWindow.setResizable(false);
        createNewUserWindow.setBounds(250,20,650,650);
        createNewUserWindow.setVisible(true);
        createNewUserWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createNewUserWindow.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                mainWindow.setVisible(true);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        JLabel userCreateLabel = new JLabel();
        userCreateLabel.setVisible(true);
        userCreateLabel.setBounds(0,0,650,650);
        createNewUserWindow.add(userCreateLabel);

        JLabel mainIcon = new JLabel();
        mainIcon.setBounds(180, 30, 60, 60);
        mainIcon.setVisible(true);
        mainIcon.setBackground(Color.BLACK);
        createNewUserWindow.add(mainIcon);

        JTextField nameField = new JTextField("PLEASE ENTER YOUR NAME : ");
        nameField.setVisible(true);
        nameField.setBackground(Color.pink);
        nameField.setForeground(Color.BLACK);
        nameField.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        nameField.setBounds(30,120,580,80);
        userCreateLabel.add(nameField);

        JTextField classField = new JTextField("PLEASE ENTER YOUR CLASS : ");
        classField.setVisible(true);
        classField.setBackground(Color.pink);
        classField.setForeground(Color.BLACK);
        classField.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        classField.setBounds(30,220,580,80);
        userCreateLabel.add(classField);

        JTextField indexField = new JTextField("PLEASE ENTER YOUR INDEX NO : ");
        indexField.setVisible(true);
        indexField.setBackground(Color.pink);
        indexField.setForeground(Color.BLACK);
        indexField.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        indexField.setBounds(30,320,580,80);
        userCreateLabel.add(indexField);

        JTextField ageField = new JTextField("PLEASE ENTER YOUR AGE : ");
        ageField.setVisible(true);
        ageField.setBackground(Color.pink);
        ageField.setForeground(Color.BLACK);
        ageField.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        ageField.setBounds(30,420,580,80);
        userCreateLabel.add(ageField);

        JButton saveButton = new JButton("SAVE");
        saveButton.setVisible(true);
        saveButton.setBounds(160, 540, 300, 60);
        saveButton.setBackground(Color.green);
        saveButton.setForeground(Color.BLACK);
        saveButton.setFont(saveButtonFont);
        userCreateLabel.add(saveButton);

        //all button clicks
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                creatingPasswordForNewUser(mainWindow,createNewUserWindow,saveButtonFont);
            }
        });



    }
    public static void loginUser(JFrame mainWindow, Font loginButtonFont){
        mainWindow.dispose();
        JFrame loginUserWindow = new JFrame("USER LOGIN");
        loginUserWindow.setResizable(false);
        loginUserWindow.setBounds(250,20,650,650);
        loginUserWindow.setVisible(true);
        loginUserWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginUserWindow.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                mainWindow.setVisible(true);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        JLabel userLoginLabel = new JLabel();
        userLoginLabel.setVisible(true);
        userLoginLabel.setBounds(0,0,650,650);
        loginUserWindow.add(userLoginLabel);

        JLabel mainIcon = new JLabel();
        mainIcon.setBounds(180, 30, 60, 60);
        mainIcon.setVisible(true);
        mainIcon.setBackground(Color.BLACK);
        loginUserWindow.add(mainIcon);

        JTextField indexField = new JTextField("PLEASE ENTER YOUR INDEX NO : ");
        indexField.setVisible(true);
        indexField.setBackground(Color.pink);
        indexField.setForeground(Color.BLACK);
        indexField.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        indexField.setBounds(30,150,580,80);
        userLoginLabel.add(indexField);

        JTextField placeholderTextForPassword = new JTextField("PLEASE ENTER YOUR PASSWORD : ");
        placeholderTextForPassword.setVisible(true);
        placeholderTextForPassword.setBackground(Color.pink);
        placeholderTextForPassword.setForeground(Color.BLACK);
        placeholderTextForPassword.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        placeholderTextForPassword.setBounds(30,250,320,80);
        placeholderTextForPassword.setEditable(false);
        userLoginLabel.add(placeholderTextForPassword);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setVisible(true);
        passwordField.setBackground(Color.pink);
        passwordField.setForeground(Color.BLACK);
        passwordField.setFont(Font.getFont("Serif",new Font("Serif",Font.ITALIC,20)));
        passwordField.setBounds(350,250,250,80);
        userLoginLabel.add(passwordField);

        JButton saveButton = new JButton("LOGIN");
        saveButton.setVisible(true);
        saveButton.setBounds(160, 400, 300, 60);
        saveButton.setBackground(Color.green);
        saveButton.setForeground(Color.BLACK);
        saveButton.setFont(loginButtonFont);
        userLoginLabel.add(saveButton);

    }
    public static void mainWindow() throws IOException {

        //fonts
        Font main_window_buttons_font = new Font("Serif", Font.BOLD, 25);
        Font cpyRight_font = new Font("Serif", Font.BOLD, 15);

        //program
        JFrame mainWindow = new JFrame("STUDENT MANAGEMENT");
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setBounds(250, 20, 650, 650);
        mainWindow.setResizable(false);


        JLabel mainWindowLabel = new JLabel();
        mainWindowLabel.setVisible(true);
        mainWindowLabel.setBounds(0, 0, 650, 650);
        mainWindowLabel.setBackground(Color.BLUE);
        mainWindow.add(mainWindowLabel);

        JLabel mainIcon = new JLabel();
        mainIcon.setBounds(180, 30, 60, 60);
        mainIcon.setVisible(true);
        mainIcon.setBackground(Color.BLACK);
        mainWindowLabel.add(mainIcon);

        JButton user_create = new JButton("CREATE A NEW USER");
        user_create.setVisible(true);
        user_create.setBounds(30, 210, 580, 80);
        user_create.setBackground(Color.green);
        user_create.setForeground(Color.BLACK);
        user_create.setFont(main_window_buttons_font);
        mainWindowLabel.add(user_create);


        JButton user_login = new JButton("USER LOGIN");
        user_login.setVisible(true);
        user_login.setBounds(30, 340, 580, 80);
        user_login.setBackground(Color.green);
        user_login.setForeground(Color.BLACK);
        user_login.setFont(main_window_buttons_font);
        mainWindowLabel.add(user_login);

        JLabel copyRight = new JLabel("All rights Reserved");
        copyRight.setVisible(true);
        copyRight.setBounds(260, 500, 150, 40);
        copyRight.setFont(cpyRight_font);
        copyRight.setForeground(Color.GRAY);
        mainWindowLabel.add(copyRight);

        //all button clicks
        user_create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewUser(mainWindow,main_window_buttons_font);
            }
        });

        user_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser(mainWindow,main_window_buttons_font);
            }
        });


    }

    public static void main(String args[]) throws IOException {

        mainWindow();
    }
}
