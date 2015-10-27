package pl.atena.aj.be.ebay.dao;

import java.util.ArrayList;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class MyBatisDAO<T, PK> implements BaseDAO<T, PK> {
	
//	private static Logger log = LoggerFactory.getLogger(MyBatisDAO.class);

	private String NAMESPACE;
	
	private SqlSessionFactory sqlFactory;
	private Class<T> type;
	
	/**
	 * Prefiksy dla nazw akcji CRUDowych do stosowania miêdzy XMLami MyBatisa
	 * a obiektami DAO.
	 */
	public static final String PREFIX_SELECT_QUERY = "get"; 
	public static final String PREFIX_INSERT_QUERY = "create";
	public static final String PREFIX_UPDATE_QUERY = "update";
	public static final String PREFIX_DELETE_QUERY = "delete";
	
	/** Domyœlny konstruktor */
    public MyBatisDAO(Class<T> type, SqlSessionFactory sqlFactory) {
        this.type = type;
        this.sqlFactory = sqlFactory;

    	String simpleName = this.type.getSimpleName();
    	NAMESPACE = "pl.atena.aj.be.ebay.mappers." + simpleName;
        
        if(sqlFactory == null) {
//			log.error("Error: Could not instantiate MyBatisDAO. Loading myBatis sessionFactory failed.");
        }
    }
    
    /* Fabryka sesji SQL dla dziedzicz¹cych DAO */
    protected SqlSessionFactory getSessionFactory() {
		return sqlFactory;
	}
    
    /** 
     *  Podstawowy select po id. 
	 *
	 *	Przyk³adowe query:
	 *
	 *  Dla obiektu DAO AddressInfo.java query
	 *  w mapperze ma mieæ ID &lt;select id="getAddressInfo" ...  
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
     *  Pobranie wszystkich rekordów danego typu. 
	 *
	 *	Przyk³adowe query:
	 *
	 *  Dla obiektu DAO AddressInfo.java query
	 *  w mapperze ma mieæ ID &lt;select id="getAllAddressInfo" ...  
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
     *  Metoda zwraca pierwszy obiekt, którego pole xxxx, np. "name"
     *  pasuje do podanego na wejœciu. To, czym jest "name" zale¿y
     *  od obiektu i sytuacji.
     *  
     *  No ogó³ powinna byæ przeci¹¿ona.

     *  Przyk³ad:
     *
     *  Dla DAO CarInfo.java, query id bêdzie &lt;select id="getCarInfoByName" ...  
     *
     *  Wykonany select to:
     *  
     *  select * from [tablename] where NAME = ?
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