package com.sinfloo.demo.interfaces;

import java.util.List;
import java.util.Optional;

import com.sinfloo.demo.modelo.Persona;
public interface IpersonaService{
    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save();
    public void delete();

}