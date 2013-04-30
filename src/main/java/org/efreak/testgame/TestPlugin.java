package org.efreak.testgame;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {

	private static JavaPlugin instance;
	
	@Override
	public void onLoad() {
		instance = this;
	}
	
	public static JavaPlugin getInstance() {
		return instance;
	}
	
}
