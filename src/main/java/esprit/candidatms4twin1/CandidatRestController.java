package esprit.candidatms4twin1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidats")
public class CandidatRestController {

    @Autowired
    private ICandidat iCandidat;

    @Autowired
    CandidatService candidatService;

    @GetMapping("/hello")
    public String getTitle() {
        return "Welcome from Candidat4TWIN1";
    }

    // GET http://localhost:8080/candidats
    @GetMapping
    public List<Candidat> getAllCandidats() {
        return iCandidat.allCandidat();
    }

    // GET http://localhost:8080/candidats/{id}
    @GetMapping("/{id}")
    public Candidat getCandidat(@PathVariable int id) {
        return iCandidat.getCandidatById(id);
    }

    // POST http://localhost:8080/candidats
    @PostMapping
    public Candidat addCandidat(@RequestBody Candidat c) {
        return iCandidat.addCandidat(c);
    }

    // PUT http://localhost:8080/candidats/{id}
    @PutMapping("/{id}")
    public Candidat updateCandidat(@PathVariable int id,
                                   @RequestBody Candidat c) {
        return iCandidat.updateCandidat(id, c);
    }

    // DELETE http://localhost:8080/candidats/{id}
    @DeleteMapping("/{id}")
    public void deleteCandidat(@PathVariable int id) {
        iCandidat.deleteCandidat(id);
    }

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return candidatService.getJobsListe();
    }
    @GetMapping("/jobs/{id}")
    public Job getJobbyId(@PathVariable("id") int id) {
        return candidatService.getJobClient(id);
    }
}
