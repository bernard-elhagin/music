package pl.atena.aj.be.music.web;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.ArtistDTO;

@Path("/music_library")
@Api(value = "/music_library", description="Biblioteka muzyki")
@Produces({ "application/json" })
public interface ServiceREST {


    @GET
    @Path("/albums")
    @ApiOperation(value = "Zwraca wszystkie albumy", notes = "Zwraca listę albumów", response = AlbumDTO.class, responseContainer = "list")
    public Collection<AlbumDTO> getAlbums();

    @GET
    @Path("/artists")
    @Produces("text/plain")
    @ApiOperation(value = "Zwraca wszystkich wykonawców", notes = "Zwraca liste wykonawców", response = ArtistDTO.class, responseContainer = "list")
    public Collection<ArtistDTO> getArtists();

    @GET
    @Path("/albums/{id}")
    @ApiOperation(value = "Zwraca album po ID", notes = "Zwraca album", response = AlbumDTO.class)
    public Response getAlbum(
            @ApiParam(value = "Podaj ID",required = false)
            @PathParam("id") int id);
}