package ru.Eltex.kitosina.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ru.Eltex.kitosina.ButtonActivite.ButtonActivity;

import java.io.IOException;

public class Controller extends ButtonActivity {

    private AddNotesEventController addNotesEventController;
    private final ObservableMap<String, String> eventNotes = FXCollections.observableHashMap();

    @FXML
    private ListView<String> listEvent;

    @FXML
    private TextArea textNotes;

    @FXML
    private Label labelExceptionSave;

    @FXML
    private Button buttonRemoveNotes;

    @FXML
    private Button saveButton;

    public void setListEvent(ListView<String> listEvent) {
        this.listEvent = listEvent;
    }

    public ListView<String> getListEvent() {
        return listEvent;
    }

    @FXML
    public void notesSheet(MouseEvent event) {
        textNotes.setText(
                eventNotes.get(
                        listEvent.getSelectionModel().getSelectedItem()
                )
        );
    }

    @FXML
    public void saveButtonEvent(MouseEvent event) {

        String detailedEvent = textNotes.getText();

        if ((detailedEvent != "") && (listEvent.getItems().contains(
                listEvent.getSelectionModel().getSelectedItem()
                )
            )
        ) {
            System.out.println(listEvent.getItems());
            eventNotes.put(
                    listEvent.getSelectionModel().getSelectedItem().toString(), detailedEvent
            );
            labelExceptionSave.setText("EventNotepad");
        } else {
            labelExceptionSave.setText("The text will not find!".concat("\n Not found Event!"));
        }
    }

    @FXML
    @Override
    protected void addNotes(MouseEvent event) throws IOException {
        final FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/addNotesName.fxml"));
        Stage stageFind = new Stage();
        Parent root = loader.load();
        stageFind.setTitle("Add");
        stageFind.setResizable(false);
        stageFind.setScene(new Scene(root));
        stageFind.initModality(Modality.APPLICATION_MODAL);
        stageFind.show();

        addNotesEventController = loader.getController(); //получаем контроллер окна find_win.fxml
        addNotesEventController.setParentController(this);

    }

    @FXML
    @Override
    protected void removeNotes(MouseEvent event) {

        eventNotes.remove(
                listEvent.getSelectionModel().getSelectedItem()
        );

        listEvent.getItems().remove(
                listEvent.getSelectionModel().getSelectedItem()
        );

        textNotes.clear();

    }
}
