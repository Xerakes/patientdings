package de.andre.controller;
import java.util.List;

import de.andre.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import de.andre.service.PatientService;

@RestController
public class PatientController
{
    @Autowired
    PatientService patientService;
    @GetMapping("/patient")
    private List<Patient> getAllPatient()
    {
        return patientService.getAllPatient();
    }
    @GetMapping("/patient/{id}")
    private Patient getPatient(@PathVariable("id") int id)
    {
        return patientService.getPatientById(id);
    }
    @DeleteMapping("/patient/{id}")
    private void deletePatient(@PathVariable("id") int id)
    {
        patientService.delete(id);
    }

    @PostMapping("/patient")
    private int saveStudent(@RequestBody Patient patient)
    {
        patientService.saveOrUpdate(patient);
        return patient.getId();
    }
}