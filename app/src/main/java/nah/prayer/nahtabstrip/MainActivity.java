package nah.prayer.nahtabstrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nah.prayer.nahtabstriplib.NahTabStrip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NahTabStrip nahTabStrip = findViewById(R.id.tabStrip);
        nahTabStrip.setTitles("One", "Two", "HeyYo~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        nahTabStrip.setTabIndex(0, true);
    }
}

/*
final NahTabStrip nahTabStrip = (NahTabStrip) findViewById(R.id.nts);
nahTabStrip.setTitles("Nav", "Tab", "Strip");
nahTabStrip.setTabIndex(0, true);
nahTabStrip.setTitleSize(15);
nahTabStrip.setStripColor(Color.RED);
nahTabStrip.setStripWeight(6);
nahTabStrip.setStripFactor(2);
nahTabStrip.setStripType(NahTabStrip.StripType.LINE);
nahTabStrip.setStripGravity(NahTabStrip.StripGravity.BOTTOM);
nahTabStrip.setTypeface("fonts/typeface.ttf");
nahTabStrip.setCornersRadius(3);
nahTabStrip.setAnimationDuration(300);
nahTabStrip.setInactiveColor(Color.GRAY);
nahTabStrip.setActiveColor(Color.WHITE);
nahTabStrip.setOnPageChangeListener(...);
nahTabStrip.setOnTabStripSelectedIndexListener(...);
* */