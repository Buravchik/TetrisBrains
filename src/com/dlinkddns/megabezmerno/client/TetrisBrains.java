package com.dlinkddns.megabezmerno.client;

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
	private int[][] kvadrat=new int[10][10];
	
	//set color of kvadrat element
	private void setColor(int i, int j, int aColor) {
		if ((i<10)&&(j<10)&&(aColor>=1)&&(aColor<=5))kvadrat[i][j]=aColor;
		else Window.alert("abnormal index ["+i+"]["+j+"]");
	}
	
	//Constructor will init kvadrat with UNASSIGNED color and fill it with initial figure with color FIGURE by calling approperate method
	tetrisPrimitive(int figura, int orientation) {
		clearKvadrat();
		drawFigura(figura, 0, 0, 0);
	}
	
	//method is clearing Kvadrat by filling it with UNASSIGNED color
	private void clearKvadrat() {
		for (int i=0; i<kvadrat.length;i++) {
			for (int j=0; j<kvadrat[i].length; j++) {
				kvadrat[i][j]=figCvet.UNASSIGNED;
			}
		}
	}
	//draws tetris primitive at center of kvadrat with vertical and horisontal shifts and orientation.
	private void drawFigura (int figura, int orientation, int vShift, int hShift){
		switch (figura)
		{
			case figint.I:
				switch (orientation) {
					case 0:
						setColor(5+vShift,3+hShift,figCvet.FIGURE);
						setColor(5+vShift,4+hShift,figCvet.FIGURE);
						setColor(5+vShift,5+hShift,figCvet.FIGURE);
						setColor(5+vShift,6+hShift,figCvet.FIGURE);
						break;
					case 1:
						setColor(3+vShift,4+hShift,figCvet.FIGURE);
						setColor(4+vShift,4+hShift,figCvet.FIGURE);
						setColor(5+vShift,4+hShift,figCvet.FIGURE);
						setColor(6+vShift,4+hShift,figCvet.FIGURE);
						break;
					default:
						Window.alert("wrong orientation for figure "+figura);
						break;
				}
				break;
			case figint.L1:
				switch (orientation) {
					case 0:
						setColor(5+vShift,3+hShift,figCvet.FIGURE);
						setColor(5+vShift,4+hShift,figCvet.FIGURE);
						setColor(5+vShift,5+hShift,figCvet.FIGURE);
						setColor(4+vShift,5+hShift,figCvet.FIGURE);
						break;
					case 1:
						setColor(4+vShift,4+hShift,figCvet.FIGURE);
						setColor(5+vShift,4+hShift,figCvet.FIGURE);
						setColor(6+vShift,4+hShift,figCvet.FIGURE);
						setColor(6+vShift,5+hShift,figCvet.FIGURE);
						break;
					case 2:
						setColor(5+vShift,4+hShift,figCvet.FIGURE);
						setColor(4+vShift,4+hShift,figCvet.FIGURE);
						setColor(4+vShift,5+hShift,figCvet.FIGURE);
						setColor(4+vShift,6+hShift,figCvet.FIGURE);
						break;
					case 3:
						setColor(4+vShift,3+hShift,figCvet.FIGURE);
						setColor(4+vShift,4+hShift,figCvet.FIGURE);
						setColor(5+vShift,4+hShift,figCvet.FIGURE);
						setColor(6+vShift,4+hShift,figCvet.FIGURE);
						break;
					default:
						Window.alert("wrong orientation for figure "+figura);
						break;
				}
				break;
			case figint.L2:
				break;
			case figint.R1:
				break;
			case figint.R2:
				break;
			case figint.S1:
				break;
			case figint.S2:
				break;
			case figint.O:
				break;
		}
	}
	
}