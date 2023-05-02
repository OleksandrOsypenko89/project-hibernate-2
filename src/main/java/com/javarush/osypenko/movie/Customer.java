package com.javarush.osypenko.movie;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Short id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "active", columnDefinition = "BIT")
    private Boolean active;

    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime create;

    @UpdateTimestamp
    @Column(name = "last_update")
    private LocalDateTime updated;
}
