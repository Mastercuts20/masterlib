package me.mastercuts20.masterlib.proxy.base;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;

public interface IProxyBase {

    // Init Stages //

    default void preInitStart(FMLPreInitializationEvent e) {
    }

    default void preInitEnd(FMLPreInitializationEvent event) {

    }

    default void initStart(FMLInitializationEvent e){

    }

    default void initEnd(FMLInitializationEvent e) {
    }

    default void postInitStart(FMLPostInitializationEvent e){

    }

    default void postInitEnd(FMLPostInitializationEvent e){

    }


    //server events //

    default void onServerAboutToStart(FMLServerAboutToStartEvent e){

    }


    default void OnServerStating(FMLServerStartingEvent e) {

    }

    default void OnServerStarted(FMLServerStartedEvent e) {

    }

    default void OnServerStopping(FMLServerStoppingEvent e) {

    }

    default void OnSerterStopped(FMLServerStoppedEvent e) {

    }

    // methods //

    void initConfiguration(FMLPreInitializationEvent e);

    void registerEventHandlers();

    void registerCapabilities();

    default void registerEventHandler(Object handler){
        MinecraftForge.EVENT_BUS.register(handler);
    }

    // Utility methods //

    Side getPhysicalSide();

    Side getEffectSide();

    default MinecraftServer getMinecraftServer() {
        return FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    EntityPlayer getClientPlayer();

    World getClientWorld();

    World getClientworld();

    World getWorldByDimensionId(int dimension);

    default Entity getEntityById(int dimension, int id) {
        return getEntityById(getWorldByDimensionId(dimension), id);
    }

    default Entity getEntityById(World world, int id){
        return world == null ? null : world.getEntityByID(id);
    }


    Side getEffectiiveSide();
}
