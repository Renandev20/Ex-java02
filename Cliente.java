public class Cliente {
    public String name;
    protected int cpf;
    protected int rg;
    public String sexo;

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.name = "Renan";
        c1.cpf = 9741;
        c1.rg = 999;
        c1.sexo = "Homen";
        System.out.println(c1);
        System.out.println("o cpf do cliente é "+ c1.cpf);
        System.out.println("o  sexo do  cliente é "+ c1.rg);
        System.out.println("o rg do é  cliente "+ c1.sexo);
        System.out.println("o nome do cliente  é "+ c1.name);


    }
}
