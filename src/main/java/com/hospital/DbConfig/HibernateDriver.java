package com.hospital.DbConfig;

import java.io.Serializable;

public class HibernateDriver implements Serializable {

	private static final long serialVersionUID = 1L;
	private DbConnection session;
	private DbConnection transaction;

	public HibernateDriver() {
		System.err.println("Connecting DataBase Success");
	}

	public void openSession() {
		session = openSession();
		setTransaction(getSession().beginTransaction());
	}
	
	
	
	public void closeSession()
    {
       transaction.commit();
       session.close();
    }
	
	public void roleBack()
	{
		if (transaction!=null)
		transaction.rollback();
	}
	
	public DbConnection getSession() {
		return session;
	}

	public void setSession(DbConnection session) {
		this.session = session;
	}

	public DbConnection getTransaction() {
		return transaction;
	}

	public void setTransaction(DbConnection transaction) {
		this.transaction = transaction;
	}

}
