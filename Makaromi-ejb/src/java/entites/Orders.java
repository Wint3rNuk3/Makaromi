/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author cdi308
 */
@Entity
@NamedQuery(name="queryMAJTicketsOrder", query="update Ticket t set t.orders = :paramOrder")
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne
    private Status status;

    @NotNull
    @ManyToOne
    private Address addressBil;

    @NotNull
    @ManyToOne
    private Address addressDel;

    @NotNull
    @ManyToOne
    private UserReg user;
    private String ipAddressRegistredUser;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Payment payment;

    @OneToMany(mappedBy="orders")
    private Collection<Ticket> ticketsOrder;

    public Orders() {
        init();
    }

    public Orders(Status status, Address addressBil, Address addressDel,
                 UserReg user, String ipAddressRegistredUser, Payment payment,
                 Collection<Ticket> ticketsOrder) {
        this();
        this.status = status;
        this.addressBil = addressBil;
        this.addressDel = addressDel;
        this.user = user;
        this.ipAddressRegistredUser = ipAddressRegistredUser;
        this.payment = payment;
        this.ticketsOrder = ticketsOrder;
}
    
    public void init() {
        ticketsOrder = new ArrayList();
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Address getAddressBil() {
        return addressBil;
    }

    public void setAddressBil(Address addressBil) {
        this.addressBil = addressBil;
    }

    public Address getAddressDel() {
        return addressDel;
    }

    public void setAddressDel(Address addressDel) {
        this.addressDel = addressDel;
    }

    public UserReg getUser() {
        return user;
    }

    public void setUser(UserReg user) {
        this.user = user;
    }

    public String getIpAddressRegistredUser() {
        return ipAddressRegistredUser;
    }

    public void setIpAddressRegistredUser(String ipAddressRegistredUser) {
        this.ipAddressRegistredUser = ipAddressRegistredUser;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Collection<Ticket> getTicketsOrder() {
        return ticketsOrder;
    }

    public void setTicketsOrder(Collection<Ticket> ticketsOrder) {
        this.ticketsOrder = ticketsOrder;
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.orderBean[ id=" + id + " ]";
    }
    
}