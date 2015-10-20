package pl.atena.aj.be.ebay.dao;

import java.util.List;

import pl.atena.aj.be.ebay.domain.Camera;
 
public interface CameraDao {
 
 public void insertCamera(Camera camera);
 
 public Camera getCameraById(Integer cameraId);
 
 public List<Camera> getAllCameras();
 
 public void updateCamera(Camera camera);
 
 public void deleteCamera(Integer cameraId);
 
}