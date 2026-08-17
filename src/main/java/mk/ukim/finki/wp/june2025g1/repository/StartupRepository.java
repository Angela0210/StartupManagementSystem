package mk.ukim.finki.wp.june2025g1.repository;


import mk.ukim.finki.wp.june2025g1.model.Startup;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StartupRepository extends JpaSpecificationRepository<Startup, Long> {
//    List<Startup> findByNameContainingIgnoreCase(String text);
}