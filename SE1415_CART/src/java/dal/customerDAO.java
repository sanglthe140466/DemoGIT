/*
 * To change this license header, choose License Headers in Project Properties.
getCustds * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.customer;

/**
 *
 * @author Trung
 */
public class customerDAO extends DBContext{
    public customer getCustomer(int id, String name){
        String sql= "select * from customer where id = ? "
                + "and name = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.setString(2, name);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                return new customer(id, name);
            }
        } catch (Exception e) {
        }
        return null;
    }
}
