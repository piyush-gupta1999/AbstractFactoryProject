package csc2a.sim.factory.concrete;

import csc2a.sim.factory.IAerialVehicle;
import csc2a.sim.factory.IAquaticVehicle;
import csc2a.sim.factory.IOperatorFactory;
import csc2a.sim.factory.ITerrestrialVehicle;
import csc2a.sim.model.MannedAerialVehicle;
import csc2a.sim.model.MannedAquaticVehicle;
import csc2a.sim.model.MannedTerrestrialVehicle;

public class MannedFactory implements IOperatorFactory {
    @Override
    public IAerialVehicle createAerialVehicle() {
        return new MannedAerialVehicle();
    }

    @Override
    public ITerrestrialVehicle createTerrestrialVehicle() {
        return new MannedTerrestrialVehicle();

    }

    @Override
    public IAquaticVehicle createAquaticVehicle() {
        return new MannedAquaticVehicle();
    }
}
