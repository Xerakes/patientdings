package de.andre.service;
import java.util.ArrayList;
import java.util.List;

import de.andre.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.andre.repository.PatientRepository;
@Service
public class PatientService
{
    @Autowired
    PatientRepository patientRepository;
    //getting all student records  
    public List<Patient> getAllPatient()
    {
        List<Patient> users = new ArrayList<Patient>();
        patientRepository.findAll().forEach(users::add);
        return users;
    }
    //getting a specific record  
    public Patient getPatientById(int id)
    {
        return patientRepository.findById(id).get();
    }
    public void saveOrUpdate(Patient patient)
    {
        patientRepository.save(patient);
    }
    //deleting a specific record  
    public void delete(int id)
    {
        patientRepository.deleteById(id);
    }
}