package OrientacaoAobjeto.main.test;

import OrientacaoAobjeto.main.dominio.ClassArray;

public class ClassTest01 {
    public static void main(String[] args) {
        ClassArray pessoa = new ClassArray();
        pessoa.nome = "Lucas";
        pessoa.age = 17;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.age);
        System.out.println(pessoa.sexo);

    }
}
