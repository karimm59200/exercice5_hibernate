package org.example.services;

import org.example.entities.Image;
import org.example.entities.Produit;
import org.example.interfaces.Repository;

import java.util.List;

public class ImageService extends BaseService implements Repository<Image> {
    @Override
    public boolean create(Image o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Image o) {
        return false;
    }

    @Override
    public boolean delete(Image o) {
        return false;
    }

    @Override
    public Image findById(int id) {
        return null;
    }

    @Override
    public List<Image> findAll() {
        return null;
    }
}
