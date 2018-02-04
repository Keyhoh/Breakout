package mainGame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BreakoutMain extends Application{
	private BreakoutThread breakoutthread;

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("BREAKOUT");
		Pane pane = new Pane();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		Canvas canvas = new Canvas(GameVO.getCnvsWidth(), GameVO.getCnvsHeight());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);

		breakoutthread = new BreakoutThread(gc);
		breakoutthread.start();

		stage.show();
	}
}

class BreakoutThread extends AnimationTimer{
	private GraphicsContext gc;

	private int count;
	BallObj ball = new BallObj();

	BreakoutThread(GraphicsContext gc){
		this.gc = gc;

		count = 0;
		ball.setBall_x(10);
		ball.setBall_y(10);
		ball.setX_speed(1);
		ball.setY_speed(1);
	}

	@Override
	public void handle(long time) {
		gc.clearRect(0, 0, GameVO.getCnvsWidth(), GameVO.getCnvsHeight());

		gc.setFill(Color.BLACK);
		gc.fillOval(ball.getBall_x() -5, ball.getBall_y() - 5, 10, 10);

		gc.fillText("count = " + count, 450, 450);
		count++;
	}
}