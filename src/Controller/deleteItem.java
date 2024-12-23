package Controller;

import DBConnection.DBConnection;
import Model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class deleteItem {
    public TextField txtId;

    public void btnViewTableOnAction(ActionEvent actionEvent) {
        DBConnection.getInstance().getConnection().removeIf(ob -> txtId.getText().equals(ob.getItemId()));
        System.out.println("Item with ID " + txtId + " has been deleted.");


    }
  }
