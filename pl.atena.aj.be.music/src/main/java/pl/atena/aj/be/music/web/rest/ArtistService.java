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
import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

@Path("/artists")
@Api(value = "/artists")
@Produces({ "application/json" })
public class ArtistService {

    final ArtistDAO artistDao = new ArtistDAO(ArtistDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());

    @GET
    @Path("/all")
    @ApiOperation(value = "Zwraca wszystkich wykonawców", notes = "Zwraca liste wykonawców", response = ArtistDTO.class, responseContainer = "list")
    public Collection<ArtistDTO> getArtists() {

        return artistDao.getAll();
    }

    @GET
    @Path("/artist/{id}")
    @ApiOperation(value = "Zwraca artist po id", notes = "Zwraca artist lub błąd", response = ArtistDTO.class)
    public Response getArtist(
            @ApiParam(value = "podaj id",required = false)
            @Size(min=1, max=3)
            @PathParam("id") String idString) {

        int id = Integer.parseInt(idString);

        ArtistDTO artist = artistDao.get(id);

        if( artist != null) {
            return Response.status(200).entity(artist).build();
        }

        return Response.status(404).entity("Nie ma takiego wykonawcy").build();
    }
}
