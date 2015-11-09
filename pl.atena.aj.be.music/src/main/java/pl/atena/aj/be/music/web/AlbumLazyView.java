package pl.atena.aj.be.music.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.dao.LazyAlbumDataModel;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;
 
@ManagedBean(name="albumLazyView")
@ViewScoped
public class AlbumLazyView implements Serializable {
     
	private static final long serialVersionUID = -7572869343047925778L;

	private LazyDataModel<AlbumDTO> lazyModel;
     
    private AlbumDTO selectedAlbum;
    
    @ManagedProperty("#{albumService}")
    private AlbumDAO albumDAO = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
     
    @PostConstruct
    public void init() {
    	albumDAO = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
        lazyModel = new LazyAlbumDataModel(albumDAO.getAll());
    }
 
    public LazyDataModel<AlbumDTO> getLazyModel() {
        return lazyModel;
    }
 
    public AlbumDTO getSelectedAlbum() {
        return selectedAlbum;
    }
 
    public void setSelectedAlbum(AlbumDTO selectedAlbum) {
        this.selectedAlbum = selectedAlbum;
    }
     
    public void setService(AlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }
     
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Selected Album", ((AlbumDTO) event.getObject()).getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public AlbumDAO getAlbumDao() {
		return albumDAO;
	}

	public void setAlbumDAO(AlbumDAO albumDAO) {
		this.albumDAO = albumDAO;
	}
}