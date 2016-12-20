package com.thegringottsbank.connection.provider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.thegringottsbank.dao.provider.BankingRepositoryServicesProvider;
import com.thegringottsbank.exceptions.ServiceNotFoundException;

public class ConnectionProvider {
	public static ConnectionProvider getBankingRepoServices() throws ServiceNotFoundException{
		try {
			FileInputStream src = new FileInputStream(new File(".//resource//thegringottsbank.properties"));
			Properties p = new Properties();
			p.load(src);
			String driver=p.getProperty("driver");
			String url=p.getProperty("url");
			String user=p.getProperty("user");
			String password=p.getProperty("password");
			
			@SuppressWarnings("rawtypes")
			Class c = Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,user,password);
	        System.out.println(conn);
	
			return (ConnectionProvider) c.newInstance();
		} catch (SQLException e){throw new ServiceNotFoundException("Bank service not found");}
		catch (FileNotFoundException e) {
			throw new ServiceNotFoundException("Bank service not found");
		} catch (ClassNotFoundException e) {
			throw new ServiceNotFoundException("Bank service not found");
		} catch (InstantiationException e) {
			throw new ServiceNotFoundException("Bank service not found");
		} catch (IllegalAccessException e) {
			throw new ServiceNotFoundException("Bank service not found");
		} catch (IOException e) {
			throw new ServiceNotFoundException("Bank service not found");
		}
}
}
