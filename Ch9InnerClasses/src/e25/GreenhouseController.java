package e25;

import e24.Event;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControlsAddition addition = new GreenhouseControlsAddition();
        addition.addEvent(addition.new Bell(900));
        Event[] eventList = {
                addition.new ThermostatNight(0),
                addition.new LightOn(200),
                addition.new LightOff(400),
                addition.new WaterOn(600),
                addition.new WaterOff(800),
                addition.new ThermostatDay(1400),
                addition.new MistGeneratorOn(1600),
                addition.new MistGeneratorOff(1800)
        };
        addition.addEvent(addition.new Restart(2000, eventList));
        if (args.length == 1)
            addition.addEvent(new GreenhouseControlsAddition.Terminate(new Integer(args[0])));
        addition.run();
    }
}