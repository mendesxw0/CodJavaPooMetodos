package OrientacaoAobjeto.main.test;


import OrientacaoAobjeto.main.dominio.PessoaDefaul;

public class PessoaTest {
    public static void main(String[] args) {
        PessoaDefaul pessoa = new PessoaDefaul();
        pessoa.name = "Lucas";
        pessoa.age = 20;
        pessoa.tel = 985451005;
        pessoa.Proficion = "Programador";

        PessoaDefaul pessoaTestDefaul = new PessoaDefaul();
        pessoaTestDefaul.age = 17;
        pessoaTestDefaul.tel = 984868939;
        pessoaTestDefaul.Proficion = "Java Developer";

        System.out.println(pessoa.name);
        System.out.println(pessoa.age);
        System.out.println(pessoa.tel);
        System.out.println(pessoa.Proficion);

        System.out.println("========================");

        System.out.println(pessoaTestDefaul.name); // Valor defaul da class
        System.out.println(pessoaTestDefaul.age);
        System.out.println(pessoaTestDefaul.tel);
        System.out.println(pessoaTestDefaul.Proficion);
    }
}
