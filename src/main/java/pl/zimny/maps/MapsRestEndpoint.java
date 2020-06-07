package pl.zimny.maps;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.model.Location;
import pl.zimny.service.MapsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MapsRestEndpoint {

    private final MapsService mapsService;

    //test endpoint
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello from maps service";
    }

    @GetMapping(path = "/locations")
    public List<Location> getAllLocations(){
       return mapsService.getAllLocations();
    }
}
