import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MenuSwing extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu m1, m2, m3;
    JMenuItem mi1, mi2, mi3, mi4, mi5;
    JTextArea ta;

    JDialog d1;
    JButton b1;
    JFileChooser fcOpen, fcSave;

    MenuSwing() {
        // Frame setup
        setTitle("Swing Menu Example");
        setSize(500, 500);
			
        setLayout(new BorderLayout());

        // TextArea
        ta = new JTextArea("write here", 10, 10);
        add(new JScrollPane(ta), BorderLayout.CENTER);

        // MenuBar and Menus
        mb = new JMenuBar();
        setJMenuBar(mb);

        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("Search");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        // MenuItems
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Cut");
        mi5 = new JMenuItem("Paste");

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);

        m2.add(mi4);
        m2.add(mi5);

        // Dialog
        d1 = new JDialog(this, "New Dialog", true);
        d1.setSize(300, 150);
        d1.setLayout(new FlowLayout(FlowLayout.LEFT));

        b1 = new JButton("Close");
        b1.addActionListener(this);
        d1.add(b1);

        // FileChoosers
        fcOpen = new JFileChooser();
        fcSave = new JFileChooser();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        Object src = ae.getSource();

        if (src == mi1) {
            d1.setLocationRelativeTo(this);
            d1.setVisible(true);
        }

        if (src == b1) {
            d1.dispose();
        }

        if (src == mi2) {
            int result = fcOpen.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fcOpen.getSelectedFile();
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    ta.read(br, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error reading file");
                }
            }
        }

        if (src == mi3) {
            int result = fcSave.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fcSave.getSelectedFile();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    ta.write(bw);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file");
                }
            }
        }

        if (src == mi4) {
            ta.cut();
        }

        if (src == mi5) {
            ta.paste();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuSwing::new);
    }
}