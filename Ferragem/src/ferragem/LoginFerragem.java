
package ferragem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class LoginFerragem extends JFrame{
    Container containerLogin;
    
    JPanel esquerdoPanel = new JPanel();
    JLabel imagemPrincipalLabel = new JLabel();
    JLabel welcomeLabel = new JLabel("Bem Vindo");
    JLabel nomeFerragemLabel = new JLabel("Ferragem  Langa");
    
    JPanel direitoPanel = new JPanel();
    JLabel ferragemLoginLabel = new JLabel("Login do Sistema de Ferragem");
    JLabel facaLoginLabel = new JLabel("Faça o login");
    
    JLabel usernameLabel = new JLabel("Username");
    JTextField usernameField = new JTextField();
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    
    
    LoginFerragem(){
        setTitle("Login - Ferragem Langa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 450);
        setResizable(false);
        containerLogin =  getContentPane();
        containerLogin.setLayout(null);
        
        Color preto = new Color(3,3,3);
        Color verde = new Color(1,94,109);
        Color verdeClaro = new Color(0,199,138);
         
        //Dados do painel Esquerdo
        imagemPrincipalLabel.setBounds(25,40,250,200);
        imagemPrincipalLabel.setIcon(new ImageIcon("chaves.png"));
        esquerdoPanel.add(imagemPrincipalLabel);
        
        welcomeLabel.setBounds(100,130,200,350);
        welcomeLabel.setForeground(verdeClaro);
        welcomeLabel.setFont(new Font("Times New Roman", Font.PLAIN,22));
        esquerdoPanel.add(welcomeLabel);
        
        nomeFerragemLabel.setBounds(80,160,200,350);
        nomeFerragemLabel.setForeground(Color.white);
        nomeFerragemLabel.setFont(new Font("Times New Roman", Font.PLAIN,22));
        esquerdoPanel.add(nomeFerragemLabel);
        
        esquerdoPanel.setLayout(null);
        esquerdoPanel.setBounds(0,0,300,415);
        esquerdoPanel.setBackground(preto);
        
        
        //Dados do Painel Direito
        ferragemLoginLabel.setBounds(20,40,340,70);
        ferragemLoginLabel.setFont(new Font("Monospaced", Font.BOLD,18));
        ferragemLoginLabel.setForeground(verde);
        direitoPanel.add(ferragemLoginLabel);
        
        facaLoginLabel.setBounds(20,60,300,70);
        facaLoginLabel.setFont(new Font("Times New Roman", Font.PLAIN,17));
        facaLoginLabel.setForeground(preto);
        direitoPanel.add(facaLoginLabel);
        
        usernameLabel.setBounds(20,130,300,70);
        usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN,18));
        usernameLabel.setForeground(verde);
        direitoPanel.add(usernameLabel);
        
        usernameField.setBounds(20,180,300,20);
        usernameField.setFont(new Font("Times New Roman", Font.PLAIN,19));
        direitoPanel.add(usernameField);
        
        passwordLabel.setBounds(20,240,300,20);
        passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN,18));
        passwordLabel.setForeground(verde);
        direitoPanel.add(passwordLabel);
        
        passwordField.setBounds(20,260,300,20);
        direitoPanel.add(passwordField);
        
        loginButton.setBounds(20,320,100,30);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(verde);
        direitoPanel.add(loginButton);
        
        direitoPanel.setLayout(null);
        direitoPanel.setBounds(300,0,350,415);
        direitoPanel.setBackground(Color.white);
        
        
        
        containerLogin.add(esquerdoPanel);
        containerLogin.add(direitoPanel);
        
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
