package ru.Eltex.kitosina.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AddNotesEventController {

    private Controller controller;

    private ListView<String> listEvent;

    @FXML
    private Button buttonAddEvent;

    @FXML
    private TextArea nameEvent;

    @FXML
    private Label labelExceptionInput;

    public void setParentController(Controller controller) {
        this.controller = controller;
    }

    @FXML
    void addEvent(MouseEvent event) throws IOException {

        String name = nameEvent.getText();
        this.listEvent = controller.getListEvent();
        if ((name.length() != 0) && !(listEvent.getItems().contains(name))) {
            listEvent.getItems().add(name);
            controller.setListEvent(listEvent);
            labelExceptionInput.setText("Add successfully!");
        } else labelExceptionInput.setText("Input name event! / Name busy!");

    }
}
