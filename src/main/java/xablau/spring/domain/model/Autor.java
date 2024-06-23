package xablau.spring.domain.model;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "tb_autor")
public class Autor {

    @Id
    private Long Id;
    @jakarta.persistence.Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
