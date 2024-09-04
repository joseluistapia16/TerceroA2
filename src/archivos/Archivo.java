package archivos;

import domain.Usuario;
import implementsUser.DaoUsers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Archivo implements DaoUsers {

    @Override
    public String create(String ruta, String msg, boolean modo) {
        String mensaje = null;
        FileWriter escribir = null;
        try {
            File archivo = new File(ruta);
            escribir = new FileWriter(ruta, modo);
            escribir.write(msg);
            escribir.close();
            mensaje = "El registro se creo con exito";
        } catch (IOException ex) {
            mensaje = "Hubo un error en la escritura del archivo";
            System.out.println("Error de archivo");
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    @Override
    public List<Usuario> getAll(String ruta) {
        List<Usuario> lista = new ArrayList<Usuario>();
        try (BufferedReader contenido = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = contenido.readLine()) != null) {
                String[] fila = linea.split(";");
                Usuario obj = new Usuario(fila[0], fila[1], fila[2], fila[3], fila[4]);
                lista.add(obj);
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura: " + ex.getMessage());
        }
        return lista;
    }

    @Override
    public Usuario getOne(String ruta, String usuario) {
        // Prueba tercero A
        List<Usuario> lista = new ArrayList<Usuario>();
        lista = getAll(ruta);
        Usuario obj = null;
        for (int i = 0; i < lista.size(); i++) {
            if (usuario.equals(lista.get(i).getUsuario())) {
                obj = lista.get(i);
                break;

            }

        }
        return obj;
        // Prueba tercero A

    }

    @Override
    public String update(String ruta, Usuario obj) {
        List<Usuario> lista = getAll(ruta);
        String datos = "";
        String mensaje = " ";
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (obj.getUsuario().equals(lista.get(i).getUsuario())) {
                pos = i;
                break;
            }

        }
              // System.out.println(pos);
        if (pos != -1) {
            lista.set(pos, obj);
            for (int i = 0; i < lista.size(); i++) {
                datos = datos + lista.get(i).getUsuario() + ";" + lista.get(i).getContra()
                        + ";" + lista.get(i).getNombre() + ";" + lista.get(i).getApellidos() + ";"
                        + lista.get(i).getEmail() + ";\n";
            }
           // System.out.println(datos);
           create(ruta, datos, false);
           mensaje = "Sus datos han sido actualizados exitosamente";
        }
        else{
            mensaje = "Los datos no han sido actualizados";
        }

        return mensaje;

    }

    @Override
    public String delete(String ruta, String usuario) {
        List<Usuario> lista = getAll(ruta);
        String datos = "";
        String mensaje = " ";
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (usuario.equals(lista.get(i).getUsuario())) {
                pos = i;
                break;
            }
        }
              // System.out.println(pos);
        if (pos != -1) {
            lista.remove(pos);
            for (int i = 0; i < lista.size(); i++) {
                datos = datos + lista.get(i).getUsuario() + ";" + lista.get(i).getContra()
                        + ";" + lista.get(i).getNombre() + ";" + lista.get(i).getApellidos() + ";"
                        + lista.get(i).getEmail() + ";\n";
            }
//           System.out.println(datos);
           create(ruta, datos, false);
           mensaje = "Sus datos han sido eliminados exitosamente";
        }
        else{
            mensaje = "Los datos no han sido eliminados";
        }

        return mensaje;
    }

}
