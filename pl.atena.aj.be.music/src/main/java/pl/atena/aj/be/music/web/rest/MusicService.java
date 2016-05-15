package pl.atena.aj.be.music.web.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@ApplicationPath("/v1")
public class MusicService extends Application {

	private Set<Class<?>> classes = new HashSet<>();

	public MusicService() {
		initClasses();
		initSwagger();
	}

	private void initClasses() {
		classes.add(AlbumService.class);
		classes.add(ArtistService.class);

        //--- Swagger --------------------------------------------
        classes.add(ApiListingResource.class);
        classes.add(SwaggerSerializers.class);
	}

	private void initSwagger() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("music_library");
        beanConfig.setVersion("1.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("pl.atena.aj.be.music.web.rest");
        beanConfig.setScan(true);
    }

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
}
