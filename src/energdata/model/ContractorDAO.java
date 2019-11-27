/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.model;

import java.sql.SQLException;
import energdata.util.DatabaseUtil;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ALUCK
 */
public class ContractorDAO {

    public static Contractor searchContractor(String compId) throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM contractors WHERE company_id=" + compId;
        try {
            ResultSet rsCont = DatabaseUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to getCompanyFromResultSet method and get company object
            Contractor contractor = getContractorFromResultSet(rsCont);
            return contractor;

        } catch (SQLException e) {
            System.out.println("While searching for the contractor with " + compId + " an error occurred");
            throw e;
        }

    }

    public static Contractor getContractorFromResultSet(ResultSet rs) throws SQLException {
        Contractor cont = null;
        if (rs.next()) {
            cont = new Contractor();
            cont.setCompanyId(rs.getInt("COMPANY_ID"));
            cont.setCompanyName(rs.getString("COMPANYNAME"));
            cont.setProduct_services(rs.getString("PRODUCT_SERVICES"));
            cont.setContactName(rs.getString("CONTACTNAME"));
            cont.setContactNumber(rs.getString("CONTACTNUMBER"));
            cont.setEmail(rs.getString("EMAIL"));
            cont.setCompanyAddress(rs.getString("COMPANYADDRESS"));
            cont.setCompanyRegNo(rs.getString("COMPANYREGNO"));
            cont.setDpr_cert(rs.getString("DPR_CERT"));
            cont.setTax_id(rs.getString("TAX_ID"));
       //   cont.setContrator(rs.getString("CONTRACTOR"));
           
            
            
       //   cont.setActive(rs.getBoolean("ACTIVE"));
       //   cont.setuser_dept(rs.getString("USER_DEPT"));
            
     //     cont.setRemarks(rs.getString("REMARKS"));
     //     cont.setValue(rs.getInt("VALUE"));
        //  cont.setStart_date(rs.getDate("START_DATE"));
        //  cont.setEnd_date(rs.getDate("END_DATE"));
        }
        return cont;
    }

    public static ObservableList<Contractor> searchContractors() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM contractors";
        try {
            ResultSet rsConts = DatabaseUtil.dbExecuteQuery(selectStmt);
            ObservableList<Contractor> contList = getContractorList(rsConts);
            return contList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has failed: " + e);
            throw e;
        }
    }

    private static ObservableList<Contractor> getContractorList(ResultSet rs) throws SQLException, ClassNotFoundException {
        ObservableList<Contractor> contList = FXCollections.observableArrayList();

        while (rs.next()) {
            Contractor cont = new Contractor();
            cont.setCompanyId(rs.getInt("COMPANY_ID"));
            cont.setCompanyName(rs.getString("COMPANYNAME"));
            cont.setProduct_services(rs.getString("PRODUCT_SERVICES"));
            cont.setContactName(rs.getString("CONTACTNAME"));
            cont.setContactNumber(rs.getString("CONTACTNUMBER"));
            cont.setEmail(rs.getString("EMAIL"));
            cont.setCompanyAddress(rs.getString("COMPANYADDRESS"));
            cont.setDpr_cert(rs.getString("DPR_CERT"));
            cont.setCompanyRegNo(rs.getString("COMPANYREGNO"));
            cont.setTax_id(rs.getString("TAX_ID"));
            
       //   cont.setContrator(rs.getString("CONTRACTOR"));
            
            
      //    cont.setActive(rs.getBoolean("ACTIVE"));
      //    cont.setuser_dept(rs.getString("USER_DEPT"));
            
       //   cont.setRemarks(rs.getString("REMARKS"));
      //    cont.setValue(rs.getInt("VALUE"));
      //    cont.setStart_date(rs.getDate("START_DATE"));
      //    cont.setEnd_date(rs.getDate("END_DATE"));

            contList.add(cont);
        }
        return contList;
    }

  //  public static void updateContractorStatus(String compId, Boolean contActive)
  //         throws SQLException, ClassNotFoundException {
  //      String updateStmt
  //              = "BEGIN \n"
  //              + "   UPDATE Contractors\n"
  //              + "       SET STATUS = '" + contActive.toString(true) + "'\n"
  //              + "    WHERE COMPANY_ID = " + ";\n"
  //              + "   COMMIT; \n"
  //              + "END;";
  //      try {
  //          DatabaseUtil.dbExecuteUpdate(updateStmt);
  //      } catch (SQLException e) {
  //          System.out.print("Error occurred while UPDATE Operation: " + e);
  //          throw e;
  //      }
  // }

    //*************************************
    //DELETE an employee
    //*************************************
    public static void deleteContWithId(String compId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt
                = "BEGIN\n"
                + "   DELETE FROM contractors\n"
                + "         WHERE company_id =" + compId + ";\n"
                + "   COMMIT;\n"
                + "END;";

        //Execute DELETE operation
        try {
            DatabaseUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT an employee
    //*************************************
    public static void insertCont(String companyName, String products_services, String contactName, String contactNumbers, String email, String companyAddress, String dpr_cert, String  reg_no, String tax_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt
                = "BEGIN\n"
                + "INSERT INTO contrac\n"
                + "(COMPANY_ID, COMPANYNAME, PRODUCT_SERVICES, CONTACTNAME, CONTACTNUMBER, EMAIL, COMPANYADDRESS, DPR_CERT, COMPANYREGNO, TAX_ID)\n"
                + "VALUES\n"
                + "(sequence_contractor.nextval, '" + companyName + "', '" + products_services + "', '" + contactName + "', '" + contactNumbers + "','" + email + "','" + companyAddress + "','" + dpr_cert + "','" + reg_no + "','" + tax_id + "', SYSDATE, 'IT_PROG');\n"
                + "END;";

        //Execute DELETE operation
        try {
            DatabaseUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while Imserting Contractor : " + e);
            throw e;
        }
    }
}

      

