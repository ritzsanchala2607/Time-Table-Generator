
import javax.swing.*;
import java.awt.*;
import java.util.*;


class A {
    public int Totalsub;
    public int Totalsub3;
    public int hfs;
    public int hfs3;
    public ArrayList<Integer> hourofsuject = new ArrayList<Integer>();
    public ArrayList<Integer> hourofsuject3 = new ArrayList<Integer>();
    public ArrayList<String> SUBJECT = new ArrayList<String>();
    public ArrayList<String> SUBJECT3 = new ArrayList<String>();
    public String[][] Sem1 = new String[5][6];
    public String subject;
    public String faculty;
    public String subject3;
    public String faculty3;
    public Map<String, String> Sf = new HashMap<>();
    public Map<String, String> Sf2 = new HashMap<>();

    private JTextArea outputArea;

    A() {
        JFrame frame = new JFrame("Subject and Faculty Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        outputArea = new JTextArea();
        outputArea.setSize(1600,800);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        Totalsub = -1; // Initialize to a negative value to enter the loop
        while (Totalsub < 0) {
            String input = JOptionPane.showInputDialog(frame, "Enter number of Subjects For Sem-1:");
            try {
                Totalsub = Integer.parseInt(input);
                if (Totalsub < 0) {
                    JOptionPane.showMessageDialog(frame, "Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number.");
                Totalsub = -1; // Set to negative value to re-enter the loop
            }
        }

        for (int t = 0; t < Totalsub; t++) {
            subject = JOptionPane.showInputDialog(frame, "Enter subject name:");
            faculty = JOptionPane.showInputDialog(frame, "Enter  Faculty Name of:"+subject);
            hfs = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Subject Hour per week:"));

            Sf.put(subject, faculty);
            hourofsuject.add(hfs);
            ISF(subject, faculty, hfs);
        }


        Totalsub3 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter number of Subjects For Sem 3:"));

        for (int t = 0; t < Totalsub3; t++) {
            subject3 = JOptionPane.showInputDialog(frame, "Enter subject name:");
            faculty3 = JOptionPane.showInputDialog(frame, "Enter  Faculty Name of:"+subject3);
            hfs3 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Subject Hour per week:"));

            Sf2.put(subject3, faculty3);
            hourofsuject3.add(hfs3);
            ISF3(subject3, faculty3, hfs3);
        }



        frame.dispose(); // Close the input dialog
        frame.pack();
        frame.setVisible(true);

        TimeTable();
        TimeTable3();
    }
    void ISF(String sub, String fac, int hour) {
        String Subject_name = sub;
        String Faculty = fac;
        int TotalSubHour = hour;

        for (int a = 1; a <= TotalSubHour; a++) {
            SUBJECT.add(Subject_name);
        }
    }

    void ISF3(String sub3, String fac3, int hour3) {
        String Subject_name3 = sub3;
        String Faculty3 = fac3;
        int TotalSubHour3 = hour3;

        for (int a = 1; a <= TotalSubHour3; a++) {
            SUBJECT3.add(Subject_name3);
        }
    }

    void TimeTable() {
        Random rand = new Random();

        StringBuilder table = new StringBuilder();
        table.append("Day  \tPeriod 1\t\tPeriod 2\t\tPeriod 3\t\tPeriod 4\t\tPeriod 5\t\tPeriod 6\n");
        table.append("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

        String[] days = {"Monday    ", "Tuesday   ", "Wednesday ", "Thursday  ", "Friday    "};
        String[] periods = {"10:45 - 11:35", "11:35 - 12:35", "1:20 - 2:20", "2:20 - 3:25", "3:35 - 4:25", "4:25 - 5:25"};

        for (int i = 0; i < days.length; i++) {
            table.append(days[i]).append("\t");
            for (int j = 0; j < periods.length; j++) {
                if (SUBJECT.isEmpty()) {
                    table.append("Free\t\t");
                } else {
                    int subjectIndex = rand.nextInt(SUBJECT.size());
                    Sem1[i][j] = SUBJECT.get(subjectIndex);
                    table.append(SUBJECT.get(subjectIndex)).append(" \t\t");
                    SUBJECT.remove(subjectIndex);
                }
            }
            table.append("\n");
        }
        outputArea.append("Sem 1 Timetable:\n");
        outputArea.append(table.toString() + "\n");

    }

    void TimeTable3 () {
        Random rand = new Random();

        StringBuilder table3 = new StringBuilder();
        table3.append("Day  \tPeriod 1\t\tPeriod 2\t\tPeriod 3\t\tPeriod 4\t\tPeriod 5\t\tPeriod 6\n");
        table3.append("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

        String[] days = {"Monday    ", "Tuesday   ", "Wednesday ", "Thursday  ", "Friday    "};
        String[] periods = {"10:45 - 11:35", "11:35 - 12:35", "1:20 - 2:20", "2:20 - 3:25", "3:35 - 4:25", "4:25 - 5:25"};

        for (int i = 0; i < days.length; i++) {
            table3.append(days[i]).append("\t");
            for (int j = 0; j < periods.length; j++) {
                if (SUBJECT3.isEmpty()) {
                    table3.append("Free\t\t");
                } else {
                    int subjectIndex = rand.nextInt(SUBJECT3.size());
                    String newSub = SUBJECT3.get(subjectIndex);
                    String newSubKey = Sf2.get(newSub);

                    boolean overlap = false;

                    for (int k = 0; k < Sem1.length; k++) {
                        if (Sem1[k][j] != null && Sf.get(Sem1[k][j]).equals(newSubKey)) {
                            overlap = true;
                            break;
                        }
                    }

                    if (!overlap) {
                        table3.append(newSub).append(" \t\t");
                        SUBJECT3.remove(subjectIndex);
                    } else {
                        int newsubjectIndex = rand.nextInt(SUBJECT3.size());
                        String UpdatednewSub = SUBJECT3.get(newsubjectIndex);
                        table3.append(UpdatednewSub).append(" \t\t");
                        SUBJECT3.remove(newsubjectIndex);
                    }
                }
            }
            table3.append("\n");
        }
        outputArea.append("Sem 3 Timetable:\n");
        outputArea.append(table3.toString() + "\n");
    }
}

class SubjectFacultyMap{
    public static void main(String[] args){
        new A();
    }
}

