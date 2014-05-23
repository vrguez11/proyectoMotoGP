/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "pilotos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pilotos.findAll", query = "SELECT p FROM Pilotos p"),
    @NamedQuery(name = "Pilotos.findByCodPiloto", query = "SELECT p FROM Pilotos p WHERE p.codPiloto = :codPiloto"),
    @NamedQuery(name = "Pilotos.findByNumeroPiloto", query = "SELECT p FROM Pilotos p WHERE p.numeroPiloto = :numeroPiloto"),
    @NamedQuery(name = "Pilotos.findByNombre", query = "SELECT p FROM Pilotos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pilotos.findByNacionalidad", query = "SELECT p FROM Pilotos p WHERE p.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Pilotos.findByEquipo", query = "SELECT p FROM Pilotos p WHERE p.equipo = :equipo"),
    @NamedQuery(name = "Pilotos.findByMoto", query = "SELECT p FROM Pilotos p WHERE p.moto = :moto"),
    @NamedQuery(name = "Pilotos.findByFechaNac", query = "SELECT p FROM Pilotos p WHERE p.fechaNac = :fechaNac"),
    @NamedQuery(name = "Pilotos.findBySueldo", query = "SELECT p FROM Pilotos p WHERE p.sueldo = :sueldo"),
    @NamedQuery(name = "Pilotos.findByVigenteCampeon", query = "SELECT p FROM Pilotos p WHERE p.vigenteCampeon = :vigenteCampeon")})
public class Pilotos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codPiloto")
    private Integer codPiloto;
    @Column(name = "numeroPiloto")
    private Integer numeroPiloto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "equipo")
    private String equipo;
    @Column(name = "moto")
    private String moto;
    @Column(name = "fechaNac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "sueldo")
    private Float sueldo;
    @Column(name = "vigenteCampeon")
    private Boolean vigenteCampeon;
    @JoinColumn(name = "posicion", referencedColumnName = "posicion")
    @OneToOne
    private Clasificacion posicion;

    public Pilotos() {
    }

    public Pilotos(Integer codPiloto) {
        this.codPiloto = codPiloto;
    }

    public Integer getCodPiloto() {
        return codPiloto;
    }

    public void setCodPiloto(Integer codPiloto) {
        this.codPiloto = codPiloto;
    }

    public Integer getNumeroPiloto() {
        return numeroPiloto;
    }

    public void setNumeroPiloto(Integer numeroPiloto) {
        this.numeroPiloto = numeroPiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Boolean getVigenteCampeon() {
        return vigenteCampeon;
    }

    public void setVigenteCampeon(Boolean vigenteCampeon) {
        this.vigenteCampeon = vigenteCampeon;
    }

    public Clasificacion getPosicion() {
        return posicion;
    }

    public void setPosicion(Clasificacion posicion) {
        this.posicion = posicion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPiloto != null ? codPiloto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pilotos)) {
            return false;
        }
        Pilotos other = (Pilotos) object;
        if ((this.codPiloto == null && other.codPiloto != null) || (this.codPiloto != null && !this.codPiloto.equals(other.codPiloto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pilotos[ codPiloto=" + codPiloto + " ]";
    }
    
}
