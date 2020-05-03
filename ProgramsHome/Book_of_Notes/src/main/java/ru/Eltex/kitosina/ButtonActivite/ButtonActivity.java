package ru.Eltex.kitosina.ButtonActivite;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public abstract class ButtonActivity {

    @FXML
    protected abstract void addNotes(MouseEvent event) throws IOException;

    @FXML
    protected abstract void removeNotes(MouseEvent event);

    @FXML
    protected abstract void notesSheet(MouseEvent event);

    @FXML
    protected abstract void saveButtonEvent(MouseEvent event);

}
