public class SUVFactory extends MotorVehicleFactory {
        @Override
        protected IMotorVehicle createMotorVehicle() {
            return new SUV();
        }
    }


