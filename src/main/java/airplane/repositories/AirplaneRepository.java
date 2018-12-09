package airplane.repositories;

import airplane.models.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "airplane")
public interface AirplaneRepository extends JpaRepository<Airplane, Long> {
    Iterable<Airplane> findAllByName(String name);
    Iterable<Airplane> findAllByFuel(int fuel);
}
