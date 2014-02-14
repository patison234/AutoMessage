package pl.AutoMessage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		Utils.setConsole(getServer().getConsoleSender());
		Utils.log("&bPlugin &4AutoMessage &bzostal wlaczony!");
	}
	
	public void onDisable() {
		Utils.setConsole(getServer().getConsoleSender());
		Utils.log("&bPlugin &4AutoMessage &bzostal wylaczony!");
	}
}
