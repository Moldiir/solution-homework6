package smarthome;

public class MainSmartHome {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightCommand = new TurnOnLightCommand(light);
        Command thermostatCommand = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightCommand);
        remote.setCommand("thermo", thermostatCommand);

        remote.pressButton("light");
        remote.pressButton("thermo");
        remote.undoButton();
    }
}
