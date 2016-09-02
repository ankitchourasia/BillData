/**
 * 
 */
package com.dwls.utility;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;


/**
 * @author lenovo
 *
 */
public class GlobalResource {

	//private static Connection connection = null;
	
	private static DataSource datasource = null;


	/*public static Connection getConnection()
	{
		try {
			if(connection==null){
				Class.forName("org.postgresql.Driver");
				connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/dwls","dwls","dwls");	
			}
		} catch (SQLException exception) {
			System.out.println("Not able to connect to the Database "+exception.getMessage());
			exception.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found "+e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}*/

	public static DataSource getDatasource()
	{
		if(datasource==null){
			PoolProperties poolProperties = new PoolProperties();
			poolProperties.setDriverClassName("org.postgresql.Driver");

			//Production environment database connection details.Uncomment below code before deploying to production
			poolProperties.setUrl("jdbc:postgresql://localhost:5432/dwls");
			poolProperties.setUsername("dwls");
			poolProperties.setPassword("dwls");

			/*//Testing environment database connection details
			poolProperties.setUrl("jdbc:mysql://localhost:3306/ht_test");
			poolProperties.setUsername("ht_test");
			poolProperties.setPassword("ht");*/

			poolProperties.setJmxEnabled(true);
			poolProperties.setTestWhileIdle(false);
			poolProperties.setTestOnBorrow(true);
			poolProperties.setValidationQuery("SELECT 1");
			poolProperties.setTestOnReturn(false);
			poolProperties.setValidationInterval(3600);   // Change after testing. Do not change if this interval works
			poolProperties.setTimeBetweenEvictionRunsMillis(30000);
			poolProperties.setMaxActive(100);
			poolProperties.setInitialSize(10);
			poolProperties.setMaxWait(10000);
			poolProperties.setRemoveAbandonedTimeout(60);
			poolProperties.setMinEvictableIdleTimeMillis(30000);
			poolProperties.setMinIdle(10);
			poolProperties.setLogAbandoned(true);
			poolProperties.setRemoveAbandoned(true);
			poolProperties.setJdbcInterceptors(
					"org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"+
					"org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");
			datasource = new DataSource();
			datasource.setPoolProperties(poolProperties);
		}
		return datasource;
	}

}
