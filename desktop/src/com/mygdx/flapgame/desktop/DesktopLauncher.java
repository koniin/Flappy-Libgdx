package com.mygdx.flapgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.flapgame.Flap;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Flap it!";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new Flap(), config);
	}
}
