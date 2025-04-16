package smarthome;

public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int previousTemp;
    private int newTemp;

    public SetThermostatCommand(Thermostat thermostat, int newTemp) {
        this.thermostat = thermostat;
        this.previousTemp = thermostat.getTemperature();
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(previousTemp);
    }
}
