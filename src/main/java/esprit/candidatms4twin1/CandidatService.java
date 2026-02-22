package esprit.candidatms4twin1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService implements ICandidat {

    @Autowired
    private CandidatRepositories candidatRepo;
    @Autowired
    public JobClient jobClient;
    @Override
    public List<Candidat> allCandidat() {
        return candidatRepo.findAll();
    }

    @Override
    public Candidat getCandidatById(int id) {
        return candidatRepo.findById(id).orElse(null);
    }

    @Override
    public Candidat addCandidat(Candidat c) {
        return candidatRepo.save(c);
    }

    @Override
    public Candidat updateCandidat(int id, Candidat c) {
        Candidat existing = candidatRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setNom(c.getNom());
            existing.setPrenom(c.getPrenom());
            existing.setEmail(c.getEmail());
            return candidatRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCandidat(int id) {
        candidatRepo.deleteById(id);
    }

    public List<Job> getJobsListe() {
        return  jobClient.getJobs();
    }
    public Job getJobClient(int id) {
        return jobClient.getJob(id);
    }
}
