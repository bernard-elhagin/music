package pl.atena.aj.be.ebay.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.CameraDTO;
import pl.atena.aj.be.ebay.utils.MyBatisSQLSessionFactory;

@ManagedBean(name="cameraActionBean")
@SessionScoped
public class CameraAction {
	
	private CameraDTO camera = new CameraDTO();

	SqlSessionFactory sf = MyBatisSQLSessionFactory.getSqlSessionFactory();
	
	private CameraDAO cameraDao = new CameraDAO(CameraDTO.class, sf);
	
	public void createCamera() {
		cameraDao.create(camera);
	}
	
	public CameraDTO getCamera() {
		return camera;
	}

	public void setCamera(CameraDTO camera) {
		this.camera = camera;
	}
}
