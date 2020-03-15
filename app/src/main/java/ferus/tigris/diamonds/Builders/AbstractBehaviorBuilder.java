package ferus.tigris.diamonds.Builders;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.personages.AbstractBehavior;
import ferus.tigris.diamonds.personages.EmptyMark;
import ferus.tigris.diamonds.personages.Mark;


public class AbstractBehaviorBuilder {
	static List<AbstractBehaviorBuilder> builders = new ArrayList<AbstractBehaviorBuilder>();
	static boolean buildersNoCreated = true;
		
	public AbstractBehaviorBuilder() {
		if(buildersNoCreated) {
			buildersNoCreated  = false;
			builders.add(new CatBuilder());
			builders.add(new BuggyBuilder());
			builders.add(new MouseBuilder());
			builders.add(new BirdBuilder());
			builders.add(new FrogBuilder());
			builders.add(new RabbitBuilder());
			builders.add(new PigBuilder());
			builders.add(new BearBuilder());
		}
	}
	
	public AbstractBehavior create(GameView view) {
		Mark behavior = new EmptyMark(view);
		return behavior;
	}
	
	public AbstractBehavior createRandomMark(GameView view) {
		Random rnd = new Random();
		AbstractBehaviorBuilder builder = builders.get(rnd.nextInt(builders.size()));
		return builder.create(view);
	}
	
	protected boolean checkType(String type) {
		return false;
	}

	public AbstractBehavior createByName(GameView gameView, String name) {
		for(AbstractBehaviorBuilder builder: builders) {
			if(builder.checkType(name)) {
				return builder.create(gameView);
			}
		}
		return create(gameView);
	}
	
}