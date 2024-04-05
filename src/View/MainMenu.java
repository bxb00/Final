// MainMenu.java
package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Main Menu");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 1));

        JButton startButton = new JButton("Start");
        JButton tutorialButton = new JButton("Tutorial");
        JButton skillTreeButton = new JButton("Skill Tree");
        JButton settingButton = new JButton("Setting");
        JButton exitButton = new JButton("Exit");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Minimize all frames
                Frame[] frames = JFrame.getFrames();
                for (Frame frame : frames) {
                    frame.setExtendedState(JFrame.ICONIFIED);
                }

                // Create and display the game frame
                JFrame gameFrame = new JFrame("Game Frame");
                gameFrame.setSize(700, 700);
                gameFrame.setLocationRelativeTo(null);
                gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel gamePanel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        // Draw the main character (circle)
                        g.setColor(Color.RED);
                        g.fillOval(350, 350, 25, 25);
                    }
                };

                gameFrame.add(gamePanel);
                gameFrame.setVisible(true);

                // Animate the frame size transition
                Timer timer = new Timer(10, new ActionListener() {
                    int width = 700;
                    int height = 700;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (width > 200 && height > 200) {
                            width -= 5;
                            height -= 5;
                            gameFrame.setSize(width, height);
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });
                timer.start();
            }
        });


        tutorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show game tutorial
                JOptionPane.showMessageDialog(MainMenu.this, "راهنمای بازی");
            }
        });

        skillTreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show skill tree
                // You can implement the functionality for displaying the skill tree here
            }
        });

        settingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show game settings
                JOptionPane.showMessageDialog(MainMenu.this, "تنظیمات بازی");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the game
                System.exit(0);
            }
        });

        panel.add(startButton);
        panel.add(tutorialButton);
        panel.add(skillTreeButton);
        panel.add(settingButton);
        panel.add(exitButton);

        add(panel);
        setVisible(true);
    }
}
