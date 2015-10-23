package pl.atena.aj.be.ebay;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.Camera;
import pl.atena.aj.be.ebay.utils.MyBatisSQLSessionFactory;

public class MainEbay {

	private static Logger log = LoggerFactory.getLogger(CameraDAO.class);

	public static void main(String[] args) throws Exception {
		CameraDAO cameraDao = new CameraDAO(Camera.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
		
		List<Camera> cams = new ArrayList<Camera>();
		cams = cameraDao.getAll();
		
		System.out.println(cams.toString());
		
		Camera cam = new Camera("Nikon", "D3x", 12555.0);
		
//		cameraDao.create(cam);
		
		cams = cameraDao.getAll();
		
		System.out.println(cams.toString());
		
		cam = cameraDao.get(2);
		
		System.out.println(cam.toString());

	}
}
