package rubix.com.theincredibleme.application;

import rubix.com.theincredibleme.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class Application extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("seogue.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

}
