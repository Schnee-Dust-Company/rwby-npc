package com.janishutz.rwbynpc;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.NPC;
import org.bukkit.plugin.java.JavaPlugin;
import net.citizensnpcs.api.CitizensAPI;

public final class Rwby_npc extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        NPC npc = (NPC) CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, "I am GROOOT");
        System.out.println(getServer().getWorlds());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
