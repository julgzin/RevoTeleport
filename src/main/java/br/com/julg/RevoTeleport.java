package br.com.julg;

import br.com.julg.Listeners.TeleportListeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RevoTeleport extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + getClass().getSimpleName() + ChatColor.DARK_PURPLE + " foi iniciado com sucesso");


        this.getServer().getPluginManager().registerEvents(new TeleportListeners(), this);

    }

    @Override
    public void onDisable () {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + getClass().getSimpleName() + ChatColor.DARK_PURPLE + " foi desligado com sucesso");
    }

}