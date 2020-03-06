package springmvc_example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
 @Column(name = "nombre")
 private String nombre;
 
 @Column(name = "apellido")
 private String apellido;
 
 @Column(name = "tipo_documento")
 private String tipo_documento;
 
 @Column(name = "numero_documento")
 private String numero_documento;

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String getApellido() {
  return apellido;
 }

 public void setApellido(String apellido) {
  this.apellido = apellido;
 }

 public String getTipoDocumento() {
  return tipo_documento;
 }

 public void setTipoDocumento(String tipo_documento) {
  this.tipo_documento = tipo_documento;
 }

 public String getNumeroDocumento() {
  return numero_documento;
 }

 public void setNumeroDocumento(String numero_documento) {
  this.numero_documento = numero_documento;
 }
}
