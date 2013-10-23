package net.larry1123.elecentertainment.phantasm.html;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import net.larry1123.elecentertainment.phantasm.core.Main;

public class MainHtml extends GwtApplication {
    @Override
    public ApplicationListener getApplicationListener() {
        return new Main();
    }

    @Override
    public GwtApplicationConfiguration getConfig() {
        return new GwtApplicationConfiguration(480, 320);
    }
}
