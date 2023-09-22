import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
 class Solution{
     private int[] matching;
     private int[] vis;
     protected Map<Integer, Integer> lastMatching;

     public Solution() {
         lastMatching = new HashMap<>();
     }
     public boolean solve(int person, int[][] G) {
         for (int job = 0; job < G[0].length; job++) {
             if (G[person][job] == 1 && vis[job] == 0) {
                 vis[job] = 1;
                 if (matching[job] == -1 || solve(matching[job], G)) {
                     matching[job] = person;
                     lastMatching.put(person, job); // Update the last matching result for this person
                     return true;
                 }
             }
         }
         return false;
     }

     public int maximumMatch(int[][] G) {
         int p = G.length;
         int j = G[0].length;
         int ans = 0;
         matching = new int[j];
         Arrays.fill(matching, -1);

         for (int i = 0; i < p; i++) {
             vis = new int[j];
             if (solve(i, G)) {
                 ans++;
             }
         }
         return ans;
     }
}

public class CheckboxExample2 {
    Checkbox[] checkboxes;
    Label[] labels;
    int[][] G = new int[6][14];
    private Solution solution;

    CheckboxExample2() {
        Frame f = new Frame("CheckBox Example");

        solution = new Solution();

        JButton b = new JButton("Click Here");
        b.setBounds(100, 50, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int x = 0; x < 6; x++) {
                    for (int y = 0; y < 14; y++) {
                        G[x][y] = checkboxes[x * 14 + y].getState() ? 1 : 0;
                    }
                }

                int ans = solution.maximumMatch(G);

                // Update the last result for each left-side member
                for (int i = 0; i < 6; i++) {
                    solution.lastMatching.put(i, solution.lastMatching.getOrDefault(i, -1));
                }

                // Print the last result for each left-side member
                System.out.println("Last Matching Results:");
                int[] keyResult= new int[14];
                int[] valueResult= new int[14];
                for (Map.Entry<Integer, Integer> entry : solution.lastMatching.entrySet()) {
                    System.out.println("Subject " + entry.getKey() + " matches with Class " + entry.getValue());
                }
            }
        });

        checkboxes = new Checkbox[6 * 14];
        labels = new Label[6];

        String[] subjectNames = {"DMGT", "C++", "PWP", "ICE", "COA", "SS"};
        String[] classLocations = {"MA101", "MA102", "MA103", "MA104", "MA105", "MA106", "MA107", "MA108",
                "MA109", "MA110", "MA111", "MA112", "MA113", "MA114"};

        int yOffset = 70;

        for (int i = 0; i < 6; i++) {
            final int subjectIndex = i;
            labels[i] = new Label(subjectNames[i]);
            labels[i].setAlignment(Label.CENTER);
            labels[i].setSize(400, 100);
            labels[i].setBounds(1, yOffset, 50, 50);
            for (int j = 0; j < 14; j++) {
                final int checkboxIndex = i * 14 + j;
                checkboxes[checkboxIndex] = new Checkbox(classLocations[j]);
                checkboxes[checkboxIndex].setBounds(20 + j * 100, yOffset + 30, 70, 50);
            }

            yOffset += 140;
        }

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        for (Checkbox checkbox : checkboxes) {
            f.add(checkbox);
        }

        for (Label label : labels) {
            f.add(label);
        }

        f.add(b);

        f.setSize(1600, 800);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new CheckboxExample2();
    }
}