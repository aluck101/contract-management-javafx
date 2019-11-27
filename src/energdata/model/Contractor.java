/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.model;

import javafx.beans.property.*;

/**
 *
 * @author ALUCK
 */
public class Contractor {
    private IntegerProperty company_id;
    private StringProperty companyName;
    private StringProperty product_services;
    private StringProperty contactName;
    private StringProperty contactNumber;
    private StringProperty email;
    private StringProperty companyAddress;
    private StringProperty dpr_cert;
    private StringProperty companyRegNo;
    private StringProperty tax_id;    
    
    

    public Contractor() {
        this.company_id = new SimpleIntegerProperty();
        this.companyName = new SimpleStringProperty();
        this.product_services = new SimpleStringProperty();
        this.contactName = new SimpleStringProperty();
        this.contactNumber = new SimpleStringProperty();
        this.email = new SimpleStringProperty();
        this.companyAddress = new SimpleStringProperty();
        this.dpr_cert = new SimpleStringProperty();
        this.companyRegNo = new SimpleStringProperty();
        this.tax_id = new SimpleStringProperty();
        
        
    }
    //company_id
    public int getCompanyId() {
        return company_id.get();
    }

    public void setCompanyId(int companyId) {
        this.company_id.set(companyId);
    }
    
    public IntegerProperty companyIdProperty() {
        return company_id;
    }

    //companyName
    public String getCompanyName() {
        return companyName.get();
    }

    public void setCompanyName(String companyName) {
        this.companyName.set(companyName);
    }
    
    public StringProperty companyNameProperty() {
        return companyName;
    }
    
    //product_Services
    public String getProduct_services() {
        return product_services.get();
    }

    public void setProduct_services(String product_services) {
        this.product_services.set(product_services);
    }
    
    public StringProperty product_servicesProperty() {
        return product_services;
    }
    
    //contact Name
    public String getContactName() {
        return contactName.get();
    }

    public void setContactName(String contactName) {
        this.contactName.set(contactName);
    }

    public StringProperty contactNameProperty() {
        return contactName;
    }
    
    //contactNumber
    public String getContactNumber() {
        return contactNumber.get();
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber.set(contactNumber);
    }

    public StringProperty contactNumberProperty() {
        return contactNumber;
    }

    //email
    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }
    
    //companyAddress
    public String getCompanyAddress() {
        return companyAddress.get();
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress.set(companyAddress);
    }

    public StringProperty companyAddressProperty() {
        return companyAddress;
    }

   
    //dpr_cert
    public String getDpr_cert() {
        return dpr_cert.get();
    }

    public void setDpr_cert(String dpr_cert) {
        this.dpr_cert.set(dpr_cert);
    }

    public StringProperty dpr_certProperty() {
        return dpr_cert;
    }
    
    //CompamyRegNo
    public String getCompanyRegNo() {
        return companyRegNo.get();
    }

    public void setCompanyRegNo(String companyRegNo) {
        this.companyRegNo.set(companyRegNo);
    }

    public StringProperty companyRegNoProperty() {
        return companyRegNo;
    }
    
    //Tax_id
    public String getTax_id() {
        return tax_id.get();
    }

    public void setTax_id(String tax_id) {
        this.tax_id.set(tax_id);
    }
    
    public StringProperty tax_idProperty() {
        return tax_id;
    }

  
    
}
