package services.map;

import com.muki.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;
import services.CrudService;
import services.OwnerService;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        delete(object);

    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }
}
