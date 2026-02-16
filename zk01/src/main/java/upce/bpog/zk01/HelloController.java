package upce.bpog.zk01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("BPOG1 - Základ JavaFX/Maven aplikace s FXML v InteliJ");
    }
}