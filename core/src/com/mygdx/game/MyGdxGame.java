package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Platform pl;
	Object object;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Platform pl = new Platform(50, 50, 0, 1, "Platform.png");
		Object object = new Object(50, 50, 0, 1, "Platform.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		//batch.draw(pl.getTexture(), pl.getCordX(), pl.getCordY()); //вылетает
		//System.out.println(object.getCordX()); //вылетает
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		pl.getTexture().dispose();


	}
}
