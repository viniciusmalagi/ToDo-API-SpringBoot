package br.com.vmlg.springboottodoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vmlg.springboottodoapi.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
