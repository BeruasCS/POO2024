package atvavaliativa1.CPFCNPJ;

public class ValidadorCPFCNPJ {

    public static int obterDigito(long numero, int posicao) {
        return (int) ((numero / (long) Math.pow(10, posicao)) % 10);
    }

    public static boolean isCpfValido(long cpf) {
        if (cpf < 10000000000L || cpf > 99999999999L) {
            return false;
        }
       
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += obterDigito(cpf, 10 - i) * (10 - i);
        }
        int primeiroDigitoVerificador = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += obterDigito(cpf, 11 - i) * (11 - i);
        }
        soma += primeiroDigitoVerificador * 2;
        int segundoDigitoVerificador = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        return obterDigito(cpf, 1) == primeiroDigitoVerificador &&
                obterDigito(cpf, 0) == segundoDigitoVerificador;
    }

    public static boolean isCpfValido(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");

        try {
            long cpfLong = Long.parseLong(cpf);
            return isCpfValido(cpfLong);
        } catch (NumberFormatException e) {
            return false;
        }
    }

   

}
