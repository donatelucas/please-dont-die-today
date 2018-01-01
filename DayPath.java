import javafx.scene.canvas.GraphicsContext;
import javafx.animation.PathTransition;
import javafx.scene.shape.CubicCurveTo;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.animation.Timeline;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;

public class DayPath extends Application {
 //x and y coordinated of the nodes
  // 0,1,2,3,4
    int[] setX = {122, 195, 261, 325, 390, 455, 457, 665, 718, 835};
    int[] setY = {313, 312, 311, 310, 309, 307, 337, 335, 326, 325};

    @Override public void start(Stage stage)
    {
        // load the image
        Image image = new Image("file:UpdatedMap.png");

        // Adds a Canvas
        Canvas canvas = new Canvas(400, 300);

        // Call getGraphicsContext2D
        GraphicsContext gc = canvas.getGraphicsContext2D();

        ImageView imageView1 = new ImageView();
        imageView1.setImage(image);
        imageView1.setFitWidth(1000);
        imageView1.setFitHeight(1000);
        imageView1.setPreserveRatio(true);
        imageView1.setSmooth(true);
        imageView1.setCache(true);

        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Color.BLACK);
        HBox box = new HBox();
        box.getChildren().add(imageView1);
        root.getChildren().add(box);
        root.getChildren().add(canvas);

        // Add the nodes
        // Nodes 1-10 map N. Clark St. moving top to bottom
        Circle node1 = new Circle();
        Circle node2 = new Circle();
        Circle node3 = new Circle();
        Circle node4 = new Circle();
        Circle node5 = new Circle();
        Circle node6 = new Circle();
        Circle node7 = new Circle();
        Circle node8 = new Circle();
        Circle node9 = new Circle();
        Circle node10 = new Circle();

        // Nodes 11-18 map N. Ashland St. moving top to bottom & then the second ashland &pratt
        Circle node11 = new Circle();
        Circle node12 = new Circle();
        Circle node13 = new Circle();
        Circle node14 = new Circle();
        Circle node15 = new Circle();
        Circle node16 = new Circle();
        Circle node17 = new Circle();
        Circle node18 = new Circle();

        // Nodes 19-25 map N. Bosworth Ave. moving top to bottom
        Circle node19 = new Circle();
        Circle node20 = new Circle();
        Circle node21 = new Circle();
        Circle node22 = new Circle();
        Circle node23 = new Circle();
        Circle node24 = new Circle();
        Circle node25 = new Circle();

        // Nodes 37-44 map N. Glenwood Ave. moving top to bottom
        Circle node37 = new Circle();
        Circle node38 = new Circle();
        Circle node39 = new Circle();
        Circle node40 = new Circle();
        Circle node41 = new Circle();
        Circle node42 = new Circle();
        Circle node43 = new Circle();
        Circle node44 = new Circle();

        // Nodes 45 map N. Lakewood Ave. moving top to bottom
        Circle node45 = new Circle();
        Circle node46 = new Circle();
        Circle node47 = new Circle();
        Circle node48 = new Circle();
        Circle node49 = new Circle();
        Circle node50 = new Circle();
        Circle node51 = new Circle();

        //Node 52-53 is Winthrop Ave
        Circle node52 = new Circle();
        Circle node53 = new Circle();
        Circle node54 = new Circle();

        //Node 55-56 is Magnolia
         Circle node55 = new Circle();
         Circle node56 = new Circle();

         //57-64 are new missed nodes
         Circle node57 = new Circle();
         Circle node58 = new Circle();
         Circle node59 = new Circle();
         Circle node60 = new Circle();
         Circle node61 = new Circle();
         Circle node62 = new Circle();
         Circle node63 = new Circle();
         Circle node64 = new Circle();

        // Node 100 - 115 is W Devon Ave. moving from right to left

        Circle node100 = new Circle();
        Circle node101 = new Circle();
        Circle node102 = new Circle();
        Circle node103 = new Circle();
        Circle node104 = new Circle();
        Circle node105 = new Circle();
        Circle node106 = new Circle();
        Circle node107 = new Circle();
        Circle node108 = new Circle();
        Circle node109 = new Circle();
        Circle node110 = new Circle();
        Circle node111 = new Circle();
        Circle node112 = new Circle();
        Circle node113 = new Circle();
        Circle node114 = new Circle();
        Circle node115 = new Circle();

        // Node 116-121 is N Sheridan Rd. from bottom to top

        Circle node116 = new Circle();
        Circle node117 = new Circle();
        Circle node118 = new Circle();
        Circle node119 = new Circle();
        Circle node120 = new Circle();
        Circle node121 = new Circle();

        //nodes 200-203 map N. Greenview St. moving top to bottom
        //top is lower number and bottom is higher numbers

