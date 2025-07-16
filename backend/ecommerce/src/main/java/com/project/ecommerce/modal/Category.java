package com.project.ecommerce.modal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;

    @NotNull
    @Column
    private String catogoryId;

    @ManyToOne
    private Category parentCategory;

    @NotNull
    private Integer level;

}
