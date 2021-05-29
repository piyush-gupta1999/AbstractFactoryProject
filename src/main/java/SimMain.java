//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import csc2a.sim.factory.IAerialVehicle;
import csc2a.sim.factory.IAquaticVehicle;
import csc2a.sim.factory.IOperatorFactory;
import csc2a.sim.factory.ITerrestrialVehicle;
import csc2a.sim.factory.concrete.OperatorPicker;
import csc2a.sim.model.EOperatorType;
import java.util.ArrayList;
import java.util.Iterator;

public class SimMain {
    public SimMain() {
    }

    public static void main(String[] args) {
        ArrayList<IAerialVehicle> airforce = new ArrayList<>();
        ArrayList<ITerrestrialVehicle> army = new ArrayList<>();
        ArrayList<IAquaticVehicle> navy = new ArrayList<>();
        EOperatorType[] operators = EOperatorType.values();
        EOperatorType[] var8 = operators;
        int var7 = operators.length;

        for(int var6 = 0; var6 < var7; ++var6) {
            EOperatorType operator = var8[var6];
            IOperatorFactory operatorFactory = OperatorPicker.makeFactory(operator);

            int i;
            for(i = 0; i < 5; ++i) {
                airforce.add(operatorFactory.createAerialVehicle());
            }

            for(i = 0; i < 2; ++i) {
                army.add(operatorFactory.createTerrestrialVehicle());
            }

            for(i = 0; i < 3; ++i) {
                navy.add(operatorFactory.createAquaticVehicle());
            }
        }

        Iterator var14 = airforce.iterator();

        while(var14.hasNext()) {
            IAerialVehicle aircraft = (IAerialVehicle)var14.next();
            aircraft.fly();
        }

        var14 = army.iterator();

        while(var14.hasNext()) {
            ITerrestrialVehicle groundcraft = (ITerrestrialVehicle)var14.next();
            groundcraft.drive();
        }

        var14 = navy.iterator();

        while(var14.hasNext()) {
            IAquaticVehicle watercraft = (IAquaticVehicle)var14.next();
            watercraft.sail();
        }

    }
}
