package io.salon.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.salon.domain.Change;

public interface ChangeRepository extends JpaRepository<Change, String> {

  Change findByChangeId(String changeId);
  Change findByName(String name);
  List<Change> findByTableName(String tableName);
  List<Change> findByPreviousValue(String previousValue);
  List<Change> findByCurrentValue(String currentValue);

}
