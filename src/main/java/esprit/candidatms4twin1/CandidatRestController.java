package esprit.candidatms4twin1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidats")
public class CandidatRestController {
    public String title="Welcome from Candidat4TWIN1";
    @Autowired
    private ICandidat iCandidat;
    @RequestMapping("/hello")
    public String getTtitle(){
        return title;
    }

    @GetMapping
    public List<Candidat> getAllCandidats(){
       return iCandidat.allCandidat();
    }
}
