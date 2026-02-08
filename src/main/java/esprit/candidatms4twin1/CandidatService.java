package esprit.candidatms4twin1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService implements ICandidat {

    @Autowired
    private CandidatRepositories candidatRepo;

    @Override
    public List<Candidat> allCandidat() {
        return candidatRepo.findAll();
    }
}
