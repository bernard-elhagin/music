package pl.atena.aj.be.music.web.rest;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

@Path("/albums")
@Api(value = "/albums")
@Produces({ "application/json" })
public class AlbumService {

	AlbumDAO albumDao = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
	ArtistDAO artistDao = new ArtistDAO(ArtistDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());

	@GET
	@Path("/all")
	@ApiOperation(value = "Zwraca wszystkie albumy", notes = "Zwraca listę albumów", response = Album.class, responseContainer = "list")
	public Collection<Album> getAlbums() {

		Collection<Album> result = new ArrayList<>();

		for (AlbumDTO albumDTO : albumDao.getAll()) {
			Album album = new Album();

			album.setTitle(albumDTO.getTitle());

			ArtistDTO artistDTO = artistDao.get(albumDTO.getArtistId());
			Artist artist = new Artist();

			artist.setName(artistDTO.getName());

			album.setArtist(artist);

			result.add(album);
		}

		return result;
	}

	@GET
	@Path("/album/{id}")
	@ApiOperation(value = "Zwraca album po id", notes = "Zwraca album lub błąd", response = Album.class)
	public Response getAlbum(
			@ApiParam(value = "podaj id", required = false) @Size(min = 1, max = 3) @PathParam("id") String idString) {
		int id = Integer.parseInt(idString);

		AlbumDTO albumDTO = albumDao.get(id);

		if (albumDTO != null) {

			Album album = new Album();
			album.setTitle(albumDTO.getTitle());

			ArtistDTO artistDTO = artistDao.get(albumDTO.getArtistId());
			Artist artist = new Artist();

			artist.setName(artistDTO.getName());

			album.setArtist(artist);

			return Response.status(200).entity(album).build();
		}

		return Response.status(404).entity("Nie ma takiego albumu").build();
	}

	@PUT
	@Path("/album/{id}")
	@ApiOperation(value = "Dodaje nowy album", notes = "Podaj id i title", response = AlbumDTO.class)
	public AlbumDTO addAlbum(
			@ApiParam(value = "podaj id", required = true) @Size(min = 1, max = 3) @PathParam("id") int id,
			@ApiParam(value = "podaj title", required = true) @NotNull @QueryParam("title") String title) {
		AlbumDTO albumDTO = new AlbumDTO();

		return null;

	}
}