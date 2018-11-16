package base.enemy;

import base.GameObject;
import base.game.Settings;
import base.physics.BoxCollider;
import base.physics.Physics;
import base.player.Player;
import base.renderer.BoxRenderer;
import base.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class EnemyBullet extends GameObject implements Physics {
    BoxCollider boxCollider;
    public EnemyBullet() {
        super();
        //BufferedImage image = SpriteUtils.loadImage("assets/images/enemies/bullets/blue.png");
        //this.renderer = new SingleImageRenderer(image);
        this.velocity.set(0, 5);
        this.boxCollider = new BoxCollider(this.position, 16, 16);
        this.renderer = new BoxRenderer(this.boxCollider);
    }

    @Override
    public void run() {
        super.run();
        this.destroyIfNeeded();
        this.hitPlayer();
    }

    private void hitPlayer() {
        Player player = GameObject.intersects(Player.class, this.boxCollider);
        if (player != null){
            player.destroy();
            this.destroy();
        }
    }

    private void destroyIfNeeded() {
        if(this.position.y < -20 || this.position.y >= Settings.SCREEN_HEIGHT
                || this.position.x < 0 || this.position.x >= Settings.BACKGROUND_WIDTH) {
            this.destroy();
        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
