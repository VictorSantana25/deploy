package co.com.ps.C23A.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//Genera get and set
@NoArgsConstructor//genera constructor sin argumentos
@AllArgsConstructor//genera constructor con argumentos full
@Entity //entidad de la base de datos
@Table(name= "categories") // que tabla representa en la base de datos
@Builder//patrón de diseño
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    @Column(name = "category_name", nullable = false, unique = true, length = 100)
    private String categoryName;
    @Column(length = 255)
    private String description;
}
