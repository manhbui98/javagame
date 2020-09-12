package game.java;

import java.awt.*;

public class Enemy extends GameObject {

    private Handler handler;

    public Enemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(x, y , 32, 32);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }
}
