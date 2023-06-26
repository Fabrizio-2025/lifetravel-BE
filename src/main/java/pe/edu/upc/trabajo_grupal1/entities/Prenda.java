package pe.edu.upc.trabajo_grupal1.entities;

import javax.persistence.*;

@Entity
@Table(name = "HotelDetalles")
public class Prenda {
    public Prenda() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHotelDetalles")
    private int idPrenda;

    @Column(name = "detallesHotel", length = 50, nullable = false)
    private String nombrePrenda;

    @Column(name = "colorHotel", length = 50, nullable = false)
    private String colorPrenda;

    @Column(name = "RUC", length = 50, nullable = false)
    private String disenioPrenda;

    @ManyToOne
    @JoinColumn(name = "idHotel", nullable = false)
    private Tienda tienda;

    @ManyToOne
    @JoinColumn(name = "idNombrePlan", nullable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "idCantidadDias", nullable = false)
    private Talla talla;

    @Column(name = "Precio", nullable = false)
    private float preciounitario;


    public Prenda(int idPrenda, String nombrePrenda, String colorPrenda, String disenioPrenda, Tienda tienda, Marca marca, Talla talla, float preciounitario) {
        this.idPrenda = idPrenda;
        this.nombrePrenda = nombrePrenda;
        this.colorPrenda = colorPrenda;
        this.disenioPrenda = disenioPrenda;
        this.tienda = tienda;
        this.marca = marca;
        this.talla = talla;
        this.preciounitario = preciounitario;
    }

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public String getColorPrenda() {
        return colorPrenda;
    }

    public void setColorPrenda(String colorPrenda) {
        this.colorPrenda = colorPrenda;
    }

    public String getDisenioPrenda() {
        return disenioPrenda;
    }

    public void setDisenioPrenda(String disenioPrenda) {
        this.disenioPrenda = disenioPrenda;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public float getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(float preciounitario) {
        this.preciounitario = preciounitario;
    }
}
