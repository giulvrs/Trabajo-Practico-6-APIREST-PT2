package com.example.inicial1.controllers;


import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.LocalidadServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path="api/v1/localidad")
public class LocalidadController extends BaseControlllerImpl<Localidad, LocalidadServiceImpl>{

}
