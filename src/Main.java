//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pequena Sereia", 26, "M");
        p[1] = new Pessoa("Bailarina", 21, "F");

        l[0] = new Livro("Verity", "Colleen Hoover", 319, p[0]);
        l[1] = new Livro("Incendeia-me", "Tahereh Mafi", 441, p[1]);
        l[2] = new Livro("Os segredos da mente milionária", "T. Harv Eker", 191, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());
    }
}
