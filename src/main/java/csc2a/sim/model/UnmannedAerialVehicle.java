package csc2a.sim.model;

import csc2a.sim.factory.IAerialVehicle;

public class UnmannedAerialVehicle implements IAerialVehicle {

  @Override
  public void fly() {
    System.out.println("Movement Type : Fly \n Operator Type : Unmanned");
  }
}
