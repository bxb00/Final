package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameControls {
    private JButton leftButton;
    private JButton rightButton;
    private JButton upButton;
    private JButton downButton;
    private JButton shopButton;
    private JButton shootButton;
    private JButton abilityButton;

    public GameControls() {
        // Create buttons for movement
        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        upButton = new JButton("Up");
        downButton = new JButton("Down");

        // Create buttons for shop, shooting, and ability
        shopButton = new JButton("Shop");
        shootButton = new JButton("Shoot");
        abilityButton = new JButton("Ability");

        // Add action listeners to buttons
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle left movement
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle right movement
            }
        });

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle up movement
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle down movement
            }
        });

        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the shop
            }
        });

        shootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle shooting
            }
        });

        abilityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Activate ability
            }
        });
    }

    public JPanel getControlsPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.add(new JLabel()); // Empty space
        buttonPanel.add(upButton);
        buttonPanel.add(new JLabel()); // Empty space
        buttonPanel.add(leftButton);
        buttonPanel.add(new JLabel()); // Empty space
        buttonPanel.add(rightButton);
        buttonPanel.add(new JLabel()); // Empty space
        buttonPanel.add(downButton);
        buttonPanel.add(new JLabel()); // Empty space
        buttonPanel.add(shopButton);
        buttonPanel.add(new JLabel()); // Empty space
        buttonPanel.add(shootButton);
        buttonPanel.add(new JLabel()); // Empty space
        buttonPanel.add(abilityButton);
        buttonPanel.add(new JLabel()); // Empty space

        return buttonPanel;
    }
}
