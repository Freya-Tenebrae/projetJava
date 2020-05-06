package Dao;

import java.sql.Connection;

import Interfaces.iBanqueDao;
import SGBDConnection.MySqlConnection;

public class DaoBanque implements iBanqueDao {

	private Connection sgbd = null;
	
	DaoBanque(){
		this.sgbd = MySqlConnection.getInstance();
	}
	
}
