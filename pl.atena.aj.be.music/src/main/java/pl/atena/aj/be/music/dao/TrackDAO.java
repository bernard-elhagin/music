package pl.atena.aj.be.music.dao;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.domain.TrackDTO;

@ManagedBean(name="trackService")
@ApplicationScoped
public class TrackDAO extends MyBatisDAO<TrackDTO, Integer> {

	/**
	 *
	 */
	private static final long serialVersionUID = -1116782543175223440L;

	public TrackDAO(Class<TrackDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}

	public TrackDAO() {
		super();
	}
}
