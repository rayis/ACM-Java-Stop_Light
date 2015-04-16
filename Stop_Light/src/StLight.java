import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class StLight extends GraphicsProgram {

		public void run(){
			double x = (double) (getWidth() - RECT_WIDTH) / 2;
			double y = (double) (getHeight() - RECT_HEIGHT) / 2;
			Color color = Color.GRAY;
			GRect rect = createFilledRect(x, y, RECT_WIDTH, RECT_HEIGHT, color);
			add(rect);
			double radius = RECT_WIDTH / 3;
			double offset1 = x + RECT_WIDTH / 3;
			double offset2 = (y + RECT_HEIGHT / 3) - radius;
			GOval circle1 = createFilledCircle(offset1, offset2, radius, Color.RED);
			add(circle1);
			GOval circle2 = createFilledCircle(offset1, offset2 + RECT_HEIGHT / 4, radius, Color.YELLOW);
			add(circle2);
			GOval circle3 = createFilledCircle(offset1, offset2 + 2*RECT_HEIGHT / 4, radius, Color.GREEN);
			add(circle3);
		}
		private GOval createFilledCircle(double n, double m, double rradius, Color color) {
			GOval circle = new GOval(n, m, rradius, rradius);
			circle.setColor(color);
			circle.setFilled(true);
			return circle;
		}
		private GRect createFilledRect(double n, double m, double widthm, double heightm, Color color){
			GRect rect = new GRect(n, m, widthm, heightm);
			rect.setColor(color);
			rect.setFilled(true);
			return rect;
		}
		private static final int RECT_WIDTH = 200;
		private static final int RECT_HEIGHT = 400;
		
}
