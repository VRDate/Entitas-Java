package test.gen.test;

import ilargia.fixtures.components.test.Interactive;
import ilargia.fixtures.components.test.Motion;
import ilargia.fixtures.components.test.Position;
import ilargia.fixtures.components.test.Size;

/**
 * //-------------------------------------------------------------------------//
 * <auto-generated>// This code was generated by {0}.//// Changes to this file
 * may cause incorrect behavior and will be lost if// the code is regenerated.//
 * </auto-generated>//----------------------------------------------------------
 * ---------------
 */
public class TestComponentsLookup {

	public static final int Interactive = 0;
	public static final int Motion = 1;
	public static final int Position = 2;
	public static final int Size = 3;
	public static final int totalComponents = 4;

	public static String[] componentNames() {
		return new String[]{"Interactive", "Motion", "Position", "Size"};
	}

	public static Class[] componentTypes() {
		return new Class[]{Interactive.class, Motion.class, Position.class,
				Size.class};
	}
}