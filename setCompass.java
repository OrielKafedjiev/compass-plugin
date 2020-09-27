package oreha;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static oreha.commands.targeted;
import static oreha.commands.sender1;

public class setCompass implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
             commands.started=true;
            Player player = (Player) sender;
            sender1=player;
            if(args.length>0){
                targeted = Bukkit.getPlayer(args[0]);
                System.out.println(targeted);
                Location target1 = targeted.getLocation();
                player.setCompassTarget(target1);

            }else{
                player.sendMessage("You can't send an empty message");
                player.sendMessage("/send [word]");
            }


        return false;
    }
}