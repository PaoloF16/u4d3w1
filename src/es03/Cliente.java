package es03;

import java.util.Random;

public class Cliente {
    private String codiceCliente;
    private String name;
    private String cognome;
    private String email;
    private String data;

    public Cliente(String name,String cognome, String email, String data){
        Random codiceRandom = new Random(100);
        codiceCliente = "#"+ codiceRandom.nextInt();
        this.name = name;
        this.cognome = cognome;
        this.email = email;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente='" + codiceCliente + '\'' +
                ", name='" + name + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
