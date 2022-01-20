package main.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.Tour;
import main.service.TourService;

@RestController
@RequestMapping("/api")
public class TourRestController {

	@Autowired
	private TourService tourService;

	@GetMapping("/tours")
	private ResponseEntity<List<Tour>> getTours() {
		List<Tour> tours = tourService.getAll();

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Method", "getTours");

		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(tours);
	}

	@GetMapping("/tours/{id}")
	private ResponseEntity<Tour> getTour(@PathVariable int id) {
		Tour tour = tourService.getById(id);

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Method", "getTour");

		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(tour);
	}
	
	@PostMapping(path = "/tours", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<Tour> saveTour(@RequestBody Tour tour) {
		tour.setId(0);
		tourService.saveOrUpdate(tour);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Method", "saveTour");
		
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(tour);
	}
	
	@PutMapping("/tours")
	private ResponseEntity<Void> editTour(@RequestBody Tour tour) {
		tourService.saveOrUpdate(tour);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Method", "editTour");

		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
		
	}
	
	@DeleteMapping("/tours/{id}")
	private ResponseEntity<Void> deleteTour(@PathVariable int id) {
		tourService.delete(id);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Method", "deleteTour");

		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(null);
	}
}
