package com.sinfloo.demo.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.sinfloo.demo.interfaceService.IpersonaService;
import com.sinfloo.demo.modelo.Persona;

public class PersonaService implements IpersonaService{
    @Autowired
    private Ipersona data;
    public List<Persona> listar(){
        return (List<Persona>)data.findAll();
    }
    public Optional <Persona> listadId (int id){
        return null;
    }
    public int save (Persona p){
        return 0;
    }
    public void delete (int id){
    }

}
