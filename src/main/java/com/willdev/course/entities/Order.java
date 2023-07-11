package com.willdev.course.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    @ManyToOne /*Anotation usada para instanciar a chave estrangeira da tabela*/
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {

    }

    public Order(Long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Instant getMoment() {
        return moment;
    }
    public void setMoment(Instant moment) {
        this.moment = moment;
    }
    public User getClient() {
        return client;
    }
    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return false;
        Order other = (Order) obj;
        if (getClass() != obj.getClass())
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        }else if (!id.equals(other.id))
            return false;
        return true;
    }
}
