package net.larry1123.elec.phantasm.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.larry1123.elec.phantasm.core.Main;

public class MainDesktop {

    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.useGL30 = true;
        new LwjglApplication(new Main(), config);
    }
}
