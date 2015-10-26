package pl.atena.aj.be.ebay;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.CameraDTO;
import pl.atena.aj.be.ebay.utils.MyBatisSQLSessionFactory;

public class MainEbay {

	private static Logger log = LoggerFactory.getLogger(CameraDAO.class);

	public static void main(String[] args) throws Exception {
		SqlSessionFactory sf = MyBatisSQLSessionFactory.getSqlSessionFactory();
		
		CameraDAO cd = new CameraDAO(CameraDTO.class, sf);
		
		CameraDTO c = new CameraDTO("Nikon", "D7000", 2799.99);
		
		cd.create(c);
		
		System.out.println(cd.getAll().toString());

	}
}
