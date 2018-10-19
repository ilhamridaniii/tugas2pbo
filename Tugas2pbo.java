package Tugas2pbo;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class Tugas2pbo extends JFrame {    
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);    
    JLabel lblnik=new JLabel("NIK");    
    JTextField txnik=new JTextField(7);    
    JLabel lblkelamin=new JLabel("Jenis Kelamin");    
    JRadioButton pria=new JRadioButton("Pria");    
    JRadioButton wanita=new JRadioButton("Wanita");    
    ButtonGroup kelompok=new ButtonGroup();    
    JLabel lblkendaraan=new JLabel("Jenis Kendaraan");    
    JCheckBox honda=new JCheckBox("Honda");    
    JCheckBox yamaha=new JCheckBox("Yamaha");    
    JCheckBox suzuki=new JCheckBox("Suzuki"); 
    JCheckBox kawasaki=new JCheckBox("Kawasaki");
    JCheckBox lainnya=new JCheckBox("Lainnya");
    JButton cetak=new JButton("Cetak");    
    JTextArea hasil=new JTextArea(); 
 
   Tugas2pbo()    {       
       setTitle("Event Sederhana");
       setLocation(300,100);       
       setSize(300,320);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
   } 
 
   void KomponenVisual()    
   {       
       getContentPane().setLayout(null);
       getContentPane().add(lblnama);       
       lblnama.setBounds(10,10,80,20);       
       getContentPane().add(txnama);       
       txnama.setBounds(105,10,175,20);       
       getContentPane().add(lblnik);       
       lblnik.setBounds(10,33,80,20);       
       getContentPane().add(txnik);       
       txnik.setBounds(105,33,70,20);       
       getContentPane().add(lblkelamin);       
       lblkelamin.setBounds(10,56,80,20);       
       kelompok.add(pria);       
       kelompok.add(wanita);      
       getContentPane().add(pria);      
       pria.setBounds(105,56,50,20);       
       getContentPane().add(wanita); 
       wanita.setBounds(160,56,70,20);       
       getContentPane().add(lblkendaraan);       
       lblkendaraan.setBounds(10,80,70,20);       
       getContentPane().add(honda);       
       honda.setBounds(105,80,100,20);       
       getContentPane().add(yamaha);       
       yamaha.setBounds(105,103,100,20);       
       getContentPane().add(suzuki);       
       suzuki.setBounds(105,126,100,20);
       getContentPane().add(kawasaki);       
       kawasaki.setBounds(105,146,100,20);
       getContentPane().add(lainnya);       
       lainnya.setBounds(105,166,100,20);       
       getContentPane().add(cetak);       
       cetak.setBounds(10,195,270,30);       
       getContentPane().add(hasil);       
       hasil.setBounds(10,225,270,100);       
       setVisible(true);    
   } 
 
   void AksiReaksi()   
   {
       cetak.addActionListener(new ActionListener()               
       {
       public void actionPerformed(ActionEvent e)          
       {
       hasil.append(txnama.getText()+"\n");  
       hasil.append(txnik.getText()+"\n");            
       if(pria.isSelected()==true)             
       {                
hasil.append(pria.getText()+"\n");            
}             else             {                
hasil.append(wanita.getText()+"\n");             
} 
 
if(honda.isSelected()==true)            
{               
hasil.append(honda.getText()+"\n");             
}             if(yamaha.isSelected()==true)             {  
hasil.append(yamaha.getText()+"\n");             }         
if(suzuki.isSelected()==true)             {           
hasil.append(suzuki.getText()+"\n");
if(kawasaki.isSelected()==true)             {           
hasil.append(kawasaki.getText()+"\n");
if(lainnya.isSelected()==true)             {           
hasil.append(lainnya.getText()+"\n");
} 
   }       
}
       }
       });    
   } 
 
   public static void main(String args[])    {       
       Tugas2pbo e5=new Tugas2pbo();       
       e5.KomponenVisual();       
       e5.AksiReaksi();    
   } 
} 
