package edu.upenn.cis.cis350.test;

import android.content.Context;
import android.content.SharedPreferences;
import android.test.ActivityInstrumentationTestCase2;

import android.widget.TextView;
import edu.upenn.cis.cis350.ScoreShow;

public class ScoreShowTest extends ActivityInstrumentationTestCase2<ScoreShow> {

	private ScoreShow gActivity;
	//private SharedPreferences prefs;
	
	@SuppressWarnings("deprecation")
	public ScoreShowTest() {
		super("edu.upenn.cis.cis350.ScoreShow", ScoreShow.class);
	}
	
	/*
	 * Sets up testing environment
	 * (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
	    super.setUp();

	    setActivityInitialTouchMode(false);
	    
	    gActivity = getActivity();
	} // end of setUp() method definition
	
	
	public void testScoreBoardPreConditions() {
		SharedPreferences prefs = gActivity.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
		
		TextView view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key0", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter1);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key1", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter2);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key2", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter3);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key3", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter4);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key4", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter5);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key5", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter6);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key6", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter7);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key7", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter8);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key8", 0));
		view = (TextView) gActivity.findViewById(edu.upenn.cis.cis350.R.id.counter9);
		assertTrue(Integer.valueOf(view.getText().toString()) == prefs.getInt("key9", 0));
	}
	
	/*
	 * Tests UpdateScore Method
	 */
	public void testScoreBoardUpdateScore() {

		SharedPreferences prefs = gActivity.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
		//Resets scores
		gActivity.resetScores(prefs);
		//Add score of 10
		gActivity.updateScore(10, prefs);
		assertTrue(10 == prefs.getInt("key0", 0));
		//Add score of 12
		gActivity.updateScore(12, prefs);
		assertTrue(12 == prefs.getInt("key0", 0));
		assertTrue(10 == prefs.getInt("key1", 0));
		//Add score of 8
		gActivity.updateScore(8, prefs);
		assertTrue(12 == prefs.getInt("key0", 0));
		assertTrue(10 == prefs.getInt("key1", 0));
		assertTrue(8 == prefs.getInt("key2", 0));
		
	}
}
