package org.java.p02_factory_method.extend02_multiple_factory_pettern;

import org.java.p02_factory_method.Human;
import org.java.p02_factory_method.WhiteHuman;

/**
 * Created by lzq on 2018/3/21.
 */
public class WhiteHumanFactory extends AbstractHumanFactory {


    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
