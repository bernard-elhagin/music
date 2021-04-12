package pl.atena.aj.be.music.dao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import pl.atena.aj.be.music.domain.AlbumDTO;

public class LazyAlbumDataModel extends LazyDataModel<AlbumDTO> {

	private static final long serialVersionUID = 7098721153907894639L;

	private final List<AlbumDTO> datasource;

	public LazyAlbumDataModel(List<AlbumDTO> datasource) {
		this.datasource = datasource;
	}

	@Override
    public Object getRowKey(AlbumDTO album) {
        return album.getAlbumId();
    }

	@Override
	public AlbumDTO getRowData(String rowKey) {
        for (AlbumDTO album : datasource) {
            if (album.getAlbumId() == Integer.parseInt(rowKey)) {
                return album;
            }
        }

        return null;
    }

	public List<AlbumDTO> getDatasource() {
		return datasource;
	}

	public int getDatasourceSize() {
		return datasource.size();
	}

	@Override
	public List<AlbumDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {

		List<AlbumDTO> data = new ArrayList<>();

		// filter
		for (AlbumDTO album : datasource) {
			boolean match = true;

			if (filters != null) {
				for (String s : filters.keySet()) {
					try {
						String filterProperty = s;

						Object filterValue = filters.get(filterProperty);

						Field field = album.getClass().getDeclaredField(filterProperty);
						field.setAccessible(true);

						String fieldValue = String.valueOf(field.get(album)).toLowerCase();

						if (filterValue == null || fieldValue.startsWith(filterValue.toString().toLowerCase())) {
							match = true;
						} else {
							match = false;
							break;
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
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
		setRowCount(dataSize);

		// paginate
		if (dataSize > pageSize) {
			try {
				return data.subList(first, first + pageSize);
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				return data.subList(first, first + (dataSize % pageSize));
			}
		} else {
			return data;
		}
	}
}