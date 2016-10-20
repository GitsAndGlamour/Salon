 package io.salon.repositories;

 import java.util.List;
 import io.salon.domain.Addon;
 import org.springframework.data.jpa.repository.JpaRepository;

 public interface AddonRepository extends JpaRepository<Addon, String>{
 	Addon findByAddonId(String addonId);
 	Addon findByName(String name);
 	List<Addon> findAll();
 	}
