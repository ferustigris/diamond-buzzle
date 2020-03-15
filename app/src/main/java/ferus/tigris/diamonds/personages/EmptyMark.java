package ferus.tigris.diamonds.personages;

import java.util.ArrayList;
import java.util.List;

import ferus.tigris.diamonds.GameView;

public class EmptyMark extends Mark {

	public EmptyMark(GameView gameView) {
		super(null, gameView, gameView.gameField());
	}
	
	public boolean isDied() {
		return true;
	}
	
	public boolean isNotInMyFriends() {
		return false;
	}

	public List<AbstractBehavior> getFriends() {
		List<AbstractBehavior> friends = new ArrayList<AbstractBehavior>();
		return friends;
	}
	
	public void update() {}
}
