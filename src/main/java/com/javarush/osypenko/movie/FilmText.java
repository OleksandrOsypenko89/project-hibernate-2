package com.javarush.osypenko.movie;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "film_text")
public class FilmText {

    @Id
    @Column(name = "film_id")
    private Short id;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @Column(name = "title")
    private String title;

    @Type(type = "text")
    @Column(name = "description", columnDefinition = "text")
    private String description;
}
