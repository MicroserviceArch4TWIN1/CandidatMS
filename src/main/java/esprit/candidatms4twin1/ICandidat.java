package esprit.candidatms4twin1;

import java.util.List;

public interface ICandidat {
    public List<Candidat> allCandidat();

    Candidat getCandidatById(int id);

    Candidat addCandidat(Candidat c);

    Candidat updateCandidat(int id, Candidat c);

    void deleteCandidat(int id);
}
