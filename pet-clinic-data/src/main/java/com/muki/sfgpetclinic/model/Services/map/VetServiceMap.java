package services.map;

import com.muki.sfgpetclinic.model.Vet;
import org.springframework.stereotype.Service;
import services.CrudService;
import services.VetService;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        delete(object);

    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }
}
