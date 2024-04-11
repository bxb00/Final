package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create buttons
        JButton startButton = new JButton("Start");
        JButton skillTreeButton = new JButton("Skill Tree");
        JButton tutorialButton = new JButton("Tutorial");
        JButton settingButton = new JButton("Setting");
        JButton exitButton = new JButton("Exit");

        // Add buttons to the menu
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.add(startButton);
        panel.add(skillTreeButton);
        panel.add(tutorialButton);
        panel.add(settingButton);
        panel.add(exitButton);

        // Add action listeners to buttons
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hide the main menu
                setVisible(false);

                // Create and display the game frame
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new GameFrame();
                    }
                });
            }
        });
        skillTreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Skilltree button action
            }
        });
        tutorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Tutorial button action
            }
        });
        settingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Setting button action
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Exit button action
                System.exit(0);
            }
        });

        // Add panel to the frame
        add(panel);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }
}
