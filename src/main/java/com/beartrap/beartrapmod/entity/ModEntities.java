package com.beartrap.beartrapmod.entity;

import com.beartrap.beartrapmod.TrapMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(
                    ForgeRegistries.ENTITY_TYPES,
                    TrapMod.MODID
            );

    public static final RegistryObject<EntityType<BearTrapEntity>> BEAR_TRAP =
            ENTITY_TYPES.register(
                    "bear_trap",
                    () -> EntityType.Builder
                            .<BearTrapEntity>of(
                                    BearTrapEntity::new,
                                    MobCategory.MISC
                            )
                            .sized(1.0F, 0.3F)
                            .build(TrapMod.MODID + ":bear_trap")
            );

    private ModEntities() {
    }
}