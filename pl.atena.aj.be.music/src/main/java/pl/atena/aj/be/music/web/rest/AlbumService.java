package pl.atena.aj.be.music.web.rest;

import java.util.Collection;

import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

@Path("/albums")
@Api(value = "/albums")
@Produces({ "application/json" })
public class AlbumService {

	AlbumDAO albumDao = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());

    @GET
    @Path("/all")
    @ApiOperation(value = "Zwraca wszystkie albumy", notes = "Zwraca listę albumów", response = AlbumDTO.class, responseContainer = "list")
    public Collection<AlbumDTO> getAlbums() {

        return albumDao.getAll();
    }

    @GET
    @Path("/album/{id}")
    @ApiOperation(value = "Zwraca album po id", notes = "Zwraca album lub błąd", response = AlbumDTO.class)
    public Response getAlbum(
            @ApiParam(value = "podaj id",required = false)
            @Size(min=1, max=3)
            @PathParam("id") String idString) {
    	int id = Integer.parseInt(idString);

    	AlbumDTO album = albumDao.get(id);

    	if( album != null) {
        	return Response.status(200).entity(album).build();
        }

        return Response.status(404).entity("Nie ma takiego albumu").build();
    }
}