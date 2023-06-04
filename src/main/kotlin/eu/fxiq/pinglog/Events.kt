package eu.fxiq.pinglog

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerListPingEvent

class Events(private val plugin: PingLog) : Listener {
    @EventHandler
    fun onPing(event: ServerListPingEvent) {
        plugin.logger.info("Server ping from address ${event.address.hostAddress}")
    }
}