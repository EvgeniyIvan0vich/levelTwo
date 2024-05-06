package LessonOne;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite{
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;

    Ball() {
        halfHeigth = 20 +(float) (Math.random() * 50f);
        halfWidth = halfHeigth;
        color = new Color(rnd.nextInt());
        vX = 50f + (float) (Math.random() * 100f);
        vY = 50f + (float) (Math.random() * 100f);
    }

    void update(GameCanvas canvas, float deltaTime) {
        x += vX * deltaTime;
        y += vY * deltaTime;

        if (getLeft() < canvas.getLeft()) {
            setRigth(canvas.getLeft());
            vX = -vX;
        }
        if (getRigth() > canvas.getRigth()) {
            setRigth(canvas.getRigth());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBootom(canvas.getBottom());
            vY =- vY;
        }
    }

    @Override
    void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(), (int) getTop(), (int) getWidth(), (int) getHeigth());
    }
}
