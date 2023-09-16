import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CheckboxExample2 {
    Checkbox[] checkboxes;
    Label[] labels;

    CheckboxExample2() {
        Frame f = new Frame("CheckBox Example");
        checkboxes = new Checkbox[6 * 14];
        labels = new Label[6];

        String[] subjectNames = {"DMGT", "C++", "PWP", "ICE", "COA", "SS"};
        int yOffset = 70;

        // Existing code...

for (int i = 0; i < 6; i++) {
    final int subjectIndex = i;
    labels[i] = new Label(subjectNames[i]);
    labels[i].setAlignment(Label.CENTER);
    labels[i].setSize(400, 100);
    labels[i].setBounds(1, yOffset, 50, 50);

    for (int j = 0; j < 14; j++) {
        final int checkboxIndex = i * 14 + j;
        checkboxes[checkboxIndex] = new Checkbox("MA" + (101 + j)); // Generate checkbox names dynamically
        checkboxes[checkboxIndex].setBounds(20 + j * 100, yOffset + 30, 70, 50);

        checkboxes[checkboxIndex].addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Object s[] = checkboxes[checkboxIndex].getSelectedObjects();
                System.out.println("Checkbox Text:" + s[0]);
            }
        });
    }

    yOffset += 140;
}

// Existing code...


        for (Checkbox checkbox : checkboxes) {
            f.add(checkbox);
        }

        for (Label label : labels) {
            f.add(label);
        }

        f.setSize(1600, 800);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new CheckboxExample2();
    }
}
