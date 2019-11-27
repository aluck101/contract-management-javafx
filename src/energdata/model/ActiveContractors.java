/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.model;

import java.sql.Date;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ALUCK
 */
public class ActiveContractors extends Contractor {

    private IntegerProperty contractor_id;
    private StringProperty contrator;
    private StringProperty natureOfContract;
    private StringProperty user_dept;
    private IntegerProperty value;
    private SimpleObjectProperty<Date> start_date;
    private SimpleObjectProperty<Date> end_date;
    private StringProperty remarks;

    public ActiveContractors() {
        this.contractor_id = new SimpleIntegerProperty();
        this.contrator = new SimpleStringProperty();
        this.natureOfContract = new SimpleStringProperty();
        this.user_dept = new SimpleStringProperty();
        this.value = new SimpleIntegerProperty();
        this.start_date = new SimpleObjectProperty<>();
        this.end_date = new SimpleObjectProperty<>();
        this.remarks = new SimpleStringProperty();

    }

    //company_id
    public int getContractorId() {
        return contractor_id.get();
    }

    public void setContractorId(int contractorId) {
        this.contractor_id.set(contractorId);
    }

    public IntegerProperty contractorIdProperty() {
        return contractor_id;
    }

    //contractor
    public String getContrator() {
        return contrator.get();
    }

    public void setContrator(String contrator) {
        this.contrator.set(contrator);
    }

    public StringProperty contratorProperty() {
        return contrator;
    }

    //natureOfContracts
    public String getNatureOfContract() {
        return natureOfContract.get();
    }

    public void setNatureOfContract(String natureOfContract) {
        this.natureOfContract.set(natureOfContract);
    }
    
    public StringProperty natureOfContractProperty() {
        return natureOfContract;
    }

    //user_dept
    public String getUser_dept() {
        return user_dept.get();
    }

    public void setuser_dept(String user_dept) {
        this.user_dept.set(user_dept);
    }

    public StringProperty user_deptProperty() {
        return user_dept;
    }

    //value
    public int getValue() {
        return value.get();
    }

    public void setValue(int value) {
        this.value.set(value);
    }

    //startDate
    public Object getStart_date() {
        return start_date.get();
    }

    public void setStart_date(Date start_date) {
        this.start_date.set(start_date);
    }

    public SimpleObjectProperty<Date> start_dateProperty() {
        return start_date;
    }

    //end_date
    public Object getEnd_date() {
        return end_date.get();
    }

    public void setEnd_date(Date end_date) {
        this.end_date.set(end_date);
    }

    public SimpleObjectProperty<Date> end_dateProperty() {
        return end_date;
    }

    //remarks
    public String getRemarks() {
        return remarks.get();
    }

    public void setRemarks(String remarks) {
        this.remarks.set(remarks);
    }

    public StringProperty remarksProperty() {
        return remarks;
    }
}
