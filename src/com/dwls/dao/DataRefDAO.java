package com.dwls.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dwls.bean.DataRef;
import com.dwls.utility.GlobalResource;

public class DataRefDAO {

	public void insert(){
		try(
			Connection connection = GlobalResource.getDatasource().getConnection();
			PreparedStatement ps = connection.prepareStatement("insert into data_ref (group_no,rd_no,cons_no) values(?,?,?)")){
			ps.setString(1, "group 3");
			ps.setString(2, "reader 3");
			ps.setString(3, "4512618037");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public DataRef getByConsNo(String consNo){
		DataRef dataRef = null;
		try(
				Connection connection = GlobalResource.getDatasource().getConnection();
				PreparedStatement ps = connection.prepareStatement("select * from data_ref where cons_no=?")){
					ps.setString(1, consNo);
					ResultSet rs = ps.executeQuery();
					while(rs.next()){
						dataRef = new DataRef();
						dataRef.setId(rs.getInt(1));
						dataRef.setGroupNo(rs.getString(2));
						dataRef.setRdNo(rs.getString(3));
						dataRef.setConsNo(rs.getString(4));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return dataRef;
	}
	/*public static void main(String[] args) {
		DataRefDAO dataRefDAO = new DataRefDAO();
		dataRefDAO.insert();
	}*/
}
