package org.java.p16_observer.t4_extension.extension2_;

import java.util.Observable;

/**
 * Created by lzq on 2018/4/4.
 */
public class Source extends Observable implements ISource {


    @Override
    public void doSomething() {
        super.setChanged();
        super.notifyObservers("hi, I am coming");
    }
}
