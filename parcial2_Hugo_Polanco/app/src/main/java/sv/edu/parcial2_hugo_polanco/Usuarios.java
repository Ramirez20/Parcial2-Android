package sv.edu.parcial2_hugo_polanco;

public class Usuarios {
    private String nombre;
    private String cargo;
    private String empresa;

    public Usuarios(String nombre, String cargo, String empresa) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

}
