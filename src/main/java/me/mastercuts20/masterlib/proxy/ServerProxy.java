package me.mastercuts20.masterlib.proxy;

import me.mastercuts20.masterlib.proxy.base.IProxyBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SuppressWarnings("unused")
@SideOnly(Side.SERVER)
public abstract class ServerProxy extends CommonProxy implements IProxy, IProxyBase {
}
