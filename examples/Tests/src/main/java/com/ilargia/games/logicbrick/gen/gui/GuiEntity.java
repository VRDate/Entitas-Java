package com.ilargia.games.logicbrick.gen.gui;

import com.ilargia.games.entitas.api.*;
import com.ilargia.games.entitas.Entity;
import java.util.Stack;
import com.ilargia.games.logicbrick.component.gui.Bounds;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.logicbrick.component.gui.ButtonWidget.Type;
import com.ilargia.games.logicbrick.component.gui.ButtonWidget;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.ilargia.games.logicbrick.component.gui.ImageWidget;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.ilargia.games.logicbrick.component.gui.LabelWidget;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.ilargia.games.logicbrick.component.gui.Position;
import com.ilargia.games.logicbrick.component.gui.Score;
import com.ilargia.games.logicbrick.component.gui.Style;
import com.ilargia.games.logicbrick.component.gui.TextFieldWidget;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class GuiEntity extends Entity {

	public GuiEntity() {
	}

	public Bounds getBounds() {
		return (Bounds) getComponent(GuiComponentsLookup.Bounds);
	}

	public boolean hasBounds() {
		return hasComponent(GuiComponentsLookup.Bounds);
	}

	public GuiEntity addBounds(float extentsX, float extentsY) {
		Bounds component = (Bounds) recoverComponent(GuiComponentsLookup.Bounds);
		if (component == null) {
			component = new Bounds(extentsX, extentsY);
		} else {
			component.extentsX = extentsX;
			component.extentsY = extentsY;
		}
		addComponent(GuiComponentsLookup.Bounds, component);
		return this;
	}

	public GuiEntity replaceBounds(float extentsX, float extentsY) {
		Bounds component = (Bounds) recoverComponent(GuiComponentsLookup.Bounds);
		if (component == null) {
			component = new Bounds(extentsX, extentsY);
		} else {
			component.extentsX = extentsX;
			component.extentsY = extentsY;
		}
		replaceComponent(GuiComponentsLookup.Bounds, component);
		return this;
	}

	public GuiEntity removeBounds() {
		removeComponent(GuiComponentsLookup.Bounds);
		return this;
	}

	public ButtonWidget getButtonWidget() {
		return (ButtonWidget) getComponent(GuiComponentsLookup.ButtonWidget);
	}

	public boolean hasButtonWidget() {
		return hasComponent(GuiComponentsLookup.ButtonWidget);
	}

	public GuiEntity addButtonWidget(Type type) {
		ButtonWidget component = (ButtonWidget) recoverComponent(GuiComponentsLookup.ButtonWidget);
		if (component == null) {
			component = new ButtonWidget(type);
		} else {
			component.type = type;
		}
		addComponent(GuiComponentsLookup.ButtonWidget, component);
		return this;
	}

	public GuiEntity replaceButtonWidget(Type type) {
		ButtonWidget component = (ButtonWidget) recoverComponent(GuiComponentsLookup.ButtonWidget);
		if (component == null) {
			component = new ButtonWidget(type);
		} else {
			component.type = type;
		}
		replaceComponent(GuiComponentsLookup.ButtonWidget, component);
		return this;
	}

	public GuiEntity removeButtonWidget() {
		removeComponent(GuiComponentsLookup.ButtonWidget);
		return this;
	}

	public ImageWidget getImageWidget() {
		return (ImageWidget) getComponent(GuiComponentsLookup.ImageWidget);
	}

	public boolean hasImageWidget() {
		return hasComponent(GuiComponentsLookup.ImageWidget);
	}

	public GuiEntity addImageWidget() {
		ImageWidget component = (ImageWidget) recoverComponent(GuiComponentsLookup.ImageWidget);
		if (component == null) {
			component = new ImageWidget();
		} else {
		}
		addComponent(GuiComponentsLookup.ImageWidget, component);
		return this;
	}

	public GuiEntity replaceImageWidget() {
		ImageWidget component = (ImageWidget) recoverComponent(GuiComponentsLookup.ImageWidget);
		if (component == null) {
			component = new ImageWidget();
		} else {
		}
		replaceComponent(GuiComponentsLookup.ImageWidget, component);
		return this;
	}

	public GuiEntity removeImageWidget() {
		removeComponent(GuiComponentsLookup.ImageWidget);
		return this;
	}

	public LabelWidget getLabelWidget() {
		return (LabelWidget) getComponent(GuiComponentsLookup.LabelWidget);
	}

	public boolean hasLabelWidget() {
		return hasComponent(GuiComponentsLookup.LabelWidget);
	}

	public GuiEntity addLabelWidget(String text) {
		LabelWidget component = (LabelWidget) recoverComponent(GuiComponentsLookup.LabelWidget);
		if (component == null) {
			component = new LabelWidget(text);
		} else {
			component.text = text;
		}
		addComponent(GuiComponentsLookup.LabelWidget, component);
		return this;
	}

	public GuiEntity replaceLabelWidget(String text) {
		LabelWidget component = (LabelWidget) recoverComponent(GuiComponentsLookup.LabelWidget);
		if (component == null) {
			component = new LabelWidget(text);
		} else {
			component.text = text;
		}
		replaceComponent(GuiComponentsLookup.LabelWidget, component);
		return this;
	}

	public GuiEntity removeLabelWidget() {
		removeComponent(GuiComponentsLookup.LabelWidget);
		return this;
	}

	public Position getPosition() {
		return (Position) getComponent(GuiComponentsLookup.Position);
	}

	public boolean hasPosition() {
		return hasComponent(GuiComponentsLookup.Position);
	}

	public GuiEntity addPosition(float x, float y) {
		Position component = (Position) recoverComponent(GuiComponentsLookup.Position);
		if (component == null) {
			component = new Position(x, y);
		} else {
			component.x = x;
			component.y = y;
		}
		addComponent(GuiComponentsLookup.Position, component);
		return this;
	}

	public GuiEntity replacePosition(float x, float y) {
		Position component = (Position) recoverComponent(GuiComponentsLookup.Position);
		if (component == null) {
			component = new Position(x, y);
		} else {
			component.x = x;
			component.y = y;
		}
		replaceComponent(GuiComponentsLookup.Position, component);
		return this;
	}

	public GuiEntity removePosition() {
		removeComponent(GuiComponentsLookup.Position);
		return this;
	}

	public Score getScore() {
		return (Score) getComponent(GuiComponentsLookup.Score);
	}

	public boolean hasScore() {
		return hasComponent(GuiComponentsLookup.Score);
	}

	public GuiEntity addScore(int value) {
		Score component = (Score) recoverComponent(GuiComponentsLookup.Score);
		if (component == null) {
			component = new Score();
		}
		component.value = value;
		addComponent(GuiComponentsLookup.Score, component);
		return this;
	}

	public GuiEntity replaceScore(int value) {
		Score component = (Score) recoverComponent(GuiComponentsLookup.Score);
		if (component == null) {
			component = new Score();
		}
		component.value = value;
		replaceComponent(GuiComponentsLookup.Score, component);
		return this;
	}

	public GuiEntity removeScore() {
		removeComponent(GuiComponentsLookup.Score);
		return this;
	}

	public Style getStyle() {
		return (Style) getComponent(GuiComponentsLookup.Style);
	}

	public boolean hasStyle() {
		return hasComponent(GuiComponentsLookup.Style);
	}

	public GuiEntity addStyle(String styleName) {
		Style component = (Style) recoverComponent(GuiComponentsLookup.Style);
		if (component == null) {
			component = new Style(styleName);
		} else {
			component.name = styleName;
		}
		addComponent(GuiComponentsLookup.Style, component);
		return this;
	}

	public GuiEntity replaceStyle(String styleName) {
		Style component = (Style) recoverComponent(GuiComponentsLookup.Style);
		if (component == null) {
			component = new Style(styleName);
		} else {
			component.name = styleName;
		}
		replaceComponent(GuiComponentsLookup.Style, component);
		return this;
	}

	public GuiEntity removeStyle() {
		removeComponent(GuiComponentsLookup.Style);
		return this;
	}

	public TextFieldWidget getTextFieldWidget() {
		return (TextFieldWidget) getComponent(GuiComponentsLookup.TextFieldWidget);
	}

	public boolean hasTextFieldWidget() {
		return hasComponent(GuiComponentsLookup.TextFieldWidget);
	}

	public GuiEntity addTextFieldWidget() {
		TextFieldWidget component = (TextFieldWidget) recoverComponent(GuiComponentsLookup.TextFieldWidget);
		if (component == null) {
			component = new TextFieldWidget();
		} else {
		}
		addComponent(GuiComponentsLookup.TextFieldWidget, component);
		return this;
	}

	public GuiEntity replaceTextFieldWidget() {
		TextFieldWidget component = (TextFieldWidget) recoverComponent(GuiComponentsLookup.TextFieldWidget);
		if (component == null) {
			component = new TextFieldWidget();
		} else {
		}
		replaceComponent(GuiComponentsLookup.TextFieldWidget, component);
		return this;
	}

	public GuiEntity removeTextFieldWidget() {
		removeComponent(GuiComponentsLookup.TextFieldWidget);
		return this;
	}
}