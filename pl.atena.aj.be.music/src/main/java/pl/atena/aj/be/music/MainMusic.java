package pl.atena.aj.be.music;

import java.io.IOException;

import com.wrapper.spotify.Api;
import com.wrapper.spotify.exceptions.WebApiException;
import com.wrapper.spotify.methods.AlbumRequest;

public class MainMusic {

	public static void main(String[] args) throws IOException, WebApiException {
		Api api = Api.DEFAULT_API;

		AlbumRequest ar = api.getAlbum("7e0ij2fpWaxOEHv5fUYZjd").build();

		System.out.println(ar.get().getName());
	}
}
