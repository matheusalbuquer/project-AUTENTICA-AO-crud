package tech.buildrun.springsecurity.reposioty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.buildrun.springsecurity.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
