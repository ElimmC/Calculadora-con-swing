
package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Panel extends JFrame {
    
    private JTextField num1, num2, resultado;
    private JButton botonSuma, botonResta, botonDivide, botonMultiplica;
    
    public Panel(){
        calcu ncal=new calcu();
        configurarVentana();
        iniciarComponentes();
    }
    public void configurarVentana(){
        setTitle("Calculadora");
        setSize(800,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.cyan);
    }
    
    public void iniciarComponentes(){
        botonSuma=new JButton ("Sumar");
        botonResta=new JButton ("Restar");
        botonDivide=new JButton ("Dividir");
        botonMultiplica=new JButton ("Multiplicar");
        
        botonSuma.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            accionBotonSuma();
        }
        });
        
        botonResta.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            accionBotonResta();
        }
        });
        
        botonDivide.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            accionBotonDivide();
        }
        });
        
        botonMultiplica.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            accionBotonMultiplica();
        }
        });
        
        setLayout(new FlowLayout());
        add(botonSuma);
        add(botonResta);
        add(botonDivide);
        add(botonMultiplica);
        pack();
        setLocation(500,500);
        setVisible(true);
    }
    
    private void accionBotonSuma(){
     String entrada=JOptionPane.showInputDialog("numero 1");
     calcu ncal=new calcu();
     ncal.setNum1(Double.parseDouble(entrada));
     String entrada2=JOptionPane.showInputDialog("numero 2");
     ncal.setNum2(Double.parseDouble(entrada2));
     double res=ncal.sumar();
     JOptionPane.showMessageDialog(this, "El Resultado es " + res);
    }
    
    private void accionBotonResta(){
      String entrada=JOptionPane.showInputDialog("numero 1");
     calcu ncal=new calcu();
     ncal.setNum1(Double.parseDouble(entrada));
     String entrada2=JOptionPane.showInputDialog("numero 2");
     ncal.setNum2(Double.parseDouble(entrada2));
     double res=ncal.restar();
     JOptionPane.showMessageDialog(this, "El Resultado es " + res);  
    }
    
    private void accionBotonDivide(){
        String entrada=JOptionPane.showInputDialog("numero 1");
     calcu ncal=new calcu();
     ncal.setNum1(Double.parseDouble(entrada));
     String entrada2=JOptionPane.showInputDialog("numero 2");
     ncal.setNum2(Double.parseDouble(entrada2));
     double res=ncal.dividir();
     JOptionPane.showMessageDialog(this, "El Resultado es " + res);
    }
    
    private void accionBotonMultiplica(){
        String entrada=JOptionPane.showInputDialog("numero 1");
     calcu ncal=new calcu();
     ncal.setNum1(Double.parseDouble(entrada));
     String entrada2=JOptionPane.showInputDialog("numero 2");
     ncal.setNum2(Double.parseDouble(entrada2));
     double res=ncal.multiplicar();
     JOptionPane.showMessageDialog(this, "El Resultado es " + res);
    }
    

}
