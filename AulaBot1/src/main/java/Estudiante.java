public class Estudiante {
    String nombre;
    int celular;
    String chat_id;
    int id_estudiante;

    public Estudiante(){
    }

    public Estudiante(String nombre, int celular, String chat_id, int id_estudiante) {
        this.nombre = nombre;
        this.celular = celular;
        this.chat_id = chat_id;
        this.id_estudiante = id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
}
