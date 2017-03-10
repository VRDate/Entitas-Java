package com.ilargia.games.logicbrick.system.sensor;


import com.badlogic.gdx.physics.box2d.*;
import com.ilargia.games.entitas.api.system.IExecuteSystem;
import com.ilargia.games.entitas.group.Group;
import com.ilargia.games.entitas.matcher.Matcher;
import com.ilargia.games.logicbrick.component.sensor.CollisionSensor;
import com.ilargia.games.egdx.api.managers.listener.Collision;
import com.ilargia.games.logicbrick.gen.Entitas;
import com.ilargia.games.logicbrick.gen.game.GameEntity;
import com.ilargia.games.logicbrick.gen.sensor.SensorContext;
import com.ilargia.games.logicbrick.gen.sensor.SensorEntity;
import com.ilargia.games.logicbrick.gen.sensor.SensorMatcher;
import com.ilargia.games.logicbrick.index.SensorIndex;

public class CollisionSensorSystem extends SensorSystem implements IExecuteSystem, Collision<GameEntity> {
    private final SensorContext sensorContex;
    private final Group<SensorEntity> sensorGroup;

    public CollisionSensorSystem(Entitas entitas) {
        this.sensorContex = entitas.sensor;
        sensorGroup = sensorContex.getGroup(Matcher.AllOf(SensorMatcher.CollisionSensor(), SensorMatcher.Signal()));

    }

    @Override
    protected boolean query(SensorEntity sensorEntity, float deltaTime) {
        return sensorEntity.getCollisionSensor().collisionSignal;

    }

    @Override
    public void execute(float deltaTime) {
        for (SensorEntity sensorEntity : sensorGroup.getEntities()) {
            process(sensorEntity, deltaTime);
        }
    }

    @Override
    public void processCollision(GameEntity entityA, GameEntity entityB, boolean collisionSignal) {
        if(entityA != null && entityB !=null) {
            for (SensorEntity entity : SensorIndex.getEntitiesSensor(sensorContex, entityA)) {
                CollisionSensor collision = entity.getCollisionSensor();
                if(entityB.getIdentity().tags.contains(collision.targetTag))
                    collision.collisionSignal = collisionSignal;

            }
        }
    }

}
