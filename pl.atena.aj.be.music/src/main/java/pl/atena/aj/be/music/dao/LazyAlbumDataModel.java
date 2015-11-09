package pl.atena.aj.be.music.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import pl.atena.aj.be.music.domain.AlbumDTO;

public class LazyAlbumDataModel extends LazyDataModel<AlbumDTO> {

	private static final long serialVersionUID = 7098721153907894639L;

	private List<AlbumDTO> datasource;

	public LazyAlbumDataModel(List<AlbumDTO> datasource) {
		this.datasource = datasource;
	}

	public AlbumDTO getRowData(int rowKey) {
		for (AlbumDTO album : datasource) {
			if (album.getAlbumId() == rowKey) {
				return album;
			}
		}

		return null;
	}

	@Override
	public Object getRowKey(AlbumDTO album) {
		return album.getAlbumId();
	}

	@Override
	public List<AlbumDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		
		List<AlbumDTO> data = new ArrayList<AlbumDTO>();

		// filter
		for (AlbumDTO album : datasource) {
			boolean match = true;

			if (filters != null) {
				for (Iterator<String> it = filters.keySet().iterator(); it.hasNext();) {
					try {
						String filterProperty = it.next();
						Object filterValue = filters.get(filterProperty);
						String fieldValue = String.valueOf(album.getClass().getField(filterProperty).get(album));

						if (filterValue == null || fieldValue.startsWith(filterValue.toString())) {
							match = true;
						} else {
							match = false;
							break;
						}
					} catch (Exception e) {
						match = false;
					}
				}
			}

			if (match) {
				data.add(album);
			}
		}

		// rowCount
		int dataSize = data.size();
		this.setRowCount(dataSize);

		// paginate
		if (dataSize > pageSize) {
			try {
				return data.subList(first, first + pageSize);
			} catch (IndexOutOfBoundsException e) {
				return data.subList(first, first + (dataSize % pageSize));
			}
		} else {
			return data;
		}
	}
}