package com.mygdx.game;

import com.badlogic.drop.Drop;
import com.badlogic.drop.Drop2;
import com.badlogic.drop.MainMenuScreen;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.OurGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main(String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Drop2");
		config.setWindowedMode(800, 400);
		config.setForegroundFPS(60);
		config.useVsync(true);

		new Lwjgl3Application(new Drop2(), config);
	}
}
