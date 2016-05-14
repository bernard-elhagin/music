package pl.atena.aj.be.music.dao;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.domain.AlbumDTO;

@ManagedBean(name="albumService")
@ApplicationScoped
public class AlbumDAO extends MyBatisDAO<AlbumDTO, Integer> {

	/**
	 *
	 */
	private static final long serialVersionUID = -1116782543175223440L;

	public AlbumDAO(Class<AlbumDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}

	public AlbumDAO() {
		super();
	}
}
