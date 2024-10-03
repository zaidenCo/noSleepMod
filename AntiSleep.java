package com.zaiden;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.entity.player.PlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nosleep implements ModInitializer {
	public static final String MOD_ID = "nosleep";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EntitySleepEvents.ALLOW_SLEEPING.register((player, sleepingPos) -> {
			return PlayerEntity.SleepFailureReason.OTHER_PROBLEM;
		});
		LOGGER.info("You Will Be Tired!");
	}
}
