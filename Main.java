import java.util.ArrayList;

import csc2a.sim.factory.IAerialVehicle;
import csc2a.sim.factory.IAquaticVehicle;
import csc2a.sim.factory.IOperatorFactory;
import csc2a.sim.factory.ITerrestrialVehicle;
import csc2a.sim.factory.concrete.OperatorPicker;
import csc2a.sim.factory.concrete.MannedFactory;
import csc2a.sim.factory.concrete.UnmannedFactory;
import csc2a.sim.model.EOperatorType;

/**
 * Main class of program
 */
public class Main
{

	/**
	 * Main entry point for the program
	 * 
	 * @param args
	 *          Command line arguments (not required)
	 */
	public static void main(String[] args)
	{
		// Lists for different vehicle types
		ArrayList<IAerialVehicle> airforce = new ArrayList<>();
		ArrayList<ITerrestrialVehicle> army = new ArrayList<>();
		ArrayList<IAquaticVehicle> navy = new ArrayList<>();

		// Get available operator types
		EOperatorType[] operators = EOperatorType.values();
		// For each operator type
		for (EOperatorType operator : operators)
		{
			// Get correct factory
			IOperatorFactory operatorFactory = OperatorPicker.makeFactory(operator);
			// Produce some aerial vehicles
			for (int i = 0; i < 5; i++)
			{
				airforce.add(operatorFactory.createAerialVehicle());
			}
			// Produce some terrestrial vehicles
			for (int i = 0; i < 2; i++)
			{
				army.add(operatorFactory.createTerrestrialVehicle());
			}
			// Produce some aquatic vehicles
			for (int i = 0; i < 3; i++)
			{
				navy.add(operatorFactory.createAquaticVehicle());
			}
		}

		// Simulate air force
		for (IAerialVehicle aircraft : airforce)
		{
			aircraft.fly();
		}
		// Simulate army 
		for (ITerrestrialVehicle groundcraft : army)
		{
			groundcraft.drive();
		}
		// Simulate navy
		for (IAquaticVehicle watercraft: navy)
		{
			watercraft.sail();
		}
	}
}
