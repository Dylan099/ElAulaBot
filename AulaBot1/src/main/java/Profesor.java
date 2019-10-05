public class Profesor {
    int id_profesor;
    String chat_id;
    int celular;
    String nombre;

    public Profesor(){}

    public Profesor(int id_profesor, String chat_id, int celular, String nombre) {
        this.id_profesor = id_profesor;
        this.chat_id = chat_id;
        this.celular = celular;
        this.nombre = nombre;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
