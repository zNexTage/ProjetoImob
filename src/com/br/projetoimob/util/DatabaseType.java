/**
 * 
 */
package com.br.projetoimob.util;

/**
 * @author Christian
 *
 */
public class DatabaseType {
	public enum databaseType
	{
		SQLSERVER(1), MYSQL(2);
		
		public int databaseType;
		databaseType(int value)
		{
			databaseType = value;
		}
	}
}
