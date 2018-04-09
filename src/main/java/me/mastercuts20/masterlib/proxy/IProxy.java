package me.mastercuts20.masterlib.proxy;

import me.mastercuts20.masterlib.proxy.base.IProxyBase;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy extends IProxyBase{

    @Override
    default void registerCapabilities(){

    }

    @Override
    default void initConfiguration(FMLPreInitializationEvent e) {

    }

    @Override
    default void registerEventHandlers(){

    }
}
