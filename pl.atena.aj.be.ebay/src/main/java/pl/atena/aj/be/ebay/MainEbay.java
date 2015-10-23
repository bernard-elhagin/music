package pl.atena.aj.be.ebay;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.Camera;
import pl.atena.aj.be.ebay.utils.MyBatisSQLSessionFactory;

public class MainEbay {

	private static Logger log = LoggerFactory.getLogger(CameraDAO.class);

	public static void main(String[] args) throws Exception {
		SqlSessionFactory sf = MyBatisSQLSessionFactory.getSqlSessionFactory();
		
		CameraDAO cd = new CameraDAO(Camera.class, sf);
		
		Camera c = new Camera("Nikon", "D7000", 2799.99);
		
		cd.create(c);
		
		System.out.println(cd.getAll().toString());

	}
}
