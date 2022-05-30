import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.awt.*;

import static javafx.geometry.Pos.*;

public class TryAgainButton extends VBox {
    public TryAgainButton(EventHandler<ActionEvent> action) {
        Label gamerOver = new Label("GAMER OVER");
        gamerOver.setFont(Font.font(50));
        gamerOver.setTextFill(Color.RED);
        this.getChildren().add(gamerOver);

        Button tryAgain = new Button("Jogar Novamente");
        tryAgain.setFont(Font.font(25));

        tryAgain.setOnAction(action);
        this.getChildren().add(tryAgain);


        this.setMinWidth(Config.WIDTH);
        this.setMinHeight(Config.HEIGHT );
        this.setAlignment(CENTER);




    }
}
