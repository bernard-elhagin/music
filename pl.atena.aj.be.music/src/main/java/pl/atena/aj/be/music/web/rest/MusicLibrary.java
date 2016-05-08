package pl.atena.aj.be.music.web.rest;

import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/music_library")
@Api(value = "/music_library")
@Produces({ "application/json" })
public interface MusicLibrary {


    @GET
    @Path("/albums")
    @ApiOperation(value = "Zwraca wszystkie albumy", notes = "Zwraca listę albumów", response = Album.class, responseContainer = "list")
    public Collection<Item> getAlbums();

    @GET
    @Path("/artists")
    @ApiOperation(value = "Zwraca wszystkich wykonawców", notes = "Zwraca liste wykonawców", response = Artist.class, responseContainer = "list")
    public Collection<Item> getArtists() ;

    @GET
    @Path("/items")
    @ApiOperation(value = "Zwraca wszystko datasource", notes = "Zwraca liste całej zawartości datasource", response = Item.class, responseContainer = "list" )
    public Collection<Item> getItems() ;

    @GET
    @Path("/album/{id}")
    @ApiOperation(value = "Zwraca album po id", notes = "Zwraca album lub błąd", response = Album.class)
    public Response getAlbum(
            @ApiParam(value = "podaj id",required = false)
            @Size(min=1, max=3)
            @PathParam("id") String id) ;

    @PUT
    @Path("/album/{id}")
    @ApiOperation(value = "Dodaje nowy album", notes = "Podaj id i title", response = Album.class)
    public Album addAlbum(
            @ApiParam(value = "podaj id", required = true)
            @Size(min=1, max=3)
            @PathParam("id") int id,
            @ApiParam(value = "podaj title", required = true)
            @NotNull
            @QueryParam("title") String title) ;

    @POST
    @Path("/album/{id}")
    @ApiOperation(value = "Zmienia tytul", notes = "Podaj id i title", response = Album.class)
    public Album updateAlbum(
            @ApiParam(value = "podaj id", required = true)
            @PathParam("id") int id,
            @ApiParam(value = "podaj title", required = true)
            @Size(min=1, max=3)
            @FormParam("title") String title) ;

    @DELETE
    @Path("/album/{id}")
    @ApiOperation(value = "Usuwa album", notes = "Podaj id", response = Response.class)
    public Response removeAlbum(
            @ApiParam(value = "podaj id", required = true)
            @PathParam("id") int id) ;
}