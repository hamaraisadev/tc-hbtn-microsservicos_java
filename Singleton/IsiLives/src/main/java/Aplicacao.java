public class Aplicacao {
    public static void main(String[] args) {
        DatabaseSingleton db;
        db = DatabaseSingleton.getInstance();
        db.executarComando("Select * from tbl_produto");

        DatabaseSingleton outroDB = DatabaseSingleton.getInstance();
        outroDB.executarComando("INSERT into tbl_cliente values(?,?,?,?)");
    }
}
