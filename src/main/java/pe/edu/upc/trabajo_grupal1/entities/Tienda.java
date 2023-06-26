package pe.edu.upc.trabajo_grupal1.entities;

import javax.persistence.*;

@Entity
@Table(name = "Hotel")
public class Tienda {
    public Tienda() {
    }

    public Tienda(int idTienda, String nombreTienda, String direccionTienda, String emailTienda, int telefonoTienda) {
        this.idTienda = idTienda;
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.emailTienda = emailTienda;
        this.telefonoTienda = telefonoTienda;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHotel")
    private int idTienda;

    @Column(name = "nombreHotel", length = 50, nullable = false)
    private String nombreTienda;

    @Column(name = "direccionHotel", length = 50, nullable = false)
    private String direccionTienda;

    @Column(name = "emailHotel", length = 50, nullable = false)
    private String emailTienda;

    @Column(name = "telefonoHotel", length = 9, nullable = false)
    private int telefonoTienda;


    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getEmailTienda() {
        return emailTienda;
    }

    public void setEmailTienda(String emailTienda) {
        this.emailTienda = emailTienda;
    }

    public int getTelefonoTienda() {
        return telefonoTienda;
    }

    public void setTelefonoTienda(int telefonoTienda) {
        this.telefonoTienda = telefonoTienda;
    }
}
