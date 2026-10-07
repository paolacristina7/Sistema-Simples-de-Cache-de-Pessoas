

void main() {

    List<Pessoa> banco = new ArrayList<>();
    List<Pessoa> cache = new ArrayList<>();

    banco.add(new Pessoa(1, "Jonata", 17));
    banco.add(new Pessoa(2, "Eduardo", 18));
    banco.add(new Pessoa(3, "Paola", 19));
    banco.add(new Pessoa(4, "Lucas", 20));
    banco.add(new Pessoa(5, "Mariana", 21));
    banco.add(new Pessoa(6, "Ana", 23));
    banco.add(new Pessoa(7, "Pedro", 24));
    banco.add(new Pessoa(8, "Julia", 25));
    banco.add(new Pessoa(9, "Rafael", 26));
    banco.add(new Pessoa(10, "Bruno", 27));

    cache.add(banco.get(0));
    cache.add(banco.get(1));
    cache.add(banco.get(2));
    cache.add(banco.get(3));
    cache.add(banco.get(4));
    cache.add(banco.get(5));
    cache.add(banco.get(6));
    cache.add(banco.get(7));
    cache.add(banco.get(8));
    cache.add(banco.get(9));

    IO.println("Cache:");
    IO.println("Cache:");

    for (Pessoa p : cache) {
        IO.println(p.getId() + " - " + p.getNome() + " - " + p.getIdade());
    }

    IO.println("Digite o ID:");
    int id = Integer.parseInt(IO.readln());


    Pessoa pessoa = null;

    for (Pessoa p : cache) {

        if (p.getId() == id) {
            pessoa = p;
        }
    }

    if (pessoa != null) {
        IO.println("Pessoa encontrada no cache: " + pessoa.getNome());
    }

    if (pessoa == null) {

        for (Pessoa p : banco) {

            if (p.getId() == id) {
                pessoa = p;
            }
        }
    }

    if (pessoa != null && !cache.contains(pessoa)) {

        if (cache.size() == 10) {
            cache.remove(0);
        }

        cache.add(pessoa);

        IO.println(
                "Pessoa buscada no banco e adicionada ao cache: "
                        + pessoa.getNome()
        );
    }

    if (pessoa == null) {
        IO.println("Pessoa não encontrada.");
    }
}
