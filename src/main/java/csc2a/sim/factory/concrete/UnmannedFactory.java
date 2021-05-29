package csc2a.sim.factory.concrete;

import csc2a.sim.factory.IAerialVehicle;
import csc2a.sim.factory.IAquaticVehicle;
import csc2a.sim.factory.IOperatorFactory;
import csc2a.sim.factory.ITerrestrialVehicle;
import csc2a.sim.model.UnmannedAerialVehicle;
import csc2a.sim.model.UnmannedAquaticVehicle;
import csc2a.sim.model.UnmannedTerrestrialVehicle;

public class UnmannedFactory implements IOperatorFactory {
    @Override
    public IAerialVehicle createAerialVehicle() {
        return new UnmannedAerialVehicle();
    }

    @Override
    public ITerrestrialVehicle createTerrestrialVehicle() {
        return new UnmannedTerrestrialVehicle();
    }

    @Override
    public IAquaticVehicle createAquaticVehicle() {
        return new UnmannedAquaticVehicle();
    }
}
