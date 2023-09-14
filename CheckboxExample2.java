import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CheckboxExample2 {
    // constructor to initialize
    CheckboxExample2() {
        
		// creating the frame
        System.out.println("In constructor:");
        Frame f = new Frame("CheckBox Example");
        
		// creating the label
        final Label label = new Label();
		final Label label1 = new Label("DMGT");
		final Label label2 = new Label("C++");
		final Label label3 = new Label("PWP");
		final Label label4 = new Label("ICE");
		final Label label5 = new Label("COA");
		final Label label6 = new Label("SS");
        
		//setting the alignment, size of labels and checkboxs
        label1.setAlignment(Label.CENTER);
        label1.setSize(400, 100);
		label1.setBounds(1,70,50,50);
        
		
        Checkbox checkbox1 = new Checkbox("MA101");
        checkbox1.setBounds(20, 100, 70, 50);
        Checkbox checkbox2 = new Checkbox("MA102");
        checkbox2.setBounds(100, 100, 80, 50);
		Checkbox checkbox3 = new Checkbox("MA103");
        checkbox3.setBounds(200, 100, 80, 50);
        Checkbox checkbox4 = new Checkbox("MA104");
        checkbox4.setBounds(300, 100, 80, 50);
		Checkbox checkbox5 = new Checkbox("MA105");
        checkbox5.setBounds(400, 100, 80, 50);
        Checkbox checkbox6 = new Checkbox("MA106");
        checkbox6.setBounds(500, 100, 80, 50);
		Checkbox checkbox7 = new Checkbox("MA107");
        checkbox7.setBounds(600, 100, 80, 50);
        Checkbox checkbox8 = new Checkbox("MA108");
        checkbox8.setBounds(700, 100, 80, 50);
		Checkbox checkbox9 = new Checkbox("MA109");
        checkbox9.setBounds(800, 100, 80, 50);
        Checkbox checkbox10= new Checkbox("MA110");
        checkbox10.setBounds(900, 100, 80, 50);
		Checkbox checkbox11 = new Checkbox("MA111");
        checkbox11.setBounds(1000, 100, 80, 50);
        Checkbox checkbox12 = new Checkbox("MA112");
        checkbox12.setBounds(1100, 100, 80, 50);
		Checkbox checkbox13 = new Checkbox("MA113");
        checkbox13.setBounds(1200, 100, 80, 50);
        Checkbox checkbox14 = new Checkbox("MA115");
        checkbox14.setBounds(1300, 100, 80, 50);
		
		
		//setAlignment of 2nd Subject
		label2.setAlignment(Label.CENTER);
        label2.setSize(400, 100);
		label2.setBounds(1,140,50,50);
        
		Checkbox checkbox15 = new Checkbox("MA101");
        checkbox15.setBounds(20, 170, 70, 50);
        Checkbox checkbox16 = new Checkbox("MA102");
        checkbox16.setBounds(100, 170, 80, 50);
		Checkbox checkbox17 = new Checkbox("MA103");
        checkbox17.setBounds(200, 170, 80, 50);
        Checkbox checkbox18 = new Checkbox("MA104");
        checkbox18.setBounds(300, 170, 80, 50);
		Checkbox checkbox19 = new Checkbox("MA105");
        checkbox19.setBounds(400, 170, 80, 50);
        Checkbox checkbox20 = new Checkbox("MA106");
        checkbox20.setBounds(500, 170, 80, 50);
		Checkbox checkbox21 = new Checkbox("MA107");
        checkbox21.setBounds(600, 170, 80, 50);
        Checkbox checkbox22 = new Checkbox("MA108");
        checkbox22.setBounds(700, 170, 80, 50);
		Checkbox checkbox23 = new Checkbox("MA109");
        checkbox23.setBounds(800, 170, 80, 50);
        Checkbox checkbox24= new Checkbox("MA110");
        checkbox24.setBounds(900, 170, 80, 50);
		Checkbox checkbox25 = new Checkbox("MA111");
        checkbox25.setBounds(1000, 170, 80, 50);
        Checkbox checkbox26 = new Checkbox("MA112");
        checkbox26.setBounds(1100, 170, 80, 50);
		Checkbox checkbox27 = new Checkbox("MA113");
        checkbox27.setBounds(1200, 170, 80, 50);
        Checkbox checkbox28 = new Checkbox("MA115");
        checkbox28.setBounds(1300, 170, 80, 50);
		
		//setAlignment of 3rd  Subject
		label3.setAlignment(Label.CENTER);
        label3.setSize(400, 100);
		label3.setBounds(1,210,50,50);
        
		Checkbox checkbox29 = new Checkbox("MA101");
        checkbox29.setBounds(20, 240, 70, 50);
        Checkbox checkbox31 = new Checkbox("MA102");
        checkbox31.setBounds(100, 240, 80, 50);
		Checkbox checkbox32 = new Checkbox("MA103");
        checkbox32.setBounds(200, 240, 80, 50);
        Checkbox checkbox33 = new Checkbox("MA104");
        checkbox33.setBounds(300, 240, 80, 50);
		Checkbox checkbox34 = new Checkbox("MA105");
        checkbox34.setBounds(400, 240, 80, 50);
        Checkbox checkbox35 = new Checkbox("MA106");
        checkbox35.setBounds(500, 240, 80, 50);
		Checkbox checkbox36 = new Checkbox("MA107");
        checkbox36.setBounds(600, 240, 80, 50);
        Checkbox checkbox37 = new Checkbox("MA108");
        checkbox37.setBounds(700, 240, 80, 50);
		Checkbox checkbox38 = new Checkbox("MA109");
        checkbox38.setBounds(800, 240, 80, 50);
        Checkbox checkbox39= new Checkbox("MA110");
        checkbox39.setBounds(900, 240, 80, 50);
		Checkbox checkbox40 = new Checkbox("MA111");
        checkbox40.setBounds(1000, 240, 80, 50);
        Checkbox checkbox41 = new Checkbox("MA112");
        checkbox41.setBounds(1100, 240, 80, 50);
		Checkbox checkbox42 = new Checkbox("MA113");
        checkbox42.setBounds(1200, 240, 80, 50);
        Checkbox checkbox43 = new Checkbox("MA115");
        checkbox43.setBounds(1300, 240, 80, 50);
		
		//setAlignment of 4th  Subject
		label4.setAlignment(Label.CENTER);
        label4.setSize(400, 100);
		label4.setBounds(1,280,50,50);
        
		Checkbox checkbox44 = new Checkbox("MA101");
        checkbox44.setBounds(20, 310, 70, 50);
        Checkbox checkbox45 = new Checkbox("MA102");
        checkbox45.setBounds(100, 310, 80, 50);
		Checkbox checkbox46 = new Checkbox("MA103");
        checkbox46.setBounds(200, 310, 80, 50);
        Checkbox checkbox47 = new Checkbox("MA104");
        checkbox47.setBounds(300, 310, 80, 50);
		Checkbox checkbox49 = new Checkbox("MA105");
        checkbox49.setBounds(400, 310, 80, 50);
        Checkbox checkbox50 = new Checkbox("MA106");
        checkbox50.setBounds(500, 310, 80, 50);
		Checkbox checkbox51 = new Checkbox("MA107");
        checkbox51.setBounds(600, 310, 80, 50);
        Checkbox checkbox52 = new Checkbox("MA108");
        checkbox52.setBounds(700, 310, 80, 50);
		Checkbox checkbox53 = new Checkbox("MA109");
        checkbox53.setBounds(800, 310, 80, 50);
        Checkbox checkbox55= new Checkbox("MA110");
        checkbox55.setBounds(900, 310, 80, 50);
		Checkbox checkbox56 = new Checkbox("MA111");
        checkbox56.setBounds(1000, 310, 80, 50);
        Checkbox checkbox57 = new Checkbox("MA112");
        checkbox57.setBounds(1100, 310, 80, 50);
		Checkbox checkbox58 = new Checkbox("MA113");
        checkbox58.setBounds(1200, 310, 80, 50);
        Checkbox checkbox59 = new Checkbox("MA115");
        checkbox59.setBounds(1300, 310, 80, 50);
        
		//setAlignment of 5th  Subject
		label5.setAlignment(Label.CENTER);
        label5.setSize(400, 100);
		label5.setBounds(1,350,50,50);
        
		Checkbox checkbox60 = new Checkbox("MA101");
        checkbox60.setBounds(20, 380, 70, 50);
        Checkbox checkbox61 = new Checkbox("MA102");
        checkbox61.setBounds(100, 380, 80, 50);
		Checkbox checkbox62 = new Checkbox("MA103");
        checkbox62.setBounds(200, 380, 80, 50);
        Checkbox checkbox63 = new Checkbox("MA104");
        checkbox63.setBounds(300, 380, 80, 50);
		Checkbox checkbox64 = new Checkbox("MA105");
        checkbox64.setBounds(400, 380, 80, 50);
        Checkbox checkbox65 = new Checkbox("MA106");
        checkbox65.setBounds(500, 380, 80, 50);
		Checkbox checkbox66 = new Checkbox("MA107");
        checkbox66.setBounds(600, 380, 80, 50);
        Checkbox checkbox67 = new Checkbox("MA108");
        checkbox67.setBounds(700, 380, 80, 50);
		Checkbox checkbox68 = new Checkbox("MA109");
        checkbox68.setBounds(800, 380, 80, 50);
        Checkbox checkbox69 = new Checkbox("MA110");
        checkbox69.setBounds(900, 380, 80, 50);
		Checkbox checkbox70 = new Checkbox("MA111");
        checkbox70.setBounds(1000, 380, 80, 50);
        Checkbox checkbox71 = new Checkbox("MA112");
        checkbox71.setBounds(1100, 380, 80, 50);
		Checkbox checkbox72 = new Checkbox("MA113");
        checkbox72.setBounds(1200, 380, 80, 50);
        Checkbox checkbox73 = new Checkbox("MA115");
        checkbox73.setBounds(1300, 380, 80, 50);
		
		//setAlignment of 6th  Subject
		label6.setAlignment(Label.CENTER);
        label6.setSize(400, 100);
		label6.setBounds(1,420,50,50);
        
		Checkbox checkbox74 = new Checkbox("MA101");
        checkbox74.setBounds(20, 450, 70, 50);
        Checkbox checkbox75 = new Checkbox("MA102");
        checkbox75.setBounds(100, 450, 80, 50);
		Checkbox checkbox76 = new Checkbox("MA103");
        checkbox76.setBounds(200, 450, 80, 50);
        Checkbox checkbox77 = new Checkbox("MA104");
        checkbox77.setBounds(300, 450, 80, 50);
		Checkbox checkbox78 = new Checkbox("MA105");
        checkbox78.setBounds(400, 450, 80, 50);
        Checkbox checkbox79 = new Checkbox("MA106");
        checkbox79.setBounds(500, 450, 80, 50);
		Checkbox checkbox80 = new Checkbox("MA107");
        checkbox80.setBounds(600, 450, 80, 50);
        Checkbox checkbox81 = new Checkbox("MA108");
        checkbox81.setBounds(700, 450, 80, 50);
		Checkbox checkbox82 = new Checkbox("MA109");
        checkbox82.setBounds(800, 450, 80, 50);
        Checkbox checkbox83 = new Checkbox("MA110");
        checkbox83.setBounds(900, 450, 80, 50);
		Checkbox checkbox84 = new Checkbox("MA111");
        checkbox84.setBounds(1000, 450, 80, 50);
        Checkbox checkbox85 = new Checkbox("MA112");
        checkbox85.setBounds(1100, 450, 80, 50);
		Checkbox checkbox86 = new Checkbox("MA113");
        checkbox86.setBounds(1200, 450, 80, 50);
        Checkbox checkbox87 = new Checkbox("MA115");
        checkbox87.setBounds(1300, 450, 80, 50);
        
		// adding the checkbox to frame
        f.add(checkbox1);
        f.add(checkbox2);
		f.add(checkbox3);
        f.add(checkbox4);
		f.add(checkbox5);
        f.add(checkbox6);
		f.add(checkbox7);
        f.add(checkbox8);
		f.add(checkbox9);
        f.add(checkbox10);
		f.add(checkbox11);
        f.add(checkbox12);
		f.add(checkbox13);
        f.add(checkbox14);
		f.add(checkbox15);
        f.add(checkbox16);
		f.add(checkbox17);
        f.add(checkbox18);
		f.add(checkbox19);
        f.add(checkbox20);
		f.add(checkbox21);
        f.add(checkbox22);
		f.add(checkbox23);
        f.add(checkbox24);
		f.add(checkbox25);
        f.add(checkbox26);
		f.add(checkbox27);
        f.add(checkbox28);
		f.add(checkbox29);
		f.add(checkbox31);
        f.add(checkbox32);
		f.add(checkbox33);
        f.add(checkbox34);
		f.add(checkbox35);
        f.add(checkbox36);
		f.add(checkbox37);
        f.add(checkbox38);
		f.add(checkbox39);
        f.add(checkbox40);
		f.add(checkbox41);
        f.add(checkbox42);
		f.add(checkbox43);
		f.add(checkbox44);
        f.add(checkbox45);
		f.add(checkbox46);
        f.add(checkbox47);
        f.add(checkbox49);
		f.add(checkbox50);
        f.add(checkbox51);
		f.add(checkbox52);
        f.add(checkbox53);
        f.add(checkbox55);
		f.add(checkbox56);
        f.add(checkbox57);
		f.add(checkbox58);
        f.add(checkbox59);
		f.add(checkbox60);
        f.add(checkbox61);
        f.add(checkbox62);
		f.add(checkbox63);
        f.add(checkbox64);
		f.add(checkbox65);
        f.add(checkbox66);
        f.add(checkbox67);
		f.add(checkbox68);
        f.add(checkbox69);
		f.add(checkbox70);
        f.add(checkbox71);
		f.add(checkbox72);
        f.add(checkbox73);
		f.add(checkbox74);
        f.add(checkbox75);
        f.add(checkbox76);
		f.add(checkbox77);
        f.add(checkbox78);
		f.add(checkbox79);
        f.add(checkbox80);
        f.add(checkbox81);
		f.add(checkbox82);
        f.add(checkbox83);
		f.add(checkbox84);
        f.add(checkbox85);
		f.add(checkbox86);
        f.add(checkbox87);
        f.add(label);
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(label4);
		f.add(label5);
		f.add(label6);
		
        // adding event to the checkboxes
        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Object s[] = checkbox1.isSelected();
                System.out.println("Checkbox Text:" + s[0]); 
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: "
                        + (e.getStateChange() == 1 ? "1" : "0"));
            }
        });
        // setting size, layout and visibility of frame
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    // main method
    public static void main(String args[]) {
        new CheckboxExample2();
    }
}