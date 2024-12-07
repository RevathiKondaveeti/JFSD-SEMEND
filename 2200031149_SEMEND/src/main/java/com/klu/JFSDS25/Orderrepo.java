package com.klu.JFSDS25;

import org.antlr.v4.runtime.atn.SemanticContext.OR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Orderrepo extends JpaRepository<Order, Integer>{

}
