package esprit.candidatms4twin1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "JobMS4TWIN1"
        , configuration = FeignConfig.class)
public interface JobClient {

    @RequestMapping("/jobs")
    public List<Job> getJobs();

    @RequestMapping("/jobs/{id}")
    public Job getJob(@PathVariable int id);
}
