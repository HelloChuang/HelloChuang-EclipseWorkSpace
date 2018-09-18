package com.gao;

/**
 * @author Gaoch
 *
 */
public class PaintFrame {
	public static void paintFrame(IGameFrame f) {
		System.out.println("method01");
		System.out.println("method02");
		System.out.println("method03");
		f.paint();
		System.out.println("method04");
	}
	public static void main(String[] args) {
		IGameFrame g = new GameFrame();
		paintFrame(g);
	}
}
class GameFrame implements IGameFrame{

	@Override
	public void paint() {
		System.out.println("GameFram.paint");
		
	}
	
}
	
