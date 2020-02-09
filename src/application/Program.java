package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2020-02-09T20:47:00Z"));

        System.out.println(sfd.format(d));

        //Vamos acrescentar 4 horas nessa data:
        Calendar cal = Calendar.getInstance();
        cal.setTime(d); //Aqui em cal temos a data de refencia a qual vamos modificar

        //Definimos os valores que vamos adicionar , dias , horas minutos...
        //Digamos que quero que um boleto tenha uma data para vencimento em 10 dias...
        cal.add(Calendar.HOUR_OF_DAY,2);
        cal.add(Calendar.DATE, 10);

        //Realizando as modificacoes
        d = cal.getTime();

        //Para pegar os minutos , colocamos o valor dentro de uma variavel:
        int minutis = cal.get(Calendar.MINUTE);
        int hours = cal.get(Calendar.HOUR);
        int mes =1 +  cal.get(Calendar.MONTH);

        System.out.println("Minutos : " + minutis +  ". Horas: "  + hours + ". Mes : " + mes );

        System.out.println("Vencimento da proxima parcela: " +  sfd.format(d));

    }
}
