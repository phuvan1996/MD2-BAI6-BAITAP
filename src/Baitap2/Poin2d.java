package Baitap2;
public class Poin2d {
    private float x,y = 0.0f;
    public Poin2d() {
    }

    public Poin2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float [] getXy(){
        float[] getXy = {x,y};
        return getXy;
    }

    @Override
    public String toString() {
        return "Poin2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
