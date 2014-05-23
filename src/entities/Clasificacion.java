/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "clasificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clasificacion.findAll", query = "SELECT c FROM Clasificacion c"),
    @NamedQuery(name = "Clasificacion.findByPosicion", query = "SELECT c FROM Clasificacion c WHERE c.posicion = :posicion"),
    @NamedQuery(name = "Clasificacion.findByPuntos", query = "SELECT c FROM Clasificacion c WHERE c.puntos = :puntos")})
public class Clasificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "posicion")
    private Integer posicion;
    @Column(name = "puntos")
    private Integer puntos;
    @OneToOne(mappedBy = "posicion")
    private Pilotos pilotos;

    public Clasificacion() {
    }

    public Clasificacion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Pilotos getPilotos() {
        return pilotos;
    }

    public void setPilotos(Pilotos pilotos) {
        this.pilotos = pilotos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posicion != null ? posicion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificacion)) {
            return false;
        }
        Clasificacion other = (Clasificacion) object;
        if ((this.posicion == null && other.posicion != null) || (this.posicion != null && !this.posicion.equals(other.posicion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Clasificacion[ posicion=" + posicion + " ]";
    }
    
}
