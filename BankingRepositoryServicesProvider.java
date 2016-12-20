package com.banking.serviceprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import com.banking.exceptions.ServiceNotFoundException;
import com.banking.reposervices.BankingRepositoryServices;

public class BankingRepositoryServicesProvider {
		public static BankingRepositoryServices getBankingRepoServices() throws ServiceNotFoundException{
			try {
				FileInputStream src = new FileInputStream(new File(".//resource//BankingSystem.properties"));
				Properties p = new Properties();
				p.load(src);
				String bankreposervicesimpl = p.getProperty("bankreposervicesimpl");
				@SuppressWarnings("rawtypes")
				Class c = Class.forName(bankreposervicesimpl);
				return (BankingRepositoryServices) c.newInstance();
			} catch (FileNotFoundException e) {
				throw new ServiceNotFoundException("Bank service not found",e);
			} catch (ClassNotFoundException e) {
				throw new ServiceNotFoundException("Bank service not found",e);
			} catch (InstantiationException e) {
				throw new ServiceNotFoundException("Bank service not found",e);
			} catch (IllegalAccessException e) {
				throw new ServiceNotFoundException("Bank service not found",e);
			} catch (IOException e) {
				throw new ServiceNotFoundException("Bank service not found",e);
			}
	}
}
