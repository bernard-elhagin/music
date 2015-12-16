package pl.atena.aj.be.music.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.Genre;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

@ManagedBean
@SessionScoped
public class AlbumAction implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 2461200801267762392L;

	private AlbumDTO album = new AlbumDTO();

	private int index = 0;

	SqlSessionFactory sf = MyBatisSQLSessionFactory.getSqlSessionFactory();

	private AlbumDAO albumDao = new AlbumDAO(AlbumDTO.class, sf);

	public String deleteAlbum(Integer id) {
		albumDao.delete(id);

		return "home";
    }

	public String addAlbum(AlbumDTO album) {
		albumDao.create(album);

		return "home";
	}

	public String editAlbum(AlbumDTO album) {
		albumDao.update(album);

		return "home";
	}

	public List<SelectItem> getGenres() {
		return Genre.getAllValues();
	}

	public void createAlbum() {
		albumDao.create(album);
	}

	public AlbumDTO getAlbum() {
		return album;
	}

	public void setAlbum(AlbumDTO album) {
		this.album = album;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}