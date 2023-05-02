package com.javarush.osypenko.movie;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Byte id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Lob
    @Column(name = "picture", columnDefinition = "BLOB")
    private byte[] picture;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "active", columnDefinition = "BIT")
    private Boolean active;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @UpdateTimestamp
    @Column(name = "last_update")
    private LocalDateTime updated;
}
