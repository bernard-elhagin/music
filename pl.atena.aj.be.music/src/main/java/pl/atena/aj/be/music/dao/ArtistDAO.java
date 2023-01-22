package pl.atena.aj.be.music.dao;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.domain.ArtistDTO;

@ManagedBean(name="artistService")
@ApplicationScoped
public class ArtistDAO extends MyBatisDAO<ArtistDTO, Integer> {

    /**
     *
     */
    private static final long serialVersionUID = 5470827831213365851L;

    public ArtistDAO(Class<ArtistDTO> type, SqlSessionFactory sqlFactory) {
        super(type, sqlFactory);
    }

    public ArtistDAO() {
        super();
    }
}
