package Controller;

import DBConnection.DBConnection;
import Model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class viewController {
    public TableColumn colid;
    public TableColumn colName;
    public TableColumn colQuantity;
    public TableColumn colPrice;
    public TableColumn colDescription;
    public TableView tblitem;

    public void btnRelodOnAction(ActionEvent actionEvent) {
        loadTable();
    }

    public  void loadTable() {
        ObservableList<Item> itemsObservableList = FXCollections.observableArrayList();
        colid.setCellValueFactory((new PropertyValueFactory<>("itemId")));
        colName.setCellValueFactory((new PropertyValueFactory<>("itemName")));
        colQuantity.setCellValueFactory((new PropertyValueFactory<>("Quantity")));
        colPrice.setCellValueFactory((new PropertyValueFactory<>("price")));
        colDescription.setCellValueFactory((new PropertyValueFactory<>("item_Description")));

        DBConnection.getInstance().getConnection().forEach(ob -> {
            itemsObservableList.add(ob);
        });
        tblitem.setItems(itemsObservableList);
    }
}