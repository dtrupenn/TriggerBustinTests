package edu.upenn.cis.cis350.test;

import android.test.ActivityInstrumentationTestCase2;
import edu.upenn.cis.cis350.ScoreShow;

public class ScoreShowTest extends ActivityInstrumentationTestCase2<ScoreShow> {

	private ScoreShow gActivity;
	
	@SuppressWarnings("deprecation")
	public ScoreShowTest() {
		super("edu.upenn.cis.cis350.ScoreShow", ScoreShow.class);
	}
	
	@Override
	protected void setUp() throws Exception {
	    super.setUp();

	    setActivityInitialTouchMode(false);

	    gActivity = getActivity();
	  } // end of setUp() method definition
	
	public void testScoreBoard() {
		gActivity.getApplicationContext();
	}
}
