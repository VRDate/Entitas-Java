package com.ilargia.games.egdx;


import com.ilargia.games.egdx.interfaces.EventBus;
import net.engio.mbassy.bus.MBassador;

public class EGEventBus implements EventBus {

    public MBassador ebus;

    public EGEventBus(MBassador ebus) {
        this.ebus = ebus;
    }

    @Override
    public<E> void post(E event) {
        ebus.post(event);
    }

    @Override
    public <L> void subscribe(L listener) {
        ebus.subscribe (listener);
    }
}
