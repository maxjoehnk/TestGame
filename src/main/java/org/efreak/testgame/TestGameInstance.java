package org.efreak.testgame;

import org.efreak.games.game.Game;
import org.efreak.games.game.GameInstance;

public class TestGameInstance extends GameInstance {

	public TestGameInstance(Game game, String id) {
		super(game, id);
	}

	@Override
	public boolean start() {
		return true;
	}

	@Override
	public void stop() {

	}

}
