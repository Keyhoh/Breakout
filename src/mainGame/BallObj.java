package mainGame;

import lombok.Getter;
import lombok.Setter;

public class BallObj {

	@Getter
	@Setter
	private int ball_x;

	@Getter
	@Setter
	private int ball_y;

	@Getter
	@Setter
	private int x_speed;

	@Getter
	@Setter
	private int y_speed;

	public void ball_x(int x_speed, int y_speed) throws IllegalArgumentException {
		int x;

		x = this.getBall_x() + x_speed;

		this.setBall_x(x);
	}

	public void ball_y(int x_speed, int y_speed) throws IllegalArgumentException {
		int y;

		y = this.getBall_y() + y_speed;

		this.setBall_y(y);
	}

	public void x_speed(int x, int y) throws IllegalArgumentException {
		int speed;

		speed = x;

		setX_speed(speed);
	}

	public void y_speed(int x, int y) throws IllegalArgumentException {
		int speed;

		speed = y;

		setY_speed(speed);
	}
}
