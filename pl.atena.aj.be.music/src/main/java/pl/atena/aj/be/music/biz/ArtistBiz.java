package pl.atena.aj.be.music.biz;

import pl.atena.aj.be.music.domain.ArtistDTO;

public interface ArtistBiz {
	ArtistDTO getById(int id);
}