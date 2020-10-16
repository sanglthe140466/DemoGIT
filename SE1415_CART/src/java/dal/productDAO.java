/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.customer;
import model.product;

/**
 *
 * @author Trung
 */
public class productDAO extends DBContext {

    public List<product> getAll() {
        List<product> l = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (true) {
                product p = new product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"));
                l.add(p);
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public product getProductByID(int id) {       
        String sql = "select * from product where id = ? ";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                return new product(id, 
                        rs.getString("name"), 
                        rs.getDouble("price"));
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
