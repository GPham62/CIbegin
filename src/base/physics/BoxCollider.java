package base.physics;

import base.Vector2D;

public class BoxCollider {
    public Vector2D masterPosition; //master == gameObject main
    public int width;
    public int height;

    public BoxCollider(Vector2D masterPosition, int width, int height){
        this.masterPosition = masterPosition;
        this.width = width;
        this.height = height;
    }

    public int top(){
        return (int)this.masterPosition.y;
    }

    public int bottom(){
        return (this.top() + this.height);
    }

    public int left(){
        return (int) this.masterPosition.x;
    }

    public int right(){
        return this.left() + this.width;
    }

    public boolean intersects(BoxCollider other) {
        boolean intersectX = (other.top() >= this.top() && other.top() <= this.bottom())
                || (other.bottom() >= this.top() && other.bottom() <= this.bottom());
        boolean intersectY = (other.left() >= this.left() && other.left() <= this.right())
                || (other.right() >= this.left() && other.right() <= this.right());
        return intersectX && intersectY;
    }


}
