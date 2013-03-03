package edu.upenn.cis.cis350.test;

import android.test.ActivityInstrumentationTestCase2;
import edu.upenn.cis.cis350.StartPage;

public class StartPageTest extends ActivityInstrumentationTestCase2<StartPage>{

	private StartPage sActivity;
	
	public StartPageTest() {
		super("edu.upenn.cis.cis350.StartPage", StartPage.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		setActivityInitialTouchMode(false);
		
		sActivity = getActivity();
	}
	
}
