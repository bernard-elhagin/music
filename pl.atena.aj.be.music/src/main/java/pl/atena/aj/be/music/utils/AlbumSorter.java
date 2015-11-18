package pl.atena.aj.be.music.utils;

import java.util.Comparator;

import org.primefaces.model.SortOrder;

import pl.atena.aj.be.music.domain.AlbumDTO;

public class AlbumSorter implements Comparator<AlbumDTO> {
	private String sortField;

	private SortOrder sortOrder;

	public AlbumSorter(String sortField, SortOrder sortOrder) {
		this.sortField = sortField;
		this.sortOrder = sortOrder;
	}

	public int compare(AlbumDTO album1, AlbumDTO album2) {
		try {
			Object value1 = AlbumDTO.class.getField(this.sortField).get(album1);
			Object value2 = AlbumDTO.class.getField(this.sortField).get(album2);

			int value = ((Comparable) value1).compareTo(value2);

			return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;

		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}