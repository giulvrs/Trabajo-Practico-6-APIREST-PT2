package com.example.inicial1.controllers;


import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.services.DomicilioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path="api/v1/domicilio")
public class DomicilioController extends BaseControlllerImpl<Domicilio, DomicilioServiceImpl>{

}
