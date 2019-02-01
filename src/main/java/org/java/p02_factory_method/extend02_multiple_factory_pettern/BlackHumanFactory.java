package org.java.p02_factory_method.extend02_multiple_factory_pettern;

import org.java.p02_factory_method.BlackHuman;
import org.java.p02_factory_method.Human;

/**
 * Created by lzq on 2018/3/21.
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
