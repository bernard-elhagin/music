package pl.atena.aj.be.ebay;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.Camera;

public class MainEbay {

	private static Logger log = LoggerFactory.getLogger(CameraDAO.class);
	private static SqlSessionFactory sf;
	private static CameraDAO cameraDao;

	public static void main(String[] args) throws Exception {
		setUp();
		
		List<Camera> cams = new ArrayList<Camera>();
		cams = cameraDao.getAll();
		
		System.out.println(cams.toString());
		
		Camera cam = new Camera("Nikon", "D3x", 12555.0);
		
		cameraDao.create(cam);
		
		cams = cameraDao.getAll();
		
		System.out.println(cams.toString());
		
		cam = cameraDao.get(1);
		
		System.out.println(cam.toString());

	}
	
	private static void setUp() throws Exception {
		log.info("starting up myBatis session");
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(resource);		
		sf = new SqlSessionFactoryBuilder().build(reader);		
		cameraDao = new CameraDAO(Camera.class,sf);
	}
}
