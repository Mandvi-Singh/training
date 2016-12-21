package com.zensar.bankingsystem.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.zensar.bankingsystem.beans.Beneficiary;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Login;
import com.zensar.bankingsystem.daoservices.DAOInterface;

import com.zensar.bankingsystem.connectionprovider.ConnectionProvider;

public class DAOImplementation implements DAOInterface{

	@Override
	public ResultSet fixedDeposit(int accountID, int tenure, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validate(Login login) {
		// TODO Auto-generated method stub
		Connection con = null;// Interface
		PreparedStatement ps = null;// Interface
		ResultSet rs = null;// Interface
		
		try {
			con = ConnectionProvider.getConnection();
			ps = con.prepareStatement("select * from login where customerID= ? and password= ?");			
			ps.setInt(1, login.getCustomerID());
			ps.setString(2, login.getPassword());
			rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}
		return false;
		
	}

	@Override
	public ResultSet getMiniStatement(int accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getAccountSummary(int accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Connection con = null;// Interface
		PreparedStatement ps = null;// Interface
		PreparedStatement ps1 = null;
		ResultSet rs = null;// Interface
		
		try {
			con = ConnectionProvider.getConnection();
			ps = con.prepareStatement("select * from customer where customerID= ? and customerName= ? and accountID= ? and mobileNumber= ?");			
			
			ps.setInt(1, customer.getCustomerID());
			ps.setString(2, customer.getCustomerName());
			ps.setInt(3, customer.getAccountID());
			ps.setInt(4, customer.getMobileNumber());
			
			rs = ps.executeQuery();
			int count = 0;
			if (rs.next()) {
				ps1 = con.prepareStatement("insert into login values(?,?)");			
	
				ps1.setInt(1, customer.getCustomerID());
				ps1.setString(2, customer.getPassword());
				count = ps1.executeUpdate();
				if (count == 0) {
					return false;
				} else {
					return true;
				}
				
			} else {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}
		return false;
	}

	@Override
	public ResultSet retrieveBeneficiary(String beneficiaryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertBeneficiary(Beneficiary beneficiary) {
		// TODO Auto-generated method stub
		Connection con = null;// Interface
		PreparedStatement ps = null;// Interface
		PreparedStatement ps1 = null;
		ResultSet rs = null;// Interface
		
		try {
			con = ConnectionProvider.getConnection();
			ps = con.prepareStatement("select * from beneficiary where beneficiaryName= ? and beneficiaryAccountID= ? and beneficiaryAccountType= ? and beneficiaryemailID= ?");			
			
			ps.setString(1, beneficiary.getBeneficiaryName());
			ps.setInt(2, beneficiary.getBeneficiaryAccountID());
			ps.setString(3, beneficiary.getBeneficiaryAccountType());
			ps.setString(4, beneficiary.getbeneficiaryEmailID());
			
			rs = ps.executeQuery();
			int count = 0;
			if (rs.next()) {
				return false;
			} else {
				ps1 = con.prepareStatement("insert into beneficiary values(?,?,?,?)");			
				
				ps1.setString(1, beneficiary.getBeneficiaryName());
				ps1.setInt(2, beneficiary.getBeneficiaryAccountID());
				ps1.setString(3, beneficiary.getBeneficiaryAccountType());
				ps1.setString(4, beneficiary.getbeneficiaryEmailID());
				
				count = ps1.executeUpdate();
				
				if (count == 0) {
					return false;
				} else {
					return true;
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}
		return false;
	}

	@Override
	public boolean deleteBeneficiary(String beneficiaryName) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
