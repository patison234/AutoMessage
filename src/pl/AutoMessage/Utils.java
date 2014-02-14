package pl.AutoMessage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Utils {
	private static ConsoleCommandSender console;

	public static void setConsole(ConsoleCommandSender console) {
		Utils.console = console;
	}

	public static void log(String string) {
		Utils.sendMsg(string, console);
	}

	public static void sendToAll(String string) {
		for (Player p : Bukkit.getOnlinePlayers()) {
			Utils.sendMsg(string, p);
		}
	}

	public static void warn(String string) {
		Utils.sendMsg(string, console);
	}

	public static boolean sendMsg(String message, CommandSender sender) {
		try {
			sender.sendMessage(fixMsg(message));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String fixMsg(String msg) {
		return ChatColor.translateAlternateColorCodes('&',
				msg.replace("\\n", "\n"));
	}
}
