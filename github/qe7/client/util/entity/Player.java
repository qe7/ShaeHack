package github.qe7.client.util.entity;

import github.qe7.client.ShaeHack;

public class Player {

    public float getDirection() {
        float rY = ShaeHack.i.getMinecraft().thePlayer.rotationYaw;
        float forward = 1F;

        if (ShaeHack.i.getMinecraft().thePlayer.moveForward < 0) {
            rY += 180F;
        }

        if (ShaeHack.i.getMinecraft().thePlayer.moveForward < 0) {
            forward = -.5F;
        } else if (ShaeHack.i.getMinecraft().thePlayer.moveForward > 0) {
            forward = .5F;
        } else {
            forward = 1F;
        }

        if (ShaeHack.i.getMinecraft().thePlayer.moveStrafing > 0) {
            rY -= 90F * forward;
        }
        if (ShaeHack.i.getMinecraft().thePlayer.moveStrafing < 0) {
            rY += 90F * forward;
        }
        rY *= .017453292F;
        return rY;
    }

    public void setSpeed(double speed) {
        ShaeHack.i.getMinecraft().thePlayer.motionX = (-(Math.sin(getDirection()) * speed));
        ShaeHack.i.getMinecraft().thePlayer.motionZ = (Math.cos(getDirection()) * speed);
    }
}
