package pe.edu.upc.trabajo_grupal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_grupal1.entities.Carrito_Compras;
import pe.edu.upc.trabajo_grupal1.entities.Cliente;

import java.util.List;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Integer> {
    @Query("from Cliente c where c.nombreCliente like %:nombreCliente")
    List<Cliente> search(@Param("nombreCliente") String nombreCliente);

    List<Cliente> findByEmailCliente(String valor);

    @Query(value = "select * from cliente c where c.email_cliente like '%@gmail.com' order by c.email_cliente asc",nativeQuery = true)
    List<Cliente> buscardominio();

    @Query(value="SELECT nombre_cliente, count(nombre_cliente) as Cantidad FROM comprobante_de_pago c inner join cliente ON cliente.id_cliente = c.id_cliente GROUP BY nombre_cliente",nativeQuery = true)
    List<String[]>clienteFrecuente();
}
