package csc2a.sim.model;

import csc2a.sim.factory.IAquaticVehicle;

public class MannedAquaticVehicle implements IAquaticVehicle {

  @Override
  public void sail() {
    System.out.println("Movement Type : Sail \n Operator Type : Manned");
  }
}
