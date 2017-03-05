package com.ilargia.games.entitas.utils;

import com.ilargia.games.entitas.api.ContextInfo;
import com.ilargia.games.entitas.api.EntityBaseFactory;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class TestContext extends com.ilargia.games.entitas.Context<TestEntity> {

    public TestContext(int totalComponents, int startCreationIndex,
                       ContextInfo contextInfo, EntityBaseFactory<TestEntity> factoryMethod) {
        super(totalComponents, startCreationIndex, contextInfo, factoryMethod);
    }

    public TestEntity getPlayerEntity() {
        return getGroup(TestMatcher.Player()).getSingleEntity();
    }

    public boolean isPlayer() {
        return getPlayerEntity() != null;
    }

    public TestContext setPlayer(boolean value) {
        TestEntity entity = getPlayerEntity();
        if (value != (entity != null)) {
            if (value) {
                entity.setPlayer(true);
            } else {
                destroyEntity(entity);
            }
        }
        return this;
    }
}