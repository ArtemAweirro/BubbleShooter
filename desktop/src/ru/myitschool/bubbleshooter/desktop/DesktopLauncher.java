package ru.myitschool.bubbleshooter.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ru.myitschool.bubbleshooter.BubbleShooter;
import ru.myitschool.bubbleshooter.ScreenGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = ScreenGame.SCR_WIDTH;
		config.height = ScreenGame.SCR_HEIGHT;
		config.title = "Bubble Shooter";
		new LwjglApplication(new BubbleShooter(), config);
	}
}
