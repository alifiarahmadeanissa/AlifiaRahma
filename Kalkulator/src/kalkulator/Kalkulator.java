
package kalkulator;

import java.awt.event.*;
import javax.swing.*;


public class Kalkulator {
   public static void main(String[] args) 
   {
	GUI gui = new GUI();
   }
}

class GUI extends JFrame implements ActionListener
{
    int hasil1,hasil2,hasil3,hasil4;
   final JTextField fangka1 = new JTextField(10);
   JLabel langka1 = new JLabel(" Angka ");
   final JTextField fangka2 = new JTextField(10);
   JLabel langka2 = new JLabel(" Angka ");



   JButton btnKali = new JButton("x");
   JButton btnBagi = new JButton("/");
   JButton btnTambah = new JButton("+");
   JButton btnKurang = new JButton("-");
   JButton btnClear = new JButton("C");

   public GUI() 
   {
	setTitle("Kalkulator");
	setDefaultCloseOperation(3);
	setSize(450,300);

	setLayout(null);
	add(langka1);
	add(fangka1);
        add(langka2);
	add(fangka2);
	add(btnKali);
        add(btnBagi);
        add(btnTambah);
        add(btnKurang);
        add(btnClear);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	langka1.setBounds(10,10,120,20);
	fangka1.setBounds(200,10,150,20);
        langka2.setBounds(10,30,120,20);
	fangka2.setBounds(200,30,150,20);
	btnKali.setBounds(10,130,100,20);
        btnBagi.setBounds(110,130,100,20);
        btnTambah.setBounds(210,130,100,20);
        btnKurang.setBounds(310,130,100,20);
        btnClear.setBounds(160,160,100,20);
	setVisible(true);
        
        btnKali.addActionListener(this);
        btnBagi.addActionListener(this);
        btnKurang.addActionListener(this);
        btnTambah.addActionListener(this);
        btnClear.addActionListener(this);
        
   }
   
 public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnKali)
            {
                int angka1 = Integer.valueOf(fangka1.getText());
                int angka2 = Integer.valueOf(fangka2.getText());
                hasil1 = angka1*angka2;
                fangka1.setText(String.valueOf(hasil1));
            }
            else if(e.getSource() == btnBagi)
            {
                int angka1 = Integer.valueOf(fangka1.getText());
                int angka2 = Integer.valueOf(fangka2.getText());
                hasil2 = angka1/angka2;
                fangka1.setText(String.valueOf(hasil2));
            }
            else if(e.getSource() == btnTambah)
            {
                int angka1 = Integer.valueOf(fangka1.getText());
                int angka2 = Integer.valueOf(fangka2.getText());
                hasil3 = angka1+angka2;
                fangka1.setText(String.valueOf(hasil3));
            }
            else if(e.getSource() == btnKurang)
            {
                int angka1 = Integer.valueOf(fangka1.getText());
                int angka2 = Integer.valueOf(fangka2.getText());
                hasil4 = angka1-angka2;
                fangka1.setText(String.valueOf(hasil4));
            }
            else if(e.getSource() == btnClear)
            {
                fangka1.setText("");
                fangka2.setText("");
            }
        }
}
  
