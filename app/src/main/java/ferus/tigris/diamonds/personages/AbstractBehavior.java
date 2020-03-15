package ferus.tigris.diamonds.personages;

import ferus.tigris.diamonds.HorizontalDirection;
import ferus.tigris.diamonds.Matrix;
import ferus.tigris.diamonds.VerticalDirection;

import android.graphics.Canvas;
import android.graphics.Point;

public interface AbstractBehavior {
	abstract public void update();
	abstract public void draw(Canvas canvas);
	
	public abstract String getType();
	abstract public boolean isDied();
	public abstract void kill();
	
	public abstract void saveAt(Matrix m, Point pos);
	
	public abstract void move(Point pos, VerticalDirection direction);
	public abstract void move(Point pos, HorizontalDirection direction);
	
	public abstract void moveFinish(Point displacement, VerticalDirection direction);
	public abstract void moveFinish(Point displacement, HorizontalDirection direction);
	
	abstract boolean isAvailable(); 
}
