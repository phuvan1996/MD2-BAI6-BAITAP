package Baitap2;

import java.util.Arrays;

public class Poin3d extends Poin2d {
    private float z = 0.0f;

    public Poin3d() {
    }

    public Poin3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
   public float [] getXYZ(){
        float[] getXYZ = {getX(),getY(),getZ()};
        return getXYZ;
   }

    @Override
    public String toString() {
        return "Poin3d{" +
                "x= " + getX() + ", y= " +getY()+ ", z= " +getZ()+
                '}';
    }
}