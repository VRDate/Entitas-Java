package com.ilargia.games.entitas.codeGenerator.generated;

import com.ilargia.games.entitas.api.*;
import com.ilargia.games.entitas.Entity;
import java.util.Stack;
import com.ilargia.games.entitas.codeGenerator.components.Ball;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.codeGenerator.components.Bounds.Tag;
import com.ilargia.games.entitas.codeGenerator.components.Bounds;
import com.badlogic.gdx.math.Rectangle;
import com.ilargia.games.entitas.codeGenerator.components.Motion;
import com.badlogic.gdx.math.Vector2;
import com.ilargia.games.entitas.codeGenerator.components.Player.ID;
import com.ilargia.games.entitas.codeGenerator.components.Player;
import com.ilargia.games.entitas.codeGenerator.components.Score;
import com.ilargia.games.entitas.codeGenerator.components.View;
import com.badlogic.gdx.math.Shape2D;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class CoreEntity extends Entity {

	public CoreEntity() {
	}

	public Ball getBall() {
		return (Ball) getComponent(CoreComponentIds.Ball);
	}

	public boolean hasBall() {
		return hasComponent(CoreComponentIds.Ball);
	}

	public CoreEntity addBall(boolean resetBall) {
		Ball component = (Ball) recoverComponent(CoreComponentIds.Ball);
		if (component == null) {
			component = new Ball(resetBall);
		} else {
			component.resetBall = resetBall;
		}
		addComponent(CoreComponentIds.Ball, component);
		return this;
	}

	public CoreEntity replaceBall(boolean resetBall) {
		Ball component = (Ball) recoverComponent(CoreComponentIds.Ball);
		if (component == null) {
			component = new Ball(resetBall);
		} else {
			component.resetBall = resetBall;
		}
		replaceComponent(CoreComponentIds.Ball, component);
		return this;
	}

	public CoreEntity removeBall() {
		removeComponent(CoreComponentIds.Ball);
		return this;
	}

	public Bounds getBounds() {
		return (Bounds) getComponent(CoreComponentIds.Bounds);
	}

	public boolean hasBounds() {
		return hasComponent(CoreComponentIds.Bounds);
	}

	public CoreEntity addBounds(float x, float y, float width, float height,
			Tag tag) {
		Bounds component = (Bounds) recoverComponent(CoreComponentIds.Bounds);
		if (component == null) {
			component = new Bounds(x, y, width, height, tag);
		} else {
			component.rectangle = new Rectangle(x, y, width, height);;
			component.tag = tag;
		}
		addComponent(CoreComponentIds.Bounds, component);
		return this;
	}

	public CoreEntity replaceBounds(float x, float y, float width,
			float height, Tag tag) {
		Bounds component = (Bounds) recoverComponent(CoreComponentIds.Bounds);
		if (component == null) {
			component = new Bounds(x, y, width, height, tag);
		} else {
			component.rectangle = new Rectangle(x, y, width, height);;
			component.tag = tag;
		}
		replaceComponent(CoreComponentIds.Bounds, component);
		return this;
	}

	public CoreEntity removeBounds() {
		removeComponent(CoreComponentIds.Bounds);
		return this;
	}

	public Motion getMotion() {
		return (Motion) getComponent(CoreComponentIds.Motion);
	}

	public boolean hasMotion() {
		return hasComponent(CoreComponentIds.Motion);
	}

	public CoreEntity addMotion(float x, float y) {
		Motion component = (Motion) recoverComponent(CoreComponentIds.Motion);
		if (component == null) {
			component = new Motion(x, y);
		} else {
			component.velocity = new Vector2(x, y);
		}
		addComponent(CoreComponentIds.Motion, component);
		return this;
	}

	public CoreEntity replaceMotion(float x, float y) {
		Motion component = (Motion) recoverComponent(CoreComponentIds.Motion);
		if (component == null) {
			component = new Motion(x, y);
		} else {
			component.velocity = new Vector2(x, y);
		}
		replaceComponent(CoreComponentIds.Motion, component);
		return this;
	}

	public CoreEntity removeMotion() {
		removeComponent(CoreComponentIds.Motion);
		return this;
	}

	public Player getPlayer() {
		return (Player) getComponent(CoreComponentIds.Player);
	}

	public boolean hasPlayer() {
		return hasComponent(CoreComponentIds.Player);
	}

	public CoreEntity addPlayer(ID id) {
		Player component = (Player) recoverComponent(CoreComponentIds.Player);
		if (component == null) {
			component = new Player(id);
		} else {
			component.id = id;
		}
		addComponent(CoreComponentIds.Player, component);
		return this;
	}

	public CoreEntity replacePlayer(ID id) {
		Player component = (Player) recoverComponent(CoreComponentIds.Player);
		if (component == null) {
			component = new Player(id);
		} else {
			component.id = id;
		}
		replaceComponent(CoreComponentIds.Player, component);
		return this;
	}

	public CoreEntity removePlayer() {
		removeComponent(CoreComponentIds.Player);
		return this;
	}

	public Score getScore() {
		return (Score) getComponent(CoreComponentIds.Score);
	}

	public boolean hasScore() {
		return hasComponent(CoreComponentIds.Score);
	}

	public CoreEntity addScore(int value) {
		Score component = (Score) recoverComponent(CoreComponentIds.Score);
		if (component == null) {
			component = new Score(value);
		} else {
			component.value = value;
		}
		addComponent(CoreComponentIds.Score, component);
		return this;
	}

	public CoreEntity replaceScore(int value) {
		Score component = (Score) recoverComponent(CoreComponentIds.Score);
		if (component == null) {
			component = new Score(value);
		} else {
			component.value = value;
		}
		replaceComponent(CoreComponentIds.Score, component);
		return this;
	}

	public CoreEntity removeScore() {
		removeComponent(CoreComponentIds.Score);
		return this;
	}

	public View getView() {
		return (View) getComponent(CoreComponentIds.View);
	}

	public boolean hasView() {
		return hasComponent(CoreComponentIds.View);
	}

	public CoreEntity addView(Shape2D shape) {
		View component = (View) recoverComponent(CoreComponentIds.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		addComponent(CoreComponentIds.View, component);
		return this;
	}

	public CoreEntity replaceView(Shape2D shape) {
		View component = (View) recoverComponent(CoreComponentIds.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		replaceComponent(CoreComponentIds.View, component);
		return this;
	}

	public CoreEntity removeView() {
		removeComponent(CoreComponentIds.View);
		return this;
	}
}