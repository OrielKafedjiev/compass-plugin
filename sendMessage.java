package oreha;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sendMessage implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player) sender;
            System.out.println(player);

            if(args.length>0){
                player.sendMessage(args[0]);

            }else{
                player.sendMessage("You can't send an empty message");
                player.sendMessage("/send [word]");
            }
        }else{
            System.out.println("only players can send");
        }

        return false;
    }
}