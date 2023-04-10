package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Object {
    private float speed;
    private Texture texture;
    private boolean life;
    private float cordX;
    private float cordY;
    private int id;

    Object(float cordX, float cordY, float speed, int id, String texture){
        this.cordX = cordX;
        this.cordY = cordY;
        this.speed = speed;
        this.texture = new Texture(texture);
        this.id = id;
        life = true;
    }


    public void render(Batch batch){
        batch.draw(getTexture(), getCordX(), getCordY());
    }

    public float getSpeed() {
        return speed;
    }

    public Texture getTexture() {
        return texture;
    }

    public boolean getLife() {
        return life;
    }

    public float getCordX() {
        return cordX;
    }

    public float getCordY() {
        return cordY;
    }

    public int getId() {
        return id;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public void setCordX(float cordX) {
        this.cordX = cordX;
    }

    public void setCordY(float cordY) {
        this.cordY = cordY;
    }

    public void setId(int id) {
        this.id = id;
    }

}
