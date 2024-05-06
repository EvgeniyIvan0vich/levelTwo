package LessonOne;

import java.awt.*;

public class Sprite {
    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeigth;

    protected float getLeft() {
        return x - halfWidth;
    }

    protected void setLeft(float left) {
       x = left + halfWidth;
    }

    protected float getRigth() {
        return x + halfWidth;
    }

    protected  void setRigth(float rigth) {
        x = rigth -halfWidth;
    }

    protected float getTop() {
        return y -halfHeigth;
    }

    protected void setTop (float top) {
        y = top + halfHeigth;
    }

    protected float getBottom() {
        return y + halfHeigth;
    }

    protected void setBootom(float bottom) {
        y = bottom - halfHeigth;
    }

    protected float getWidth() {
        return 2f * halfWidth;
    }

    protected float getHeigth() {
        return 2f * halfHeigth;
    }

    void update(GameCanvas canvas, float deltaTime) {}
    void render(GameCanvas canvas, Graphics g) {}
}
