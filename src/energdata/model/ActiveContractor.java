/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.model;

import java.io.Serializable;
import java.sql.Date;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALUCK
 */
@Entity
@Table(name = "ActiveContractor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActiveContractor.findAll", query = "SELECT a FROM ActiveContractor a"),
    @NamedQuery(name = "ActiveContractor.findById", query = "SELECT a FROM ActiveContractor a WHERE a.id = :id"),
    @NamedQuery(name = "ActiveContractor.findByUserDept", query = "SELECT a FROM ActiveContractor a WHERE a.user_dept = :user_dept")})

public class ActiveContractor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private LongProperty id;
    @Basic(optional = false)
    @Column(name = "id")
    private StringProperty contrator;
    @Basic(optional = false)
    @Column(name = "id")
    private StringProperty natureOfContract;
    @Basic(optional = false)
    @Column(name = "id")
    private StringProperty user_dept;
    @Basic(optional = false)
    @Column(name = "id")
    private IntegerProperty value;
    @Basic(optional = false)
    @Column(name = "id")
    private SimpleObjectProperty<Date> start_date;
    @Basic(optional = false)
    @Column(name = "id")
    private SimpleObjectProperty<Date> end_date;
    @Basic(optional = false)
    @Column(name = "id")
    private StringProperty remarks;

        
    public ActiveContractor() {
        this.id = new SimpleLongProperty();
        this.contrator = new SimpleStringProperty();
        this.natureOfContract = new SimpleStringProperty();
        this.user_dept = new SimpleStringProperty();
        this.value = new SimpleIntegerProperty();
        this.start_date = new SimpleObjectProperty<>();
        this.end_date = new SimpleObjectProperty<>();
        this.remarks = new SimpleStringProperty();

    }

   //company_id
    public Long id() {
        return id.get();
    }

    public void setContractorId(Long id) {
        this.id.set(id);
    }

    public LongProperty idProperty() {
        return id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActiveContractor)) {
            return false;
        }
        ActiveContractor other = (ActiveContractor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "energdata.model.ActiveContractor[ id=" + id + " ]";
    }
    
}