        Circle node208 = new Circle(); //number out of order because was missed earlier

        Circle node200 = new Circle();
        Circle node201 = new Circle();
        Circle node202 = new Circle();

        Circle node209 = new Circle(); //number out of order because was missed earlier

        Circle node204 = new Circle();
        Circle node205 = new Circle();
        Circle node206 = new Circle();

        //Clark & Pratt
        node1.setCenterX(57);
        node1.setCenterY(51);
        node1.setRadius(5);
        root.getChildren().add(node1);

        node2.setCenterX(73);
        node2.setCenterY(118);
        node2.setRadius(5);
        root.getChildren().add(node2);

        node3.setCenterX(88);
        node3.setCenterY(182);
        node3.setRadius(5);
        root.getChildren().add(node3);

        node4.setCenterX(105);
        node4.setCenterY(247);
        node4.setRadius(5);
        root.getChildren().add(node4);

        //Clark & Albion
        node5.setCenterX(122);
        node5.setCenterY(313);
        node5.setRadius(5);
        root.getChildren().add(node5);

        node6.setCenterX(143);
        node6.setCenterY(396);
        node6.setRadius(5);
        root.getChildren().add(node6);

        node7.setCenterX(157);
        node7.setCenterY(443);
        node7.setRadius(5);
        root.getChildren().add(node7);

        node8.setCenterX(168);
        node8.setCenterY(495);
        node8.setRadius(5);
        root.getChildren().add(node8);

        node9.setCenterX(173);
        node9.setCenterY(513);
        node9.setRadius(5);
        root.getChildren().add(node9);

        node10.setCenterX(189);
        node10.setCenterY(576);
        node10.setRadius(5);
        root.getChildren().add(node10);

        //Ashland & Pratt
        node11.setCenterX(187);
        node11.setCenterY(47);
        node11.setRadius(5);
        root.getChildren().add(node11);


        //Ashland & Columbia
        node13.setCenterX(191);//left right
        node13.setCenterY(116);//up down
        node13.setRadius(5);
        root.getChildren().add(node13);

       //Ashland & North Shore
        node14.setCenterX(192);//left right
        node14.setCenterY(180);//up down
        node14.setRadius(5);
        root.getChildren().add(node14);

        //Ashland & Wallen
        node15.setCenterX(193);//left right
        node15.setCenterY(245);//up down
        node15.setRadius(5);
        root.getChildren().add(node15);

        //Ashland & Albion
        node16.setCenterX(195);//left right
        node16.setCenterY(312);//up down
        node16.setRadius(5);
        root.getChildren().add(node16);

        //Ashland & Arthur
        node17.setCenterX(197);//left right
        node17.setCenterY(442);//up down
        node17.setRadius(5);
        root.getChildren().add(node17);

        //Ashland & Pratt middle street
        node18.setCenterX(224);//left right
        node18.setCenterY(47);//up down
        node18.setRadius(5);
        root.getChildren().add(node18);

        //Bosworth & Pratt
        node19.setCenterX(256);//left right
        node19.setCenterY(47);//up down
        node19.setRadius(5);
        root.getChildren().add(node19);

        //Bosworth & North Shore
        node21.setCenterX(258);//left right
        node21.setCenterY(178);//up down
        node21.setRadius(5);
        root.getChildren().add(node21);

        //Bosworth & Albion
        node22.setCenterX(261);//left right
        node22.setCenterY(311);//up down
        node22.setRadius(5);
        root.getChildren().add(node22);

        //Bosworth & Arthur
        node23.setCenterX(263);//left right
        node23.setCenterY(442);//up down
        node23.setRadius(5);
        root.getChildren().add(node23);

        //Bosworth & Schreiber
        node24.setCenterX(265);//left right
        node24.setCenterY(509);//up down
        node24.setRadius(5);
        root.getChildren().add(node24);

        //Glenwood & Pratt
        node37.setCenterX(448);//left right
        node37.setCenterY(41);//up down
        node37.setRadius(5);
        root.getChildren().add(node37);

        //Glenwood & Collumbia
        node38.setCenterX(453);//left right
        node38.setCenterY(114);//up down
        node38.setRadius(5);
        root.getChildren().add(node38);

        //Glenwood & North Shore
        node39.setCenterX(453);//left right
        node39.setCenterY(178);//up down
        node39.setRadius(5);
        root.getChildren().add(node39);

        //Glenwood & Albion1
        node40.setCenterX(455);//left right
        node40.setCenterY(261);//up down
        node40.setRadius(5);
        root.getChildren().add(node40);

        //Glenwood & Albion2
        node41.setCenterX(455);//left right
        node41.setCenterY(307);//up down
        node41.setRadius(5);
        root.getChildren().add(node41);

