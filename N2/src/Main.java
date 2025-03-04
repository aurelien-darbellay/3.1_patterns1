import Agenda.AgendaManager;
import Agenda.EntriesFactory.Adresses.SpanishAddress;
import Agenda.EntriesFactory.Adresses.SpanishAddressCreator;

public class Main {
    public static void main(String[] args) {
        AgendaManager.start();
        SpanishAddress newAddress = (SpanishAddress) SpanishAddressCreator.createAddress("Aurélien",
                "calle",
                "de la Gran Vista",
                96,
                "Entr",
                1,
                "Escalera B",
                "08032",
                "Barcelona",
                "Barcelona");
        newAddress.printAddress();
    }
}