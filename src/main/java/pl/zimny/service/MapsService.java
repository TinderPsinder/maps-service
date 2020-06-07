package pl.zimny.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pl.zimny.model.Location;
import pl.zimny.repostiry.LocationsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MapsService {

    private final LocationsRepository locationsRepository;

    public List<Location> getAllLocations() {
        return locationsRepository.findAll();
    }
}
