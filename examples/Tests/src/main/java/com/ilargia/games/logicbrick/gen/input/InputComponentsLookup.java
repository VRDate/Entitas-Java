package com.ilargia.games.logicbrick.gen.input;

import com.ilargia.games.logicbrick.component.input.PadButtons;
import com.ilargia.games.logicbrick.component.input.PlayerInputController;
import com.ilargia.games.logicbrick.component.input.TouchPad;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class InputComponentsLookup {

	public static final int PadButtons = 0;
	public static final int PlayerInputController = 1;
	public static final int TouchPad = 2;
	public static final int totalComponents = 3;

	public static String[] componentNames() {
		return new String[]{"PadButtons", "PlayerInputController", "TouchPad"};
	}

	public static Class[] componentTypes() {
		return new Class[]{PadButtons.class, PlayerInputController.class,
				TouchPad.class};
	}
}