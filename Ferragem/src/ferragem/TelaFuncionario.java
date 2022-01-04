
package ferragem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TelaFuncionario extends JFrame{
    Container containerF;
    
    JPanel painelCima = new JPanel();
    JLabel logoLabel = new JLabel();
    JLabel logoTextLabel = new JLabel("Ferragem Langa");
    JLabel casaFerragemLabel = new JLabel();
    
    
    JPanel painelEsquerdo = new JPanel();
    //Dados para Data
    SimpleDateFormat data = new SimpleDateFormat("dd, MMMM, yyyy");
    SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
    SimpleDateFormat semana = new SimpleDateFormat("EEEE");
    Calendar dataCalendar = Calendar.getInstance(); //singleton
    Calendar horaCalendar = Calendar.getInstance();
    Calendar semanaCalendar = Calendar.getInstance();
    
    JLabel semanaLabel = new JLabel((semana.format(semanaCalendar.getTime()))+"  - ");
    JLabel dataLabel = new JLabel((data.format(dataCalendar.getTime())));
    JLabel horaLabel = new JLabel((hora.format(horaCalendar.getTime()))+" horas");
    //Dados Pessoais
    JLabel nomeFuncionarioLabel = new JLabel("Dalton Viriato Chivambo");
    JLabel fotoFuncionarioLabel = new JLabel();
    JLabel welcomeLabel = new JLabel("Welcome");
    JLabel textoCodLabel = new JLabel("Cod Vendedor:");
    JLabel codVendedorLabel = new JLabel("1054");
    JButton myAccountButton = new JButton("Minhas Informações");
    
    //Painel Direito
    JPanel painelDireito = new JPanel();
    JButton vendaButton = new JButton();
    JButton visualizarButton = new JButton();
    JButton terminarSeccaoButton = new JButton();
    
    TelaFuncionario(){
        setTitle("Welcome To System");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(650,450);
        setLocationRelativeTo(null);
        setResizable(false);
        containerF = getContentPane();
        containerF.setLayout(null);
        
        Color azulEscuro = new Color(1,94,109);

        Color preto = new Color(3,3,3);
        
        //Dados do painel de cima
        logoLabel.setBounds(20,0,170,100);
        logoLabel.setIcon(new ImageIcon("chave_funcionario.jpeg"));
        painelCima.add(logoLabel);
        
        casaFerragemLabel.setBounds(550,0,170,100);
        casaFerragemLabel.setIcon(new ImageIcon("casaferragem.jpg"));
        painelCima.add(casaFerragemLabel);
        
        logoTextLabel.setForeground(Color.white);
        logoTextLabel.setBounds(100, 0, 170, 100);
        logoTextLabel.setFont(new Font("Times New Roman", Font.BOLD,22));
        painelCima.add(logoTextLabel);
        

        painelCima.setLayout(null);
        painelCima.setBounds(0,0,650,100);
        painelCima.setBackground(preto);
        
        //Dados do painel esquerdo
        dataLabel.setBounds(60, 5, 200, 20);
        dataLabel.setForeground(Color.WHITE);
        dataLabel.setFont(new Font("Times New Roman", Font.PLAIN,19));
        painelEsquerdo.add(dataLabel);
        
        semanaLabel.setBounds(20,30,200,20);
        semanaLabel.setForeground(Color.white);
        semanaLabel.setFont(new Font("Times New Roman", Font.PLAIN,19));
        painelEsquerdo.add(semanaLabel);
        
        horaLabel.setBounds(120,30,200,20);
        horaLabel.setForeground(Color.white);
        horaLabel.setFont(new Font("Times New Roman", Font.PLAIN,19));
        painelEsquerdo.add(horaLabel);
        
        welcomeLabel.setBounds(20,70,200,20);
        welcomeLabel.setForeground(Color.white);
        welcomeLabel.setFont(new Font("Times New Roman", Font.PLAIN,19));
        painelEsquerdo.add(welcomeLabel);
        
        nomeFuncionarioLabel.setBounds(20,90,200,20);
        nomeFuncionarioLabel.setForeground(Color.white);
        nomeFuncionarioLabel.setFont(new Font("Times New Roman", Font.BOLD,18));
        painelEsquerdo.add(nomeFuncionarioLabel);
        
        fotoFuncionarioLabel.setBounds(20,120,100,100);
        fotoFuncionarioLabel.setIcon(new ImageIcon("dalton.jpg"));
        painelEsquerdo.add(fotoFuncionarioLabel);
        
        textoCodLabel.setBounds(120,140,150,20);
        textoCodLabel.setForeground(Color.white);
        textoCodLabel.setFont(new Font("Times New Roman",Font.PLAIN,19));
        painelEsquerdo.add(textoCodLabel);
        
        codVendedorLabel.setBounds(190,160,150,20);
        codVendedorLabel.setForeground(Color.white);
        codVendedorLabel.setFont(new Font("Times New Roman",Font.PLAIN,19));
        painelEsquerdo.add(codVendedorLabel);
        
        myAccountButton.setBounds(20,240,200,30);
        myAccountButton.setForeground(azulEscuro);
        myAccountButton.setBackground(Color.white);
        painelEsquerdo.add(myAccountButton);
        
        painelEsquerdo.setLayout(null);
        painelEsquerdo.setBounds(0,101,250,320);
        painelEsquerdo.setBackground(azulEscuro);
        
        
        //Dados do painel Direito
        painelDireito.setLayout(null);
        painelDireito.setBounds(252,101,400,320);
        painelDireito.setBackground(Color.white);
        
        
        containerF.add(painelCima);
        containerF.add(painelEsquerdo);
        containerF.add(painelDireito);
        setVisible(true);
        
    }
    
    
    
}
