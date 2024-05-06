package LessonOne;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {
    private long lastFrameTime;
    private MainCircless controller;

    GameCanvas(MainCircless controller) {
        lastFrameTime = System.nanoTime();
        this.controller = controller;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long currentTime = System.nanoTime();
        float deltaTime  = (currentTime - lastFrameTime) * 0.000000001f;
        controller.onDrawCanvas(this, g, deltaTime);
        try{
        Thread.sleep(17);
        } catch (InterruptedException a) {
            a.printStackTrace();
        }
        repaint();
    }

    public int getLeft() {return 0;}
    public int getRigth() {return getWidth() -1;}
    public int getTop() {return 0;}
    public int getBottom() {return getHeight() -1;}
}
