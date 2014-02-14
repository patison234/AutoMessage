package pl.AutoMessage;

import me.dragopl.API.DragoAPI;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		DragoAPI.setConsole(getServer().getConsoleSender());
		DragoAPI.log("&bPlugin &4AutoMessage &bzostal wlaczony!");
	}
	
	public void onDisable() {
		DragoAPI.setConsole(getServer().getConsoleSender());
		DragoAPI.log("&bPlugin &4AutoMessage &bzostal wylaczony!");
	}
}
