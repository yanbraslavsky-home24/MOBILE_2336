package com.speaker.lib;

/**
 * Created by yan.braslavski on 5/19/16.
 */
public class Speaker {

    private final Dynamic dynamic;

    public Speaker() {
        dynamic = new Dynamic();
    }

    public void speak(final String str){
        dynamic.produceOutput(str);
    }
}
