package me.mastercuts20.masterlib.proxy.base;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;

public interface IProxyServerBase extends IProxyBase {

    @Override
    default EntityPlayer getClientPlayer() {
        return null;
    }

    @Override
    default World getClientWorld(){
        return null;
    }

    @Override
    default Side getPhysicalside(){
        return Side.SERVER;
    }

    @Override
    default Side getEffectiveSide(){
        return getPhysicalSide();
    }

}
