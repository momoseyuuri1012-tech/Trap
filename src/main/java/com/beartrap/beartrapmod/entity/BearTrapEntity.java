package com.beartrap.beartrapmod.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class BearTrapEntity extends Entity {

    public BearTrapEntity(
            EntityType<? extends BearTrapEntity> entityType,
            Level level
    ) {
        super(entityType, level);
    }

    @Override
    protected void defineSynchedData() {
        // サーバーとクライアントで共有するデータを、後でここに登録する
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        // ワールド保存データを読み込む処理を、後でここに書く
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        // ワールドに保存するデータを、後でここに書く
    }
}