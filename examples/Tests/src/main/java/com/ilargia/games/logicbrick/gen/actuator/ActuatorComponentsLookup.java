package com.ilargia.games.logicbrick.gen.actuator;

import com.ilargia.games.logicbrick.component.actuator.CameraActuator;
import com.ilargia.games.logicbrick.component.actuator.CharacterActuator;
import com.ilargia.games.logicbrick.component.actuator.TextureActuator;
import com.ilargia.games.logicbrick.component.actuator.VelocityActuator;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class ActuatorComponentsLookup {

	public static final int CameraActuator = 0;
	public static final int CharacterActuator = 1;
	public static final int TextureActuator = 2;
	public static final int VelocityActuator = 3;
	public static final int totalComponents = 4;

	public static String[] componentNames() {
		return new String[]{"CameraActuator", "CharacterActuator",
				"TextureActuator", "VelocityActuator"};
	}

	public static Class[] componentTypes() {
		return new Class[]{CameraActuator.class, CharacterActuator.class,
				TextureActuator.class, VelocityActuator.class};
	}
}