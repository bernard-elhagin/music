package pl.atena.aj.be.music.web;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

public class AlbumAction {
	
	private AlbumDTO album = new AlbumDTO();

	SqlSessionFactory sf = MyBatisSQLSessionFactory.getSqlSessionFactory();
	
	private AlbumDAO albumDao = new AlbumDAO(AlbumDTO.class, sf);
	
	public void createAlbum() {
		albumDao.create(album);
	}
	
	public AlbumDTO getAlbum() {
		return album;
	}

	public void setAlbum(AlbumDTO album) {
		this.album = album;
	}
}