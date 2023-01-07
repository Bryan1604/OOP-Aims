package hust.soict.dsai.javafx;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class PainterController {
    private Pane drawingAreaPane;
    void clearButtonPressed(ActionEvent event){
        //implement clear of canvas
        drawingAreaPane.getChildren().clear();
    }

    void drawingAreaMouseDragged(MouseEvent event){
        //implement drawing
        Circle newCircle = new Circle(event.getX(),event.getY(),
                4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
