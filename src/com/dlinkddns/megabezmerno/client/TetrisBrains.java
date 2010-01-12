package com.dlinkddns.megabezmerno.client;

import java.lang.reflect.Array;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class TetrisBrains implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		
	}

}
class figint {
	public final static int L1=1;
	public final static int L2=2;
	public final static int R1=3;
	public final static int R2=4;
	public final static int S1=5;
	public final static int S2=6;
	public final static int I=7;
	public final static int O=8;
}
class figCvet {
	public final static int EMPTY=1;
	public final static int WALL=2;
	public final static int FIGURE=3;
	public final static int WALLFIGURE=4;
	public final static int UNASSIGNED=5;
}
class tetrisPrimitive {
	int[][] kvadrat=new int[10][10];
	for (int[] row:kvadrat) {
		for (int value:row) {
			value=figCvet.UNASSIGNED;
			Window.alert(Integer.toBinaryString(value));
		}
	}
}