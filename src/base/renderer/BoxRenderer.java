package base.renderer;

import base.GameObject;
import base.physics.BoxCollider;

import java.awt.*;

public class BoxRenderer extends Renderer{
    BoxCollider boxCollider;
    public BoxRenderer(BoxCollider boxCollider){
        this.boxCollider = boxCollider;
    }


    @Override
    public void render(Graphics g, GameObject master) {
        g.fillRect((int)boxCollider.masterPosition.x, (int)boxCollider.masterPosition.y,
                boxCollider.width, boxCollider.height);
        g.setColor(Color.GREEN);
    }
}
