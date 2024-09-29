package de.andre.repository;

import de.andre.model.Patient;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PatientRepository extends CrudRepository<Patient, Integer>
{
    /**
     *      Optional um eine eigene query auszuführen
     *     @Transactional
     *     @Modifying
     *     @Query(value="INSERT INTO PATIENT (id, name) VALUES (?1, ?2)", nativeQuery = true)
     *     void addPatient(int id, String name);
     */

}