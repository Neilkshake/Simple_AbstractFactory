
public abstract class MotorVehicleFactory {
    public IMotorVehicle create() {
        IMotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;

    }

    protected abstract IMotorVehicle createMotorVehicle();
}