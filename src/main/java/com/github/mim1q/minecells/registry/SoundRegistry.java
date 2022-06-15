package com.github.mim1q.minecells.registry;

import com.github.mim1q.minecells.MineCells;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public final class SoundRegistry {

    // Leaping Zombie
    public static final Identifier LEAPING_ZOMBIE_CHARGE_ID = new Identifier(MineCells.MOD_ID, "leaping_zombie.leap_charge");
    public static final SoundEvent LEAPING_ZOMBIE_CHARGE = new SoundEvent(LEAPING_ZOMBIE_CHARGE_ID);

    public static final Identifier LEAPING_ZOMBIE_RELEASE_ID = new Identifier(MineCells.MOD_ID, "leaping_zombie.leap_release");
    public static final SoundEvent LEAPING_ZOMBIE_RELEASE = new SoundEvent(LEAPING_ZOMBIE_RELEASE_ID);

    public static final Identifier LEAPING_ZOMBIE_DEATH_ID = new Identifier(MineCells.MOD_ID, "leaping_zombie.death");
    public static final SoundEvent LEAPING_ZOMBIE_DEATH = new SoundEvent(LEAPING_ZOMBIE_DEATH_ID);

    // Shocker
    public static final Identifier SHOCKER_DEATH_ID = new Identifier(MineCells.MOD_ID, "shocker.death");
    public static final SoundEvent SHOCKER_DEATH = new SoundEvent(SHOCKER_DEATH_ID);

    public static final Identifier SHOCKER_CHARGE_ID = new Identifier(MineCells.MOD_ID, "shocker.charge");
    public static final SoundEvent SHOCKER_CHARGE = new SoundEvent(SHOCKER_CHARGE_ID);

    public static final Identifier SHOCKER_RELEASE_ID = new Identifier(MineCells.MOD_ID, "shocker.release");
    public static final SoundEvent SHOCKER_RELEASE = new SoundEvent(SHOCKER_RELEASE_ID);
    
    // Grenadier
    public static final Identifier GRENADIER_CHARGE_ID = new Identifier(MineCells.MOD_ID, "grenadier.charge");
    public static final SoundEvent GRENADIER_CHARGE = new SoundEvent(GRENADIER_CHARGE_ID);

    // Disgusting Worm
    public static final Identifier DISGUSTING_WORM_ATTACK_ID = new Identifier(MineCells.MOD_ID, "disgusting_worm.attack");
    public static final SoundEvent DISGUSTING_WORM_ATTACK = new SoundEvent(DISGUSTING_WORM_ATTACK_ID);

    public static final Identifier DISGUSTING_WORM_DEATH_ID = new Identifier(MineCells.MOD_ID, "disgusting_worm.death");
    public static final SoundEvent DISGUSTING_WORM_DEATH = new SoundEvent(DISGUSTING_WORM_DEATH_ID);

    // Inquisitor
    public static final Identifier INQUISITOR_CHARGE_ID = new Identifier(MineCells.MOD_ID, "inquisitor.charge");
    public static final SoundEvent INQUISITOR_CHARGE = new SoundEvent(INQUISITOR_CHARGE_ID);

    public static final Identifier INQUISITOR_RELEASE_ID = new Identifier(MineCells.MOD_ID, "inquisitor.release");
    public static final SoundEvent INQUISITOR_RELEASE = new SoundEvent(INQUISITOR_RELEASE_ID);

    // Kamikaze
    public static final Identifier KAMIKAZE_WAKE_ID = new Identifier(MineCells.MOD_ID, "kamikaze.wake");
    public static final SoundEvent KAMIKAZE_WAKE = new SoundEvent(KAMIKAZE_WAKE_ID);

    public static final Identifier KAMIKAZE_CHARGE_ID = new Identifier(MineCells.MOD_ID, "kamikaze.charge");
    public static final SoundEvent KAMIKAZE_CHARGE = new SoundEvent(KAMIKAZE_CHARGE_ID);

    public static final Identifier KAMIKAZE_DEATH_ID = new Identifier(MineCells.MOD_ID, "kamikaze.death");
    public static final SoundEvent KAMIKAZE_DEATH = new SoundEvent(KAMIKAZE_DEATH_ID);

    // Shieldbearer
    public static final Identifier SHIELDBEARER_CHARGE_ID = new Identifier(MineCells.MOD_ID, "shieldbearer.charge");
    public static final SoundEvent SHIELDBEARER_CHARGE = new SoundEvent(SHIELDBEARER_CHARGE_ID);

    public static final Identifier SHIELDBEARER_RELEASE_ID = new Identifier(MineCells.MOD_ID, "shieldbearer.release");
    public static final SoundEvent SHIELDBEARER_RELEASE = new SoundEvent(SHIELDBEARER_RELEASE_ID);

    // Mutated Bat

    public static final Identifier MUTATED_BAT_CHARGE_ID = new Identifier(MineCells.MOD_ID, "mutated_bat.charge");
    public static final SoundEvent MUTATED_BAT_CHARGE = new SoundEvent(MUTATED_BAT_CHARGE_ID);

    public static final Identifier MUTATED_BAT_RELEASE_ID = new Identifier(MineCells.MOD_ID, "mutated_bat.release");
    public static final SoundEvent MUTATED_BAT_RELEASE = new SoundEvent(MUTATED_BAT_RELEASE_ID);

    public static final Identifier MUTATED_BAT_WAKE_ID = new Identifier(MineCells.MOD_ID, "mutated_bat.wake");
    public static final SoundEvent MUTATED_BAT_WAKE = new SoundEvent(MUTATED_BAT_WAKE_ID);

    // Weapons
    public static final Identifier BOW_CHARGE_ID = new Identifier(MineCells.MOD_ID, "weapon.bow.charge");
    public static final SoundEvent BOW_CHARGE = new SoundEvent(BOW_CHARGE_ID);

    public static final Identifier BOW_RELEASE_ID = new Identifier(MineCells.MOD_ID, "weapon.bow.release");
    public static final SoundEvent BOW_RELEASE = new SoundEvent(BOW_RELEASE_ID);

    // Other
    public static final Identifier CRIT_ID = new Identifier(MineCells.MOD_ID, "crit");
    public static final SoundEvent CRIT = new SoundEvent(CRIT_ID);

    public static final Identifier SHOCK_ID = new Identifier(MineCells.MOD_ID, "shock");
    public static final SoundEvent SHOCK = new SoundEvent(SHOCK_ID);

    public static final Identifier EXPLOSION_ID = new Identifier(MineCells.MOD_ID, "explosion");
    public static final SoundEvent EXPLOSION = new SoundEvent(EXPLOSION_ID);

    public static final Identifier ELEVATOR_START_ID = new Identifier(MineCells.MOD_ID, "elevator_start");
    public static final SoundEvent ELEVATOR_START = new SoundEvent(ELEVATOR_START_ID);

    public static final Identifier ELEVATOR_STOP_ID = new Identifier(MineCells.MOD_ID, "elevator_stop");
    public static final SoundEvent ELEVATOR_STOP = new SoundEvent(ELEVATOR_STOP_ID);

    public static final Identifier BUZZ_ID = new Identifier(MineCells.MOD_ID, "buzz");
    public static final SoundEvent BUZZ = new SoundEvent(BUZZ_ID);

    public static void register() {

        // Leaping Zombie
        Registry.register(Registry.SOUND_EVENT, LEAPING_ZOMBIE_CHARGE_ID, LEAPING_ZOMBIE_CHARGE);
        Registry.register(Registry.SOUND_EVENT, LEAPING_ZOMBIE_RELEASE_ID, LEAPING_ZOMBIE_RELEASE);
        Registry.register(Registry.SOUND_EVENT, LEAPING_ZOMBIE_DEATH_ID, LEAPING_ZOMBIE_DEATH);

        // Shocker
        Registry.register(Registry.SOUND_EVENT, SHOCKER_CHARGE_ID, SHOCKER_CHARGE);
        Registry.register(Registry.SOUND_EVENT, SHOCKER_RELEASE_ID, SHOCKER_RELEASE);
        Registry.register(Registry.SOUND_EVENT, SHOCKER_DEATH_ID, SHOCKER_DEATH);

        // Grenadier
        Registry.register(Registry.SOUND_EVENT, GRENADIER_CHARGE_ID, GRENADIER_CHARGE);

        // Disgusting Worm
        Registry.register(Registry.SOUND_EVENT, DISGUSTING_WORM_ATTACK_ID, DISGUSTING_WORM_ATTACK);
        Registry.register(Registry.SOUND_EVENT, DISGUSTING_WORM_DEATH_ID, DISGUSTING_WORM_DEATH);

        // Inquisitor
        Registry.register(Registry.SOUND_EVENT, INQUISITOR_CHARGE_ID, INQUISITOR_CHARGE);
        Registry.register(Registry.SOUND_EVENT, INQUISITOR_RELEASE_ID, INQUISITOR_RELEASE);

        // Kamikaze
        Registry.register(Registry.SOUND_EVENT, KAMIKAZE_WAKE_ID, KAMIKAZE_WAKE);
        Registry.register(Registry.SOUND_EVENT, KAMIKAZE_CHARGE_ID, KAMIKAZE_CHARGE);
        Registry.register(Registry.SOUND_EVENT, KAMIKAZE_DEATH_ID, KAMIKAZE_DEATH);

        // Shieldbearer
        Registry.register(Registry.SOUND_EVENT, SHIELDBEARER_CHARGE_ID, SHIELDBEARER_CHARGE);
        Registry.register(Registry.SOUND_EVENT, SHIELDBEARER_RELEASE_ID, SHIELDBEARER_RELEASE);

        // Mutated Bat
        Registry.register(Registry.SOUND_EVENT, MUTATED_BAT_CHARGE_ID, MUTATED_BAT_CHARGE);
        Registry.register(Registry.SOUND_EVENT, MUTATED_BAT_RELEASE_ID, MUTATED_BAT_RELEASE);

        // Weapons
        Registry.register(Registry.SOUND_EVENT, BOW_CHARGE_ID, BOW_CHARGE);
        Registry.register(Registry.SOUND_EVENT, BOW_RELEASE_ID, BOW_RELEASE);

        // Other
        Registry.register(Registry.SOUND_EVENT, CRIT_ID, CRIT);
        Registry.register(Registry.SOUND_EVENT, SHOCK_ID, SHOCK);
        Registry.register(Registry.SOUND_EVENT, EXPLOSION_ID, EXPLOSION);
        Registry.register(Registry.SOUND_EVENT, ELEVATOR_START_ID, ELEVATOR_START);
        Registry.register(Registry.SOUND_EVENT, ELEVATOR_STOP_ID, ELEVATOR_STOP);
        Registry.register(Registry.SOUND_EVENT, BUZZ_ID, BUZZ);
    }
}
