package View;

import javax.swing.*;
import java.awt.*;

public class HUD extends JPanel {
    private JLabel waveLabel;
    private JLabel timeLabel;
    private JLabel xpLabel;
    private JLabel hpLabel;

    public HUD() {
        // Set layout for HUD panel
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(700, 50)); // Adjust size as needed

        // Initialize and add labels for game information
        waveLabel = new JLabel("Wave: ");
        add(waveLabel);

        timeLabel = new JLabel("Elapsed Time: ");
        add(timeLabel);

        xpLabel = new JLabel("XP: ");
        add(xpLabel);

        hpLabel = new JLabel("HP: ");
        add(hpLabel);
    }

    // Method to update HUD with new information
    public void updateHUD(int wave, int time, int xp, int hp) {
        waveLabel.setText("Wave: " + wave);
        timeLabel.setText("Elapsed Time: " + time);
        xpLabel.setText("XP: " + xp);
        hpLabel.setText("HP: " + hp);
    }
}
