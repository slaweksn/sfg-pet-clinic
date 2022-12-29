package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<T>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save(ID id, T entity) {

		return map.put(id, entity);
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T entity) {
		map.entrySet().removeIf(e -> e.getValue().equals(entity));
	}
}
