import javafx.scene.canvas.GraphicsContext;
import javafx.animation.PathTransition;
import javafx.scene.shape.CubicCurveTo;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.ArcType;
import javafx.scene.image.Image;
import javafx.animation.Timeline;
import javafx.scene.shape.Circle;
import javafx.scene.shape.MoveTo;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import java.util.Scanner;

public class PDDT extends Application
{
    static int[] setXCoor = new int[12];
    static int[] setYCoor = new int[12];
    Path path = new Path();
    Group root = new Group();
    Scene scene = new Scene(root);

@Override
public void start(Stage stage) throws Exception
{
    // Loads background image
    Image image = new Image("file:BackgroundWithNodes.png");

    // Adds where we are drawing things
    Canvas canvas = new Canvas(400, 300);

    // Establish connection with all the good shenanigans from getGraphicsContext2D
    GraphicsContext gc = canvas.getGraphicsContext2D();

    ImageView imageView1 = new ImageView();
    imageView1.setImage(image);
    imageView1.setFitWidth(1000);
    imageView1.setFitHeight(1000);
    imageView1.setPreserveRatio(true);
    imageView1.setSmooth(true);
    imageView1.setCache(true);

    scene.setFill(Color.BLACK);
    HBox box = new HBox();
    box.getChildren().add(imageView1);
    root.getChildren().add(box);
    root.getChildren().add(canvas);

    Circle node0 = new Circle(); //Glenwood & NorthShore
    node0.setCenterX(453);
    node0.setCenterY(178);
    node0.setRadius(5);
    root.getChildren().add(node0);

    Circle node1 = new Circle(); //Lakewood & NorthShore
    node1.setCenterX(565);
    node1.setCenterY(183);
    node1.setRadius(5);
    root.getChildren().add(node1);

    Circle node2 = new Circle(); // Unnamed & NorthShore
    node2.setCenterX(677);
    node2. setCenterY(181);
    node2.setRadius(5);
    root.getChildren().add(node2);

    Circle node3 = new Circle(); //Sheridan & Loyola
    node3.setCenterX(715);
    node3.setCenterY(179);
    node3.setRadius(5);
    root.getChildren().add(node3);

    Circle node4 = new Circle(); //Glenwood & Albion
    node4.setCenterX(455);
    node4.setCenterY(261);
    node4.setRadius(5);
    root.getChildren().add(node4);

    Circle node5 = new Circle(); //Lakewood & Albion2 (the right one)
    node5.setCenterX(595);
    node5.setCenterY(255);
    node5.setRadius(5);
    root.getChildren().add(node5);

    Circle node6 = new Circle(); //Lakewood & Albion1 (the left one)
    node6.setCenterX(568);
    node6.setCenterY(261);
    node6.setRadius(5);
    root.getChildren().add(node6);

    Circle node7 = new Circle(); //Sheridan & Albion
    node7.setCenterX(717);
    node7.setCenterY(252);
    node7.setRadius(5);
    root.getChildren().add(node7);

    Circle node8 = new Circle(); //Glenwood & Loyola
    node8.setCenterX(457);
    node8.setCenterY(337);
    node8.setRadius(5);
    root.getChildren().add(node8);

    Circle node9 = new Circle(); //Lakewood & Loyola
    node9.setCenterX(570);
    node9.setCenterY(337);
    node9.setRadius(5);
    root.getChildren().add(node9);

    Circle node10 = new Circle(); //Loyola & Loyola
    node10.setCenterX(665);
    node10.setCenterY(335);
    node10.setRadius(5);
    root.getChildren().add(node10);

    Circle node11 = new Circle(); //Sheridan & Northshore
    node11.setCenterX(718);
    node11.setCenterY(326);
    node11.setRadius(5);
    root.getChildren().add(node11);

    stage.setTitle("Please Don't Die Today");
    stage.setWidth(415);
    stage.setHeight(200);
    stage.setScene(scene);
    stage.sizeToScene();
    stage.show();

    path.setStroke(Color.RED);
    path.setStrokeWidth(10);

    Circle circle = new Circle(getXCoor(0), getYCoor(0), 10);
    circle.setFill(Color.DARKRED);

    path.getElements().add(new MoveTo(getXCoor(0), getYCoor(0)));

    for (int i = 1; i < 12; i++)
        path.getElements().add(new LineTo(getXCoor(i), getYCoor(i)));

    path.setOpacity(0.5);


    root.getChildren().add(path);
    root.getChildren().add(circle);

    final PathTransition pathTransition = new PathTransition();

    pathTransition.setDuration(Duration.seconds(8.0));
    pathTransition.setDelay(Duration.seconds(.5));
    pathTransition.setPath(path);
    pathTransition.setNode(circle);
    pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
    pathTransition.setCycleCount(Timeline.INDEFINITE);
    pathTransition.play();
    }

    public int getXCoor(int index) {
        return setXCoor[index];
    }

    public int getYCoor(int index) {
        return setYCoor[index];
    }

    public void setXArray(int[] oldX) {
        for (int i = 0; i < 12; i++) {
            setXCoor[i] = oldX[i];
        }
    }

    public void setYArray(int[] oldY) {
        for (int i = 0; i < 12; i++) {
            setYCoor[i] = oldY[i];
        }
    }

  public static void main(final String[] args)
  {

                            //      0  1  2   3  4  5   6   7   8  9  10 11
      int graph[][] = new int [][]{{0, 6, 0,  0, 5, 0,  0,  0,  0, 0, 0, 0},   // 0
                                   {2, 0, 10, 0, 0, 15, 0,  0,  0, 0, 0, 0},   // 1
                                   {0, 6, 0,  4, 0, 0,  25, 0,  0, 0, 0, 0},   // 2
                                   {0, 0, 10, 0, 0, 0,  0,  10, 0, 0, 0, 0},   // 3
                                   {2, 0, 0,  0, 0, 15, 0,  0,  1, 0, 0, 0},   // 4
                                   {0, 6, 0,  0, 5, 0,  25, 0,  0, 3, 0, 0},   // 5
                                   {0, 0, 10, 0, 0, 15, 0,  10, 0, 0, 5, 0},   // 6
                                   {0, 0, 0,  4, 0, 0,  25, 0,  0, 0, 0, 2},   // 7
                                   {0, 0, 0,  0, 5, 0,  0,  0,  0, 3, 0, 0},   // 8
                                   {0, 0, 0,  0, 0, 15, 0,  0,  1, 0, 5, 0},   // 9
                                   {0, 0, 0,  0, 0, 0,  25, 0,  0, 3, 0, 2},   // 10
                                   {0, 0, 0,  0, 0, 0,  0,  10, 0, 0, 5, 0}};  // 11

    PDDT pd = new PDDT();
    SafestPath sp = new SafestPath(); // Makes the safest path
    GetIndex gi = new GetIndex(); // Makes the index class
    Scanner sourceScanner = new Scanner(System.in);

    System.out.println("Please enter source");

    int source;
    source = sourceScanner.nextInt();

    System.out.println("Please enter destination");

    int destination;
    destination = sourceScanner.nextInt();

    sp.dijkstra(graph, source);

    int[] oldX = new int[] {453, 455, 457, 570, 665, 718, 718, 718, 718, 718, 718, 718};
    int[] oldY = new int[] {178, 261, 337, 337, 335, 326, 326, 326, 326, 326, 326, 326};

    pd.setXArray(oldX);
    pd.setYArray(oldY);

    for(int i = 0; i < oldX.length; i++) {
        pd.getXCoor(i);
        pd.getYCoor(i);
    }

    Application.launch(args);
  }
}
