package pl.atena.aj.be.music.biz;

import pl.atena.aj.be.music.domain.AlbumDTO;

public interface AlbumBiz {
	AlbumDTO getById(int id);
}