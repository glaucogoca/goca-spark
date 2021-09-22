package br.com.goca;

import static spark.Spark.*;

public class Server {

    public static void main(String[] args) {
        get("/goca", (req,res) -> "Olá Codificadores, tudo bem com vocês? Comigo tá tudo bem!");
    }
}
