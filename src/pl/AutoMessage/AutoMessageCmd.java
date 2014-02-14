package pl.AutoMessage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoMessageCmd extends JavaPlugin implements CommandExecutor {
	
	Main plugin;
	
	public AutoMessageCmd(Main plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("automessage")) {
			if (args.length == 0) {
				Utils.sendMsg("&6==========================================\n &6> &7Autorzy: &6PatisonPlayGames &7& &6DragoPL\n &6> &7Wersja: &6v1.0\n&6==========================================\n &6> &7/automessage -r &6&l| &7przeladowuje konfiguracje\n&6==========================================", sender);
			}
		}
		return false;
	}
}
