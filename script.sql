delete FROM vitalstatistics.chthibi_birth ;

delete from vitalstatistics.chthibi_death ;

delete FROM vitalstatistics.chthibi_register ;

delete from vitalstatistics.chthibi_user;

delete from vitalstatistics.chthibi_iother;

delete from vitalstatistics.chthibi_ideathother;


ALTER TABLE vitalstatistics.chthibi_register AUTO_INCREMENT = 1 ;
ALTER TABLE vitalstatistics.chthibi_user AUTO_INCREMENT = 1 ;
ALTER TABLE vitalstatistics.chthibi_iother AUTO_INCREMENT = 1 ;
ALTER TABLE vitalstatistics.chthibi_ideathother AUTO_INCREMENT = 1 ;



