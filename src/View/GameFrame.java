package View;

import View.GameControls;
import View.HUD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
    private final int FRAME_WIDTH = 700;
    private final int FRAME_HEIGHT = 700;
    private final int CHARACTER_SIZE = 25;
    private final int TARGET_WIDTH = 200;
    private final int TARGET_HEIGHT = 200;
    private final int ANIMATION_DELAY = 10;
    private int characterX = 0;
    private int characterY = 0;
    private Timer timer;
    private HUD hud;
    private SoundPlayer soundPlayer;
    private final String BACKGROUND_MUSIC_FILE = "background_music.wav"; // Adjust file name as needed

    public GameFrame() {
        setTitle("Game Frame");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        // Minimize all frames
        minimizeAllFrames();

        // Show the game frame
        setVisible(true);

        // Create the main character panel
        JPanel characterPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillOval(characterX, characterY, CHARACTER_SIZE, CHARACTER_SIZE);
            }
        };

        // Add the main character panel to the game frame
        add(characterPanel, BorderLayout.CENTER);

        // Start animation
        startAnimation();

        // Create HUD panel
        hud = new HUD();
        add(hud, BorderLayout.NORTH);

        // Create game controls
        GameControls gameControls = new GameControls();
        JPanel controlsPanel = gameControls.getControlsPanel();

        // Add controls panel to the game frame
        add(controlsPanel, BorderLayout.SOUTH);

        // Create instance of SoundPlayer
        soundPlayer = new SoundPlayer();
        // Play background music
        soundPlayer.playBackgroundMusic(BACKGROUND_MUSIC_FILE);
    }

    // Method to start animation
    private void startAnimation() {
        // Animation logic
    }

    // Method to minimize all frames
    private void minimizeAllFrames() {
        Frame[] frames = Frame.getFrames();
        for (Frame frame : frames) {
            if (frame instanceof JFrame) {
                JFrame jFrame = (JFrame) frame;
                jFrame.setState(JFrame.ICONIFIED);
            }
        }
    }

    // Method to play a sound effect
    private void playSoundEffect(String soundFileName) {
        soundPlayer.playSoundEffect(soundFileName);
    }

    // Method to stop the background music
    private void stopBackgroundMusic() {
        soundPlayer.stopBackgroundMusic();
    }

    // Main method for testing
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame();
            }
        });
    }
}
