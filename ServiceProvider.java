package com.thegringottsbank.services.providers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import com.thegringottsbank.exceptions.ServiceNotFoundException;

public class ServiceProvider {
		public static ServiceProvider getServiceProvider() throws ServiceNotFoundException {
			try {
				FileInputStream src = new FileInputStream(new File(".//resource//thegringottsbank.properties"));
				Properties p = new Properties();
				p.load(src);
				String ServicesImpl = p.getProperty("serviceprovider");
				@SuppressWarnings("rawtypes")
				Class c = Class.forName(ServicesImpl);
				return (ServiceProvider) c.newInstance();
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