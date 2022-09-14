package br.com.spring.crud.restapicrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Carro {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String marca;
  String modelo;
  Integer ano; 
}