        //Glenwood & Loyola
        node42.setCenterX(457);//left right
        node42.setCenterY(337);//up down
        node42.setRadius(5);
        root.getChildren().add(node42);

        //Glenwood & Arthur1
        node43.setCenterX(459);//left right
        node43.setCenterY(410);//up down
        node43.setRadius(5);
        root.getChildren().add(node43);

        //Glenwood & Arthur2
        node44.setCenterX(459);//left right
        node44.setCenterY(442);//up down
        node44.setRadius(5);
        root.getChildren().add(node44);

        //Lakewood & Pratt
        node45.setCenterX(563);//left right
        node45.setCenterY(41);//up down
        node45.setRadius(5);
        root.getChildren().add(node45);

        //Lakewood & Collumbia
        node46.setCenterX(563);//left right
        node46.setCenterY(111);//up down
        node46.setRadius(5);
        root.getChildren().add(node46);

        //Lakewood & NorthShore
        node47.setCenterX(565);//left right
        node47.setCenterY(183);//up down
        node47.setRadius(5);
        root.getChildren().add(node47);

        //Lakewood & Albion
        node48.setCenterX(595);//left right
        node48.setCenterY(255);//up down
        node48.setRadius(5);
        root.getChildren().add(node48);

        //Lakewood & Arthur1
        node49.setCenterX(591);//left right
        node49.setCenterY(408);//up down
        node49.setRadius(5);
        root.getChildren().add(node49);

        //Lakewood & Arthur2
        node50.setCenterX(591);//left right
        node50.setCenterY(440);//up down
        node50.setRadius(5);
        root.getChildren().add(node50);

        //Wayne & Arthur
        node51.setCenterX(525);//left right
        node51.setCenterY(408);//up down
        node51.setRadius(5);
        root.getChildren().add(node51);

        //Wayne & Arthur2
        node52.setCenterX(525);//left right
        node52.setCenterY(440);//up down
        node52.setRadius(5);
        root.getChildren().add(node52);

        //Loyola & Winthrop
        node53.setCenterX(835);//left right
        node53.setCenterY(325);//up down
        node53.setRadius(5);
        root.getChildren().add(node53);

        //Albion & Winthrop
        node54.setCenterX(835);//left right
        node54.setCenterY(250);//up down
        node54.setRadius(5);
        root.getChildren().add(node54);

        //Magnolia & Arthur
        node55.setCenterX(658);//left right
        node55.setCenterY(408);//up down
        node55.setRadius(5);
        root.getChildren().add(node55);

        //Magnolia & Arthur2
        node56.setCenterX(658);//left right
        node56.setCenterY(440);//up down
        node56.setRadius(5);
        root.getChildren().add(node56);

        //Sheridan & Pratt
        node58.setCenterX(710);//left right
        node58.setCenterY(35);//up down
        node58.setRadius(5);
        root.getChildren().add(node58);

        //Lakewood & Albion 2
        node59.setCenterX(568);//left right
        node59.setCenterY(261);//up down
        node59.setRadius(5);
        root.getChildren().add(node59);

        //Lakewood & Loyola
        node60.setCenterX(570);//left right
        node60.setCenterY(337);//up down
        node60.setRadius(5);
        root.getChildren().add(node60);

        //Loyola & Loyola
        node61.setCenterX(665);//left right
        node61.setCenterY(335);//up down
        node61.setRadius(5);
        root.getChildren().add(node61);

        // Greenview & Schrieber
        node62.setCenterX(330);//left right
        node62.setCenterY(509);//up down
        node62.setRadius(5);
        root.getChildren().add(node62);

        // 7/11 Sheridan & Sheridan
        node63.setCenterX(767);//left right
        node63.setCenterY(562);//up down
        node63.setRadius(5);
        root.getChildren().add(node63);

        // Chase Bank Sheridan & Sheridan
        node64.setCenterX(730);//left right
        node64.setCenterY(524);//up down
        node64.setRadius(5);
        root.getChildren().add(node64);

        node100.setCenterX(99);
        node100.setCenterY(578);
        node100.setRadius(5);
        root.getChildren().add(node100);

        node101.setCenterX(116);
        node101.setCenterY(578);
        node101.setRadius(5);
        root.getChildren().add(node101);

        node102.setCenterX(153);
        node102.setCenterY(577);
        node102.setRadius(5);
        root.getChildren().add(node102);

        node103.setCenterX(215);
        node103.setCenterY(576);
        node103.setRadius(5);
        root.getChildren().add(node103);

        node104.setCenterX(266);
        node104.setCenterY(574);
        node104.setRadius(5);
        root.getChildren().add(node104);

        node105.setCenterX(300);
        node105.setCenterY(574);
        node105.setRadius(5);
        root.getChildren().add(node105);

