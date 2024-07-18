package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class OwnerSDJpaServiceTest {

    OwnerSDJpaService service;


    @BeforeEach
    void setUp() {
        service = new OwnerSDJpaService(null, null, null);

    }

    @Test
    void testDelete() {

    }

    @Test
    void testDeleteById() {

    }

    @Test
    void testFindAll() {

    }

    @Test
    void testFindAllByLastNameLike() {

    }

    @Test
    void testFindById() {

    }

    @Disabled
    @Test
    void testFindByLastName() {
        Owner findOwner = service.findByLastName("Buck");

    }

    @Test
    void testSave() {

    }
}
