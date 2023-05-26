package UnderDevelopment;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

public class homepage extends JFrame implements ActionListener {
    JButton sup;
    JPanel npanel;

    public homepage() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("HomePage");
        setSize(500, 500);
        setLayout(null); // Set the layout of the JFrame to null

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(0, 0, 500, 500); // Set the bounds for the panel
        panel.setLayout(null); // Set the layout of the panel to null

        JLabel label = new JLabel("Welcome!");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(190, 20, 120, 15);
        panel.add(label);

        sup = new JButton("Menu");
        sup.addActionListener(this);
        sup.setBounds(220, 70, 120, 50);
        panel.add(sup);

        getContentPane().add(panel); // Add the panel to the content pane

        setVisible(true); // Move setVisible call to this position
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == sup) {
            if (npanel == null || !npanel.isVisible()) {
                showMenu();
            }
        } else if (npanel != null && ae.getSource() == npanel.getComponent(2)) {
            hideMenu();
        }
    }

    private void showMenu() {
        if (npanel == null) {
            npanel = new JPanel();
            npanel.setLayout(null);
            npanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            npanel.setBounds(140, 130, 220, 120); // Set the bounds for the npanel

            JButton beverages = new JButton("Beverages");
            beverages.addActionListener(this);
            beverages.setBounds(10, 10, 100, 25);
            npanel.add(beverages);

            JButton food = new JButton("Food");
            food.addActionListener(this);
            food.setBounds(10, 45, 100, 25);
            npanel.add(food);

            JButton close = new JButton("Close Menu");
            close.addActionListener(this);
            close.setBounds(10, 80, 100, 25);
            npanel.add(close);

            getContentPane().add(npanel); // Add npanel to the content pane
        }

        npanel.setVisible(true);
        revalidate();
        repaint();
    }

    private void hideMenu() {
        npanel.setVisible(false);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new homepage();
        });
    }
}
