package MunjulApp;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByIdMember", query = "SELECT c FROM Customer c WHERE c.idMember = :idMember"),
    @NamedQuery(name = "Customer.findByNama", query = "SELECT c FROM Customer c WHERE c.nama = :nama"),
    @NamedQuery(name = "Customer.findByAlamat", query = "SELECT c FROM Customer c WHERE c.alamat = :alamat"),
    @NamedQuery(name = "Customer.findByTelepon", query = "SELECT c FROM Customer c WHERE c.telepon = :telepon")})
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MEMBER")
    private String idMember;
    @Column(name = "NAMA")
    private String nama;
    @Column(name = "ALAMAT")
    private String alamat;
    @Column(name = "TELEPON")
    private Long telepon;

    public Customer() {
    }

    public Customer(String idMember, String nama, String alamat, Long telepon) {
        this.idMember = idMember;
        this.nama=nama;
        this.alamat=alamat;
        this.telepon=telepon;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Long getTelepon() {
        return telepon;
    }

    public void setTelepon(Long telepon) {
        this.telepon = telepon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMember != null ? idMember.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.idMember == null && other.idMember != null) || (this.idMember != null && !this.idMember.equals(other.idMember))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MunjulApp.Customer[ idMember=" + idMember + " ]";
    }
    
}
