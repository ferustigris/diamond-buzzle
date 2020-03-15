package ferus.tigris.diamonds.Builders;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.personages.Bear;
import ferus.tigris.diamonds.personages.Mark;
import ferus.tigris.diamonds.views.ComposeSprite;
import ferus.tigris.diamonds.views.LinearSprite;

public class BearBuilder extends EmptyMarkBuilder {

	protected Mark createPersonage(GameView view) {
		return new Bear(null, view);
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getBear();
		sprites.add(new LinearSprite(img, 15, 10, 200));
		
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}
	
	protected boolean checkType(String type) {
		return type.contains("Bear");
	}

}
