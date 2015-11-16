package pl.atena.aj.be.music.web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

@ManagedBean
@SessionScoped
public class StatisticsBean {

	private PieChartModel pieModel = new PieChartModel();

	private AlbumDAO albumDAO = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());

	@PostConstruct
	public void setup() {
		pieModel = createPieChartModel();
	}

	private PieChartModel createPieChartModel() {
		pieModel.setLegendPosition("w");
		pieModel.setShowDataLabels(true);

		Map<String, Integer> genreCount = new HashMap<>();

		fillDataMap(genreCount);

		fillPieModel(genreCount);

		return pieModel;
	}

	private void fillPieModel(Map<String, Integer> genreCount) {
		Iterator<Entry<String, Integer>> it = genreCount.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> pair = it.next();

			pieModel.set((String) pair.getKey(), (Number) pair.getValue());
			it.remove();
		}
	}

	private void fillDataMap(Map<String, Integer> genreCount) {
		List<AlbumDTO> allAlbums = albumDAO.getAll();

		for (AlbumDTO album : allAlbums) {
			String genre = album.getGenre().getName();

			Integer currentCount = genreCount.get(genre);
			currentCount = currentCount == null ? 0 : currentCount;
			
			genreCount.put(genre, currentCount + 1);
		}
		
		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(genreCount);
		genreCount = sortedMap;
	}

	public PieChartModel getPieModel() {
		return pieModel;
	}

	public void setPieModel(PieChartModel pieModel) {
		this.pieModel = pieModel;
	}
}