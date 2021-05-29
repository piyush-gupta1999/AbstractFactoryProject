//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package csc2a.sim.factory.concrete;

import csc2a.sim.factory.IOperatorFactory;
import csc2a.sim.model.EOperatorType;

public class OperatorPicker {
    public OperatorPicker() {
    }

    public static IOperatorFactory makeFactory(EOperatorType type) {
        switch(type) {
            case MANNED:
                return new MannedFactory();
            case UNMANNED:
                return new UnmannedFactory();
            default:
                throw new IllegalArgumentException("EOperatorType not supported.");
        }
    }
}
