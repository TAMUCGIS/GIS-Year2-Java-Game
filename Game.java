package net.hollowbit.spacegame;

import com.badlogic.gfx.ApplicationAdapter;

public class Game extends ApplicationAdapter;
	
	SpriteBatch batch;
	Texture img;
	float x;
	float y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}
	
	@Override
	public void render (){
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if (Gdx.input.isKeyPressed(Keys.UP){
			y = y + 4;
		}
		
		if (Gdx.input.isKeyPressed.DOWN){
			y = y - 4;
		}
		
		if 
		
	}
	
