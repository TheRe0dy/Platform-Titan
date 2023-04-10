package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Stack;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Platform pl;
	Object object;
	Stack<Object> list;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		pl = new Platform(50, 50, 0, 1, "Platform.png");
		object = new Object(50, 50, 0, 1, "Platform.png");

		list = new Stack<>();
		list.add(new asteroid());
		list.add(new asteroid());
		list.add(new asteroid());
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(pl.getTexture(), pl.getCordX(), pl.getCordY());

		for (int j = 0; j < list.size(); j++)
			list.get(j).render(batch);


		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		pl.getTexture().dispose();


	}
}
