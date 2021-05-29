package csc2a.sim.model;

import csc2a.sim.factory.ITerrestrialVehicle;

public class MannedTerrestrialVehicle implements ITerrestrialVehicle {

  @Override
  public void drive() {
    System.out.println("Movement Type : Drive \n Operator Type : Manned");
  }
}
