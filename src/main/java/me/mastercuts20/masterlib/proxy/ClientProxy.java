package me.mastercuts20.masterlib.proxy;

import me.mastercuts20.masterlib.proxy.base.IProxyBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SuppressWarnings("unused")
@SideOnly(Side.CLIENT)
public abstract class ClientProxy extends CommonProxy implements IProxy, IProxyBase {
    @Override
    public void registerEventHandlers() {
        super.registerEventHandlers();
    }

    @Override
    public void initEnd(FMLInitializationEvent e){
        super.initEnd(e);
    }
}
