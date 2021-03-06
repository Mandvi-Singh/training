package com.thegringottsbank.dao.provider;
import com.thegringottsbank.exceptions.ServiceNotFoundException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import com.banking.exceptions.ServiceNotFoundException;
//import com.banking.reposervices.BankingRepositoryServices;

public class BankingRepositoryServicesProvider {
		public static BankingRepositoryServicesProvider getBankingRepoServices() throws ServiceNotFoundException{
			try {
				FileInputStream src = new FileInputStream(new File(".//resource//BankingSystem.properties"));
				Properties p = new Properties();
				p.load(src);
				String daoprovider = p.getProperty("daoprovider");
				@SuppressWarnings("rawtypes")
				Class c = Class.forName(daoprovider);
				return (BankingRepositoryServicesProvider) c.newInstance();
			} catch (FileNotFoundException e) {
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