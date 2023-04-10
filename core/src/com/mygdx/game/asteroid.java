package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class asteroid extends Object {
    private final TextureRegion textureRegion;
    private final Vector2 end;

    private double speed = 10;
    private double length;
    private double cos;
    private double sin;


    asteroid(float cordX, float cordY, float speed, int id, String texture) {
        super(cordX, cordY, speed, id, texture);
        textureRegion = new TextureRegion(getTexture());
        end = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);

        start();
    }
    asteroid() {
        super(0, 0, 0, 0, "asteroid.png");

        this.end = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        speed = 1;

        float beginx = (float) (Math.random() * -10);
        float beginy = (float) (Math.random() * - 10);
        if ((int)(Math.random() * 2) == 1) {
            beginx = (float) (Math.random() * Gdx.graphics.getWidth() + 10);
            beginy = (float) (Math.random() * Gdx.graphics.getHeight() + 10);
        }
/*        float beginx = 100;
        float beginy = 100;*/

        setCordX(beginx);
        setCordY(beginy);
        textureRegion = new TextureRegion(getTexture());

        start();
    }


    private void start()
    {
        length = Math.sqrt((end.x - getCordX())*(end.x - getCordX()) + ((end.y - getCordY())*(end.y - getCordY())));
        cos = (end.x - getCordX()) / length;
        sin = (end.y - getCordY()) / length;
    }

    public void render(Batch batch)
    {
        setCordX(getCordX() + (float)(cos*speed));
        setCordY(getCordY() + (float)(sin*speed));

        batch.draw(textureRegion,
                getCordX(), getCordY(),
                10,10,
                10, 10,
                1, 1,
                0);
    }
}
