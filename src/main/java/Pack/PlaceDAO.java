package Pack;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class PlaceDAO {

    private ArrayList<Place> placeList = new ArrayList<Place>();

    public void addPlace(PlaceDTO placeDTO) {
        Place place = new Place();
        place.setTitle(placeDTO.getTitle());
        place.setDescription(placeDTO.getDescription());
        place.setLongtitude(placeDTO.getLongtitude());
        place.setLatitude(placeDTO.getLatitude());
        System.out.println();
        placeList.add(place);
    }
}
