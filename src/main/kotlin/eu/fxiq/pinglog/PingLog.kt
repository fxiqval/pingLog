package eu.fxiq.pinglog

import org.bukkit.plugin.java.JavaPlugin

class PingLog : JavaPlugin() {
    override fun onEnable() {
        logger.info("Pinglog started.")
        server.pluginManager.registerEvents(Events(this), this)
    }

    override fun onDisable() {
        logger.info("Shutting down.")
    }
}
