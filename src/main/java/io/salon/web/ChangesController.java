package io.salon.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.salon.domain.Change;
import io.salon.repositories.ChangeRepository;

@RestController
public final class ChangesController {

  private final ChangeRepository changeRepository;

  @Autowired
  ChangesController(ChangeRepository changeRepository) {
    this.changeRepository = changeRepository;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/changes/{changeId}")
  ResponseEntity<Change> findByChangeId(@PathVariable String changeId) {
      Change change = changeRepository.findByChangeId(changeId);

      if (change == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(change, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/changes/name/{name}")
  ResponseEntity<Change> findByName(@PathVariable String name) {
      Change change = changeRepository.findByName(name);

      if (change == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(change, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/changes/table/{tableName}")
  ResponseEntity<List<Change>> findAllByTableName(@PathVariable String tableName) {
      List<Change> changes = changeRepository.findByTableName(tableName);

      if (changes == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(changes, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/changes/value/{previousValue}")
  ResponseEntity<List<Change>> findAllByPreviousValue(@PathVariable String previousValue) {
      List<Change> changes = changeRepository.findByPreviousValue(previousValue);

      if (changes == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(changes, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/changes/value/{currentValue}")
  ResponseEntity<List<Change>> findAllByCurrentValue(@PathVariable String currentValue) {
      List<Change> changes = changeRepository.findByCurrentValue(currentValue);

      if (changes == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(changes, HttpStatus.OK);
      }
  }


}
