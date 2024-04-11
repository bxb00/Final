package Controller;

import Model.WaveManager;
import View.GameFrame;

public class GameController {
    private GameFrame gameFrame;
    private WaveManager waveManager;

    public GameController(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
        this.waveManager = new WaveManager();
        // Initialize other components as needed
    }

    // Add methods for controlling the game, handling user input, etc.
}
