package cg.ncn.dao.etatcivil;

import java.util.List;

public interface DAOEtatCivil<T> {

    public List<T> findAll();

    public int save( T obj );
    
    public T finbId(int id);

}
