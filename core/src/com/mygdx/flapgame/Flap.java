package com.mygdx.flapgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.FlapHelpers.AssetLoader;
import com.mygdx.screens.SplashScreen;

public class Flap extends Game {

	@Override
	public void create () {
		Gdx.app.log("Flappy game", "created");
        AssetLoader.load();
        setScreen(new SplashScreen(this));
	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
