package com.sinfloo.demo.interfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import com.sinfloo.demo.modelo.Persona;
public interface IPersona extends CrudRepository<Persona,Integer>{
@Autowired
private IPersona data;

@Override
public  List<Persona> listar(){
    return null;
}
@Override
public  Optional<Persona> listarId(int id){
    return null;
}
@Override
public  int save(Persona p){
    return 0;
}
@Override
public  void  delete(int id){
}

}