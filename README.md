# solution-homework6

This is an educational project that implements two design patterns in different parts of the program: **Chain of Responsibility** and **Command Pattern**.

## Project Structure

The project consists of two parts:

### 1. **Chain of Responsibility** (Part 1: Tech Support)
A module that implements the **Chain of Responsibility** pattern for tech support. User issues are passed through a chain of handlers, with each handler deciding whether it can handle the issue or pass it along to the next handler.

#### Files:
- **SupportHandler.java** — Abstract class for all request handlers.
- **FAQBotHandler.java** — Handler for simple issues (e.g., password reset).
- **JuniorSupportHandler.java** — Handler for more complex issues (e.g., refunds, billing inquiries).
- **SeniorSupportHandler.java** — Handler for critical issues (e.g., account bans, data loss).
- **MainSupport.java** — Main class to run the tech support system with an example of usage.

### 2. **Command Pattern** (Part 2: Smart Home)
A module that implements the **Command Pattern** for controlling a smart home. Each command (e.g., turning on the lights or changing the temperature) is encapsulated into an object, allowing easy addition of new commands and undo/redo functionality.

#### Files:
- **Command.java** — Interface for all commands.
- **TurnOnLightCommand.java** — Command to turn on the light.
- **SetThermostatCommand.java** — Command to set the thermostat temperature.
- **SmartHomeRemoteControl.java** — Class that manages the execution of commands.
- **Light.java** — Class representing the light in the smart home.
- **Thermostat.java** — Class representing the thermostat in the smart home.
- **MainSmartHome.java** — Main class to run the smart home system with examples of commands.

