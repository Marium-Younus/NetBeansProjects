/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalmanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Faisal
 */
@Entity
@Table(name = "Doctor2", catalog = "Management", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Doctor2.findAll", query = "SELECT d FROM Doctor2 d"),
    @NamedQuery(name = "Doctor2.findById", query = "SELECT d FROM Doctor2 d WHERE d.id = :id"),
    @NamedQuery(name = "Doctor2.findByFirstName", query = "SELECT d FROM Doctor2 d WHERE d.firstName = :firstName"),
    @NamedQuery(name = "Doctor2.findByLastName", query = "SELECT d FROM Doctor2 d WHERE d.lastName = :lastName"),
    @NamedQuery(name = "Doctor2.findByContact", query = "SELECT d FROM Doctor2 d WHERE d.contact = :contact"),
    @NamedQuery(name = "Doctor2.findBySpecialization", query = "SELECT d FROM Doctor2 d WHERE d.specialization = :specialization"),
    @NamedQuery(name = "Doctor2.findByTiming", query = "SELECT d FROM Doctor2 d WHERE d.timing = :timing")})
public class Doctor2 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "contact")
    private String contact;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "timing")
    private String timing;

    public Doctor2() {
    }

    public Doctor2(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        String oldSpecialization = this.specialization;
        this.specialization = specialization;
        changeSupport.firePropertyChange("specialization", oldSpecialization, specialization);
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        String oldTiming = this.timing;
        this.timing = timing;
        changeSupport.firePropertyChange("timing", oldTiming, timing);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor2)) {
            return false;
        }
        Doctor2 other = (Doctor2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotalmanagement.Doctor2[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
