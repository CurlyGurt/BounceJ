import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		particle newParticle = new particle();
		
		double force = 10.0;
		double acceleration = force / newParticle.mass;
		
		double time = 0.0;
		double deltaTime = 1.0;
		
		while(time <= 10.0) {
			System.out.println("Time: " + time + "\tPosition: " + newParticle.position + "\tVelocity: " + newParticle.velocity);

			newParticle.velocity += acceleration * deltaTime;
			newParticle.position += newParticle.velocity * deltaTime;
			
			time += deltaTime;
			//System.out.println("Time: " + time + "\tPosition: " + newParticle.position + "\tVelcoity: " + newParticle.velocity);
			
		}
		//System.out.println("Time: " + time + "\tPosition: " + newParticle.position + "\tVelcoity: " + newParticle.velocity);
	}
}
