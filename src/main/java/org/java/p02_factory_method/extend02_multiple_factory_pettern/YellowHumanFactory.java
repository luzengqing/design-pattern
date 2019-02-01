package org.java.p02_factory_method.extend02_multiple_factory_pettern;

import org.java.p02_factory_method.Human;
import org.java.p02_factory_method.YellowHuman;

/**
 * Created by lzq on 2018/3/21.
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
