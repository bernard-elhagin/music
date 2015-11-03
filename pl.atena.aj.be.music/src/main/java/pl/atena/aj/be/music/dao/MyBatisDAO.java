package pl.atena.aj.be.music.dao;

import java.util.ArrayList;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public abstract class MyBatisDAO<T, PK> implements BaseDAO<T, PK> {

	private String NAMESPACE;

	private SqlSessionFactory sqlFactory;
	private Class<T> type;

	/**
	 * Prefiksy dla nazw akcji CRUDowych do stosowania między XMLami MyBatisa a
	 * obiektami DAO.
	 */
	public static final String PREFIX_SELECT_QUERY = "get"; 
	public static final String PREFIX_INSERT_QUERY = "create";
	public static final String PREFIX_UPDATE_QUERY = "update";
	public static final String PREFIX_DELETE_QUERY = "delete";

	/** Domyślny konstruktor */
    public MyBatisDAO(Class<T> type, SqlSessionFactory sqlFactory) {
        this.type = type;
        this.sqlFactory = sqlFactory;

    	String simpleName = this.type.getSimpleName();
    	NAMESPACE = "pl.atena.aj.be.music.mappers." + simpleName;
        
        if(sqlFactory == null) {
        }
    }

	/* Fabryka sesji SQL dla dziedziczących DAO */
    protected SqlSessionFactory getSessionFactory() {
		return sqlFactory;
	}

    /**
	 * Podstawowy select po id.
	 *
	 * Przykładowe query:
	 *
	 * Dla obiektu DAO AddressInfo.java query w mapperze ma mieć ID &lt;select
	 * id="getAddressInfo" ...
	 */
    @SuppressWarnings("unchecked")
	public T get(PK id) throws PersistenceException {
        
    	SqlSession session = sqlFactory.openSession();
    	T obj = null;
		
    	try
    	{
			String query = NAMESPACE + "." + PREFIX_SELECT_QUERY + this.type.getSimpleName();
			
			obj = (T) session.selectOne(query, id);
		}
    	finally
    	{
			session.close();
		}
		return obj;
    }

    /**
	 * Pobranie wszystkich rekordów danego typu.
	 *
	 * Przykładowe query:
	 *
	 * Dla obiektu DAO AddressInfo.java query w mapperze ma mieć ID &lt;select
	 * id="getAllAddressInfo" ...
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<T> getAll() throws PersistenceException {
        
    	SqlSession session = sqlFactory.openSession();	
    	ArrayList<T> list = null;
    	
		try
		{
			String query = NAMESPACE + "." + PREFIX_SELECT_QUERY + "All" + this.type.getSimpleName();
			
			list = (ArrayList<T>) session.selectList(query);
		}
		finally
		{
			session.close();
		}
		return list;
    }

    /**
	 * Metoda zwraca pierwszy obiekt, którego pole xxxx, np. "name" pasuje do
	 * podanego na wejściu. To, czym jest "name" zależy od obiektu i sytuacji.
	 * 
	 * No ogół powinna być przeciążona.
	 * 
	 * Przykład:
	 *
	 * Dla DAO CarInfo.java, query id b�dzie &lt;select id="getCarInfoByName"
	 * ...
	 *
	 * Wykonany select to:
	 * 
	 * select * from [tablename] where NAME = ?
	 * 
	 */
    @SuppressWarnings("unchecked")
	public T getByName(String name) throws PersistenceException {
        
    	SqlSession session = sqlFactory.openSession();
    	T obj = null;
		
    	try
		{	
			String query = NAMESPACE + "." + PREFIX_SELECT_QUERY + this.type.getSimpleName() + "ByName";
			obj = (T) session.selectOne(query, name);
		}
		finally
		{
			session.close();
		}
		return obj;
    }

    /** 
     * Podstawowy insert do bazy.
	 * 
	 * Dla CarInfo.java &lt;insert id="createCarInfo" ...
	 *   
     * insert into [tablename] (fieldname1,fieldname2,...) values(value1,value2...) ... 
     *  
     */
    public int create(T o) throws PersistenceException{        
    	SqlSession session = sqlFactory.openSession();
    	Integer status = null;
    	
    	try
		{			
    		String query = NAMESPACE + "." + PREFIX_INSERT_QUERY + o.getClass().getSimpleName();
			
    		status = (Integer) session.insert(query, o);
			session.commit();			
		}
		finally
		{
			session.close();
		}		
		return status;
    }

    /** 
     *  Podstawowy update po id.
     *  
     *  query id <update id="updateCarInfo" ...  
     *    
     *  update [tablename] set fieldname1 = value1 where id = #{id} 
     *  
     */
    public int update(T o)throws PersistenceException {
        
    	SqlSession session = sqlFactory.openSession();
		Integer status = null;
    	
		try
		{			
			String query = NAMESPACE + "." + PREFIX_UPDATE_QUERY + o.getClass().getSimpleName();
    		
			status = session.update(query, o);
			session.commit();
			
		}
		finally
		{
			session.close();
		}	
		return status;
    	
    }

    /** 
     *  Podstawowy delete po id.
	 *  
	 *  query id should be <delete id="deleteCarInfo" ...  
     *
     *	update [tablename] set fieldname1 = value1 where id = #{id} 
     *  
     */
    public int delete(PK id)  throws PersistenceException{
		SqlSession session = sqlFactory.openSession();
		Integer status = null;
		
		try
		{			
			String query = NAMESPACE + "." + PREFIX_DELETE_QUERY + this.type.getSimpleName();
			
			status = session.delete(query, id);
			session.commit();
		}	
		finally
		{
			session.close();
		}	
		return status;
    }
}