package ferus.tigris.diamonds;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundManager {
	
	private SoundPool sounds;
	private int sPuk;
	private boolean enabled = true;
	private int sBird;
	private int sRabbit;
	private int sCat;
	private int sFrog;
	private int sMouse;
	private int sBug;
	private int sFail;
	private int sComplite;
	private int sWrite;
	private int sneezing;

	SoundManager(Context context) {
		sounds = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
		sPuk = sounds.load(context, R.raw.tinybuttonpush, 1);

		sFail = sounds.load(context, R.raw.evil_laf, 1);
		sComplite = sounds.load(context, R.raw.triangle, 1);
		sWrite = sounds.load(context, R.raw.tinybuttonpush, 1);

		sneezing = sounds.load(context, R.raw.guff, 1);
}

	public void setEnabled(boolean soundEnable) {
		enabled = soundEnable;
	}

	private void play(int sound) {
		if(enabled)
			sounds.play(sound, 1.0f, 1.0f, 0, 0, 1.5f);
	}

	public void playTouch() {
		play(sPuk);
	}

	public boolean enable() {
		return enabled;
	}

	public void playLevelFail() {
		play(sFail);
	}

	public void playLevelComplite() {
		play(sComplite);
	}

	public void playBlock() {
		play(sWrite);
	}

	public void playSneezing() {
		play(sneezing);
	}

}
