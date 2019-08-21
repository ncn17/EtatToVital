package cg.ncn.migration;

import java.util.List;

import cg.ncn.dao.etatcivil.DAOEtatFactory;
import cg.ncn.dao.vital.DAOVitalFactory;
import cg.ncn.entities.etatcivil.User;
import cg.ncn.entities.vital.ChthibiUser;
import cg.ncn.tools.MyTools;

public class MigrationUser {

    public static void migrateUserEtatToVital() {
        ChthibiUser chthibiUser = null;

        List<User> listUsers = DAOEtatFactory.getUserDAO().findAll();

        for ( User etatUser : listUsers ) {
            /* create */
            chthibiUser = new ChthibiUser();
            chthibiUser.setFirstnamefrench( etatUser.getFirstNameFr() );
            chthibiUser.setFirstnamearabic( etatUser.getFirstNameAr() );
            chthibiUser.setLastnamefrench( etatUser.getLastNameFr() );
            chthibiUser.setLastnamearabic( etatUser.getLastNameAr() );
            chthibiUser.setLogin( etatUser.getLogin() );
            chthibiUser.setPassword( etatUser.getPassword() );
            chthibiUser.setDate( etatUser.getDate() );
            chthibiUser.setIdannex( MyTools.IdANNEX );
            chthibiUser.setIddistrict( MyTools.IdDISTRICT );
            chthibiUser.setAddress( etatUser.getAddress() );
            chthibiUser.setEmail( etatUser.getEmail() );
            chthibiUser.setPhone( etatUser.getPhone() );
            chthibiUser.setIdprofile( etatUser.getProfile().getIdprofile() );

            /* save */
            DAOVitalFactory.getChthibiUserDAO().save( chthibiUser );
        }
    }

}
