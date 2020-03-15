package ferus.tigris.diamonds.Builders;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.personages.AbstractBehavior;
import ferus.tigris.diamonds.personages.AdditionViewBehavior;
import ferus.tigris.diamonds.personages.Cloud;
import ferus.tigris.diamonds.personages.KillerBehavior;
import ferus.tigris.diamonds.personages.KillerWithEffectBehavior;
import ferus.tigris.diamonds.personages.Mark;
import ferus.tigris.diamonds.personages.SlowViewBehavior;
import ferus.tigris.diamonds.personages.ViewsManager;
import ferus.tigris.diamonds.views.ComposeSprite;
import ferus.tigris.diamonds.views.LinearSprite;

public class EmptyMarkBuilder extends AbstractBehaviorBuilder {

	public AbstractBehavior create(GameView view) {
		Mark behavior = createPersonage(view);
		ViewsManager viewManager = new SlowViewBehavior(behavior, createSprite(view), view.gameField()); 
		KillerBehavior killer = new KillerWithEffectBehavior(viewManager); 

		AdditionViewBehavior additionView = new AdditionViewBehavior(killer, createSprite(view), view.gameField());
		return additionView;
	}

	protected Mark createPersonage(GameView view) {
		return new Cloud(null, view);
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getBox();
		sprites.add(new LinearSprite(img, 1, 1130, 0));
		
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}

	
	protected boolean checkType(String type) {
		return type.contains("Cloud");
	}
}
