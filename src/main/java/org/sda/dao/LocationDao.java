package org.sda.dao;

import org.sda.models.Location;

import java.util.List;
import java.util.UUID;

public interface LocationDao {
    Location findById(UUID id);
    List<Location> findAll();
    public void save (Location location);
    void update (Location location);
    void delete (Location location);

}
