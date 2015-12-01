package pl.atena.aj.be.music.web;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.PageEvent;
import org.primefaces.model.LazyDataModel;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.dao.LazyAlbumDataModel;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.domain.Genre;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;
 
@ManagedBean(name="albumController")
@SessionScoped
public class AlbumController implements Serializable {
     
	private static final long serialVersionUID = -7572869343047925778L;

	private LazyDataModel<AlbumDTO> lazyModel;
     
    private AlbumDTO selectedAlbum;
    
    private AlbumDTO newAlbum;
    private ArtistDTO newArtist;
    
    private List<ArtistDTO> allArtists;
    
    private int pageNumber;
    
    @ManagedProperty("#{albumService}")
    private AlbumDAO albumDao = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());

    @ManagedProperty("#{artistService}")
    private ArtistDAO artistDao = new ArtistDAO(ArtistDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
    
    @ManagedProperty("#{album.albumId}")
    private Integer albumId;

    @PostConstruct
    public void init() {
    	albumDao  = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
    	artistDao = new ArtistDAO(ArtistDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());

    	newAlbum  = new AlbumDTO();
    	newArtist = new ArtistDTO();

    	allArtists = artistDao.getAll();
    	
        lazyModel = new LazyAlbumDataModel(albumDao.getAll());
    }
 
    public LazyDataModel<AlbumDTO> getLazyModel() {
        return lazyModel;
    }
 
    public void onPageChange(PageEvent event) {
    	this.setPageNumber(((DataTable) event.getSource()).getFirst());
    }
    
    public AlbumDTO getSelectedAlbum() {
        return selectedAlbum;
    }
 
    public void setSelectedAlbum(AlbumDTO selectedAlbum) {
        this.selectedAlbum = selectedAlbum;
    }
     
    public void setService(AlbumDAO albumDAO) {
        this.albumDao = albumDAO;
    }
     
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Selected Album", ((AlbumDTO) event.getObject()).getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public String deleteAlbum(Integer id) {
		albumDao.delete(id);
		init();

		return "home";
    }

	public String addAlbum(AlbumDTO album) {
		albumDao.create(album);
		init();

		return "home";
	}
	
	public String editAlbum(AlbumDTO album) {
		albumDao.update(album);
		init();

		return "home";
	}

	public String addArtist(ArtistDTO artist) {
		if(artistDao.getByName(artist.getName()) == null) {
			artistDao.create(artist);
			init();
		}

		return "home";
	}

	public AlbumDAO getAlbumDao() {
		return albumDao;
	}

	public void setAlbumDao(AlbumDAO albumDAO) {
		this.albumDao = albumDAO;
	}
	
	public Genre[] getGenres() {
		return Genre.values();
		
	}
	
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public AlbumDTO getNewAlbum() {
		return newAlbum;
	}

	public void setNewAlbum(AlbumDTO newAlbum) {
		this.newAlbum = newAlbum;
	}
	
	public ArtistDTO getArtistById(int id) {
		return artistDao.get(id);
	}

	public ArtistDAO getArtistDao() {
		return artistDao;
	}

	public void setArtistDao(ArtistDAO artistDao) {
		this.artistDao = artistDao;
	}

	public ArtistDTO getNewArtist() {
		return newArtist;
	}

	public void setNewArtist(ArtistDTO newArtist) {
		this.newArtist = newArtist;
	}

	public List<ArtistDTO> getAllArtists() {
		return allArtists;
	}

	public void setAllArtists(List<ArtistDTO> allArtists) {
		this.allArtists = allArtists;
	}
	
	public boolean doesCoverExist(Integer albumId) {
		File file = new File("resources/img/album_covers/" + Integer.toString(albumId) + ".jpg");
System.out.println(file.toString());
        return file.exists();
	}

	public Integer getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
}