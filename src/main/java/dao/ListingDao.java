package dao;

import dto.ListingDto;
import java.util.List;
import mongo.MongoConnection;

public class ListingDao extends MongoDao<ListingDto> implements DataAccessObject<ListingDto> {

	// use lazy loading for the singleton
	private static ListingDao instance;

	public static ListingDao getInstance() {
		if (instance == null) {
			instance = new ListingDao(new MongoConnection());
		}
		return instance;
	}

	ListingDao(MongoConnection connection) {
		super(connection);
		collection = mongoConnection.getCollection("MyCollection", ListingDto.class);
	}

	@Override
	public ListingDto put(ListingDto item) {
		// fill this out
		return null;
	}

	@Override
	public List<ListingDto> getItems() {
		// use .into
		// fill this out
		return null;
	}

	@Override
	public void delete(String id) {
		// fill this out;
	}

}
