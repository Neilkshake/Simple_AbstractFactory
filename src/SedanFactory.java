public class SedanFactory extends MotorVehicleFactory{
    @Override
    protected IMotorVehicle createMotorVehicle() {
        return new Sedan();
    }
}
