package jk_5.nailed.plugins.ircplugin

import jk_5.eventbus.EventHandler
import jk_5.nailed.api.event.PlayerChatEvent
import jk_5.nailed.api.plugin.Plugin

class IrcPlugin extends Plugin {

  override def onEnable(){
    this.getServer.getPluginManager.registerListener(this, this)
  }

  override def onDisable(){

  }

  @EventHandler
  def onPlayerChat(event: PlayerChatEvent){
    val message = event.message
    val sender = event.player.getName

    //Irc.sendMessage(message, sender)
  }

  /*

  def onIrcMessage(message: String, sender: String, channel: String){
    val builder = new ComponentBuilder("[" + channel + "] ").color(ChatColor.gray).append("<" + sender + "> ").append(message")
    this.getServer.broadcastMessage(builder.createFlat())
  }

   */
}
