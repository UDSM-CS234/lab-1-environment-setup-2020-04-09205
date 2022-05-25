public class Lab1 {
    public static void main(String[] args) {
        double acceleration = -9.81;
        double initial_position, velocity, time, final_position;
        initial_position = 0;
        velocity = 0;
        time = 10;
        final_position = 0.5 * acceleration * time * time + velocity * time + initial_position;
        System.out.println("Final position is:" +final_position);
    }
}
