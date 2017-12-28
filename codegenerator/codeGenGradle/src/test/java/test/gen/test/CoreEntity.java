package test.gen.test;

import ilargia.entitas.Entity;
import ilargia.fixtures.components.test.Player.ID;
import ilargia.fixtures.components.test.Player;
import test.gen.SharedComponentsLookup;

/**
 * //-------------------------------------------------------------------------//
 * <auto-generated>// This code was generated by {0}.//// Changes to this file
 * may cause incorrect behavior and will be lost if// the code is regenerated.//
 * </auto-generated>//----------------------------------------------------------
 * ---------------
 */
public class CoreEntity extends Entity {

	public CoreEntity() {
	}

	public Player getPlayer() {
		return (Player) getComponent(SharedComponentsLookup.Player);
	}

	public boolean hasPlayer() {
		return hasComponent(SharedComponentsLookup.Player);
	}

	public CoreEntity addPlayer(ID id) {
		Player component = (Player) recoverComponent(SharedComponentsLookup.Player);
		if (component == null) {
			component = new Player(id);
		} else {
			component.id = id;
		}
		addComponent(SharedComponentsLookup.Player, component);
		return this;
	}

	public CoreEntity replacePlayer(ID id) {
		Player component = (Player) recoverComponent(SharedComponentsLookup.Player);
		if (component == null) {
			component = new Player(id);
		} else {
			component.id = id;
		}
		replaceComponent(SharedComponentsLookup.Player, component);
		return this;
	}

	public CoreEntity removePlayer() {
		removeComponent(SharedComponentsLookup.Player);
		return this;
	}
}