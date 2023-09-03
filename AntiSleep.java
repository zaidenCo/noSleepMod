package com.zaiden.antisleep;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.world.entity.player.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AntiSleep implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("antisleep");

    @Override
    public void onInitialize() {
        LOGGER.info("Sleeping Won't Happen!");
        EntitySleepEvents.ALLOW_SLEEPING.register((player, sleepingPos) -> {
            return Player.BedSleepingProblem.OTHER_PROBLEM;
        });
    }
}
