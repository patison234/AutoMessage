package pl.AutoMessage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new AutoMessageScheduler(this), this);
		getCommand("automessage").setExecutor(new AutoMessageCmd(this));
		Utils.setConsole(getServer().getConsoleSender());
		Utils.log("&bPlugin &4AutoMessage &bzostal wlaczony!");
	}
	
	public void onDisable() {
		Utils.setConsole(getServer().getConsoleSender());
		Utils.log("&bPlugin &4AutoMessage &bzostal wylaczony!");
	}
}
