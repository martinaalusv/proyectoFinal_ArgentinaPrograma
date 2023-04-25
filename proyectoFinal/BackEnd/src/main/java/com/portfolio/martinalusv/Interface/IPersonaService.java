
package com.portfolio.martinalusv.Interface;

import com.portfolio.martinalusv.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Llamar a la lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto (persona)
    public void savePersona(Persona persona);
    
    //Eliminar un usuario (por ID)
    public void deletePersona(Long id);
    
    //Buscar persona (por ID)
    public Persona findPersona(Long id);
    
    
}
