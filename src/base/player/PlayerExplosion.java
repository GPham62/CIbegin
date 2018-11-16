package base.player;

import base.GameObject;
import base.renderer.AnimationRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PlayerExplosion extends GameObject {
    public PlayerExplosion(){
        super();
        this.createAnimation();
    }

    private void createAnimation() {
        ArrayList<BufferedImage> images = SpriteUtils.loadImages(
             "E:\\Code Intensive\\session5\\" +
                     "ci-begin-master\\assets\\images\\players\\explosions\\0.png",
                "E:\\Code Intensive\\session5\\ci-begin-master\\assets\\images\\players\\explosions\\1.png",
                "E:\\Code Intensive\\session5\\ci-begin-master\\assets\\images\\players\\explosions\\2.png",
                "E:\\Code Intensive\\session5\\ci-begin-master\\assets\\images\\players\\explosions\\3.png",
                "E:\\Code Intensive\\session5\\ci-begin-master\\assets\\images\\players\\explosions\\4.png",
                "E:\\Code Intensive\\session5\\ci-begin-master\\assets\\images\\players\\explosions\\5.png",
                "E:\\Code Intensive\\session5\\ci-begin-master\\assets\\images\\players\\explosions\\6.png",
                "E:\\Code Intensive\\session5\\ci-begin-master\\assets\\images\\players\\explosions\\7.png"
        );
        this.renderer = new AnimationRenderer(images, 5, true);
    }
}
