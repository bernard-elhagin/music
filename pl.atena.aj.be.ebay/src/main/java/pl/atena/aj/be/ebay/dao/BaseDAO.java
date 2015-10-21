package pl.atena.aj.be.ebay.dao;

import java.util.ArrayList;

import org.apache.ibatis.exceptions.PersistenceException;

public interface BaseDAO<T, PK> {

	/** Pobierz obiekt po g³ównym ID */
	public T get(PK id) throws PersistenceException;

	/** Pobierz obiekt po polu 'name' jeœli istnieje */
	public T getByName(String name) throws PersistenceException;

	/** Pobierz wszystkie obiekty typu T */
	public ArrayList<T> getAll() throws PersistenceException;
	
	/** Insert obiektu typu T */
	public int create(T objInstance) throws PersistenceException;

	/** Update obiektu typu T */
	int update(T transientObject) throws PersistenceException;

	/** Usuniêcie obiektu typu T */
	int delete(PK id) throws PersistenceException;
}
