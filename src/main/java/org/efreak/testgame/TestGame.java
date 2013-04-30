package org.efreak.testgame;

import org.efreak.games.game.Game;
import org.efreak.games.game.GameInstance;

public class TestGame extends Game {

	public TestGame() {
		super("Test Game", "This is a test game to test the Games API", TestPlugin.getInstance());
	}

	@Override
	public void load() {

	}

	@Override
	public GameInstance createInstance(String id) {
		return new TestGameInstance(this, id);
	}

}
