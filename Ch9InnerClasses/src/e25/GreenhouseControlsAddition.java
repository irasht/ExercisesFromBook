package e25;

import e24.*;

public class GreenhouseControlsAddition extends GreenhouseControls {
    private boolean mist = false;

    public class MistGeneratorOn extends Event {
        public MistGeneratorOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            mist = true;
        }

        public String toString() {
            return "Water mist generator is on";
        }
    }

    public class MistGeneratorOff extends Event {
        public MistGeneratorOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            mist = false;
        }

        public String toString() {
            return "Water mist generator is off";
        }
    }
}