        node106.setCenterX(330);
        node106.setCenterY(573);
        node106.setRadius(5);
        root.getChildren().add(node106);

        node107.setCenterX(396);
        node107.setCenterY(572);
        node107.setRadius(5);
        root.getChildren().add(node107);

        node108.setCenterX(430);
        node108.setCenterY(571);
        node108.setRadius(5);
        root.getChildren().add(node108);

       //Devon & Glenwood
        node109.setCenterX(463);
        node109.setCenterY(571);
        node109.setRadius(5);
        root.getChildren().add(node109);

        //Devon & Wayne
        node110.setCenterX(530);
        node110.setCenterY(571);
        node110.setRadius(5);
        root.getChildren().add(node110);

        //Devon & Lakewood
        node111.setCenterX(596);
        node111.setCenterY(570);
        node111.setRadius(5);
        root.getChildren().add(node111);

        //Devon & Magnolia
        node112.setCenterX(660);
        node112.setCenterY(570);
        node112.setRadius(5);
        root.getChildren().add(node112);

        //Devon & Broadway
        node113.setCenterX(731);
        node113.setCenterY(568);
        node113.setRadius(5);
        root.getChildren().add(node113);

        //Sheridan & Winthrop
        node114.setCenterX(833);
        node114.setCenterY(566);
        node114.setRadius(5);
        root.getChildren().add(node114);

        //Sheridan & Kenmore
        node115.setCenterX(917);
        node115.setCenterY(565);
        node115.setRadius(5);
        root.getChildren().add(node115);

        //Sheridan & Arthur
        node116.setCenterX(719);
        node116.setCenterY(406);
        node116.setRadius(5);
        root.getChildren().add(node116);

        //Sheridan & Loyola
        node117.setCenterX(718);
        node117.setCenterY(326);
        node117.setRadius(5);
        root.getChildren().add(node117);

        //Sheridan & Albion
        node118.setCenterX(717);
        node118.setCenterY(252);
        node118.setRadius(5);
        root.getChildren().add(node118);

        //Sheridan & NorthShore
        node119.setCenterX(715);
        node119.setCenterY(179);
        node119.setRadius(5);
        root.getChildren().add(node119);

       //Sheridan & Columbia
        node120.setCenterX(714);
        node120.setCenterY(105);
        node120.setRadius(5);
        root.getChildren().add(node120);

        //NorthShore & Greenview
        node200.setCenterX(323);
        node200.setCenterY(178);
        node200.setRadius(5);
        root.getChildren().add(node200);

        //Albion & Greenview
        node201.setCenterX(325);
        node201.setCenterY(310);
        node201.setRadius(5);
        root.getChildren().add(node201);

        //Greenview & Arthur
        node202.setCenterX(328);
        node202.setCenterY(443);
        node202.setRadius(5);
        root.getChildren().add(node202);

        //Newgard & Northshore
        node204.setCenterX(387);
        node204.setCenterY(176);
        node204.setRadius(5);
        root.getChildren().add(node204);

        //Newgard & Albion
        node205.setCenterX(390);
        node205.setCenterY(309);
        node205.setRadius(5);
        root.getChildren().add(node205);

        //Newgard & Arthur
        node206.setCenterX(393);
        node206.setCenterY(443);
        node206.setRadius(5);
        root.getChildren().add(node206);

        //Greenview and Pratt
        node208.setCenterX(320);
        node208.setCenterY(45);
        node208.setRadius(5);
        root.getChildren().add(node208);

        //Newgard and Pratt
        node209.setCenterX(384);
        node209.setCenterY(45);
        node209.setRadius(5);
        root.getChildren().add(node209);

        stage.setTitle("Please Don't Die Today");
        stage.setWidth(415);
        stage.setHeight(200);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();


    Circle circle = new Circle(100, 300, 10);
    circle.setFill(Color.DARKBLUE);
    //pathing animation part
    Path path = new Path();
    path.setStroke(Color.CYAN);
    path.setStrokeWidth(10);

    path.getElements().add(new MoveTo(setX[0], setY[0]));
    path.getElements().add(new LineTo(setX[1], setY[1]));
    path.getElements().add(new LineTo(setX[2], setY[2]));
    path.getElements().add(new LineTo(setX[3], setY[3]));
    path.getElements().add(new LineTo(setX[4], setY[4]));
    path.getElements().add(new LineTo(setX[5], setY[5]));
    path.getElements().add(new LineTo(setX[6], setY[6]));
    path.getElements().add(new LineTo(setX[7], setY[7]));
    path.getElements().add(new LineTo(setX[8], setY[8]));
    path.getElements().add(new LineTo(setX[9], setY[9]));

    path.setOpacity(0.4);

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

    public static void main(String[] args)
    {
        launch(args);
    }
}
