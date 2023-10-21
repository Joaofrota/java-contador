public class Contador {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Por favor, insira exatamente dois números como parâmetros.");
            }

            int primeiroParametro = Integer.parseInt(args[0]);
            int segundoParametro = Integer.parseInt(args[1]);

            if (primeiroParametro >= segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            int quantidadeIteracoes = segundoParametro - primeiroParametro;
            for (int i = 1; i <= quantidadeIteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os parâmetros devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
